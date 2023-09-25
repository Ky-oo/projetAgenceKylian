import java.text.DecimalFormat;

public class Maison extends BienImmobilier{

    private double surfaceTerrain;
    private boolean piscine;


    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain,
            boolean piscine) {
        super(rue, ville, codePostal, vendeur);
        this.surfaceTerrain = surfaceTerrain;
        this.piscine = piscine;
    }

    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain) {
        super(rue, ville, codePostal, vendeur);
        this.surfaceTerrain = surfaceTerrain;
        this.piscine = false;
    }

    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");        
        String resultat ="";
        resultat = "Maison individuelle ";
        resultat += "avec son terrain de " + numberFormat.format(surfaceTerrain) + "m2";
        if(piscine){
            resultat += " et sa piscine";
        }
        resultat += ". " + super.toString();
        return resultat;
    }
  
    
}
