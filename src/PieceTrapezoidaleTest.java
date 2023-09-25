import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceTrapezoidaleTest {

    @Test
    public void testSurface() {

        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceTrapezoidale(cuisine, null, 5, 6, 2.5);

        assertEquals(null, 37.5, pieceTest.surface(), 0);

    }
}
