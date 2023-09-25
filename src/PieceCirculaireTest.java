import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceCirculaireTest {
    @Test
    public void testSurface() {
        
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceCirculaire(cuisine, null, 5);

        assertEquals(null, 15.707963267948966, pieceTest.surface(), 0);

    }
}
