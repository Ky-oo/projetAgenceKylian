import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceQuadrilatereTest {
    @Test
    public void testSurface() {

        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceQuadrilatere(cuisine, null, 5, 6);

        assertEquals(null, 30, pieceTest.surface(), 0);

    }
}
