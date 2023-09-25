import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class PieceQuadrilatereTest {
    @Test
    public void testSurfacePieceQuadrilatereLongeur5Largeur6() {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceQuadrilatere(cuisine, null, 5, 6);

        assertEquals("30,00", numberFormat.format(pieceTest.surface()));

    }
}
