import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class PieceCirculaireTest {
    @Test
    public void testSurfacePieceCirculaireRayon5() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceCirculaire(cuisine, null, 5);

        assertEquals("15,71", numberFormat.format(pieceTest.surface()));

    }
}
