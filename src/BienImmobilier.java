import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {
    
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    private ArrayList<Piece> pieces;


    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        this.pieces	= new ArrayList<Piece>();
    }

    public double surfaceHabitable(){
        double surfaceHabitable = 0;
        for (Piece piece : pieces) {
            if (piece.getTypePiece().isSurfaceHabitable()){
                surfaceHabitable += piece.surface();
        } 
    }
        return surfaceHabitable;
    }

    public double surfaceNonHabitable(){
        double surfaceNonHabitable =  0;
        for (Piece piece : pieces) {
            if (piece.getTypePiece().isSurfaceHabitable() == false){
                surfaceNonHabitable += piece.surface();
        }
    }
        return surfaceNonHabitable;
    }

    public void ajouterPiece(Piece piece){
        this.pieces.add(0, piece);
    }

    public Vendeur getVendeur(){
        return this.vendeur;
    }

    public ArrayList<Piece> getPieces(){
        return pieces;
    }

    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " +rue +" " + codePostal+ " " + ville + 
        "\n \n Description du bien : \n" +
        pieces.toString()  +  
        "\nPour une surface habitable de : " + 
        numberFormat.format(surfaceHabitable())+ 
        " m2 et une surface non habitable de : " + 
        numberFormat.format(surfaceNonHabitable())+" m2.";
    }

}
