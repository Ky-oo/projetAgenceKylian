import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceParallelogrammeTest {
    @Test
    public void testSurface() {

        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceParallelogramme(cuisine, null, 5, 10);

        assertEquals(null, 50.0, pieceTest.surface(), 0);

    }
}
