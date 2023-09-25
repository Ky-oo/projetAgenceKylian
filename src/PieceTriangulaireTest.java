import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceTriangulaireTest {
    @Test
    public void testSurface() {

        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceTriangulaire(cuisine, null, 5, 6);

        assertEquals(null, 15, pieceTest.surface(), 0);

    }
}
