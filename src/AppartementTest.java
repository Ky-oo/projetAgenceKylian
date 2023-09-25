import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppartementTest {
    @Test
    public void testTypeBien4Pieces1NonPiece() {

        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece salon = new TypePiece(TypePiece.SALON, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        
        Appartement testAppart = new Appartement("4 rue test", "Annecy", "74000", null, "2", false);
        
        testAppart.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        testAppart.ajouterPiece(new PieceQuadrilatere(chambre, "0", 5, 3));
        testAppart.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 7));
        testAppart.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        testAppart.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));

        assertEquals("T4", testAppart.typeBien());



    }
}
