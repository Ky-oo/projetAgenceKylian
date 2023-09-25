public class PieceTrapezoidale extends Piece {

    private double baseBas;
    private double baseHaut;
    private double hauteur;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, double baseBas, double baseHaut, double hauteur) {
        super(typePiece, niveau);
        this.baseBas = baseBas;
        this.baseHaut = baseHaut;
        this.hauteur = hauteur;
    }

    public double surface(){
        return ((this.baseBas * this.baseHaut) * this.hauteur) * 0.5;
    }


    
}
