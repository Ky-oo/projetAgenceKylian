import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class PieceTrapezoidaleTest {

    @Test
    public void testSurfacePieceTrapezoidaleBaseBas5BaseHaut6Hauteur25() {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        Piece pieceTest = new PieceTrapezoidale(cuisine, null, 5, 6, 2.5);

        assertEquals( "37,50", numberFormat.format(pieceTest.surface()));

    }
}
