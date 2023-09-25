import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class AnnonceTest {
    @Test
    public void testPrixMaison() {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Vendeur vendeur = new Vendeur("Patry", "Kylian", "Kylian.test@test.fr", "0606060606");
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece salon = new TypePiece(TypePiece.SALON, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        TypePiece Wc = new TypePiece(TypePiece.WC, true, false);
        TypePiece Garage = new TypePiece(TypePiece.GARAGE, false, false);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);

        BienImmobilier testAnnonceMaison = new Maison("4 rue test", "Annecy", "74000", vendeur, 500);
        
        testAnnonceMaison.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        testAnnonceMaison.ajouterPiece(new PieceQuadrilatere(chambre, "0", 5, 3));
        testAnnonceMaison.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 7));
        testAnnonceMaison.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        testAnnonceMaison.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));
        testAnnonceMaison.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        testAnnonceMaison.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        testAnnonceMaison.ajouterPiece(new PieceQuadrilatere(Garage, "-1", 4, 3));

        Annonce testAnnonce = new Annonce("A0514532FS", "25/09/2023", "Grande maison Test", 250, testAnnonceMaison);

        String prixAnnonceTest = numberFormat.format(testAnnonce.prix());
        assertEquals("19186,84", prixAnnonceTest);
    }
}
