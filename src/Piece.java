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
        return TypePiece.getNom() + " surface :" + surface() + "m²\n" ;
    }

    
    
}

