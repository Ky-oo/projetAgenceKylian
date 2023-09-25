import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class PieceParallelogrammeTest {
    @Test
    public void testSurfacePieceParallelogrammeBase5Hauteur10() {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceParallelogramme(cuisine, null, 5, 10);

        assertEquals("50,00", numberFormat.format(pieceTest.surface()));

    }
}
