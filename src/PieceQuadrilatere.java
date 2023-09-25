public class PieceQuadrilatere extends Piece {


    private double longueur;
    private double largeur;


   

    public PieceQuadrilatere(TypePiece typePiece, String niveau, double longueur, double largeur) {
        super(typePiece, niveau);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface(){
        return this.longueur * this.largeur;
    }


    
}
