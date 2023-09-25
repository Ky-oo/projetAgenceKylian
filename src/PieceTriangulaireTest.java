import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class PieceTriangulaireTest {
    @Test
    public void testSurfacePieceTriangulaireBase5Haueur6() {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceTriangulaire(cuisine, null, 5, 6);

        assertEquals("15,00", numberFormat.format(pieceTest.surface()));

    }
}
