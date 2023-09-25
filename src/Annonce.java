public class Annonce {
    
    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;
    public static final double COEF_NON_HABITABLE = 0.25;


    public Annonce(String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement) {
        this.reference = reference;
        this.date = date;
        this.titre = titre;
        this.prixM2Habitable = prixM2Habitable;
        this.logement = logement;
    }

    public double prix(){
        return logement.surfaceHabitable() * this.prixM2Habitable + logement.surfaceNonHabitable() * prixM2Habitable * COEF_NON_HABITABLE;
    }

    @Override
    public String toString() {

    return titre + "\n Annonce " + reference + " du " + date + "\n " + logement.toString() + "\n - Prix du m² habitable : " + prixM2Habitable + "\n - Prix du m² non habitable " + prixM2Habitable * COEF_NON_HABITABLE + "\n Contact : " + logement.getVendeur().getEmail() + " / " + logement.getVendeur().getNumeroTelephone(); 




    }
    
}
