public class Appartement extends BienImmobilier {

    private String etage;
    private boolean ascenseur;


    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage, boolean ascenseur) {
        super(rue, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = ascenseur;
    }

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(rue, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = false;
    }

    public String typeBien(){
        int t = 0;
        for (Piece piece : getPieces()) {
            if(piece.getTypePiece().isPiece()){
                t += 1;
            }
            
        }
        if(t <= 7){
            return "T" + t;
        } else {
            return "T7+";
        }       
    }

    @Override
    public String toString() {
        String resultat ="";
        resultat = "Appartement de type "+ typeBien();
        if(ascenseur){
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + etage + " ";
        resultat += super.toString();
        return resultat;
    }

}
