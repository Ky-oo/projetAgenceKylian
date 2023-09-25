import java.text.DecimalFormat;

public abstract class Piece {

    private TypePiece TypePiece;
    private String niveau;


    public Piece(TypePiece typePiece, String niveau) {
        TypePiece = typePiece;
        this.niveau = niveau;
    }


    public TypePiece getTypePiece() {
        return TypePiece;
    }


    public String getNiveau() {
        return niveau;
    }
    
    public abstract double surface();


    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return TypePiece.getNom() + " surface :" + numberFormat.format(surface()) + "m²\n" ;
    }

    
    
}

