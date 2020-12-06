package piecesPuzzle.pieces;

/**
 *
 * @author Alexandre BELLEBON - Auréline DEROIN - Clémentine LEROY - Léo VINCENT
 */
public class PieceRectangle extends AbstractPiece{
	
    /**
     * Constructeur (rotation 0 par défaut)
     * @param x
     * @param y
     */
    public PieceRectangle(int x, int y){
		super(x,y,0);
	}
	
    /**
     * Constructeur
     * @param x
     * @param y
     * @param rotation
     */
    public PieceRectangle(int x, int y, int rotation){
		super(x,y,rotation);
	}
	
	@Override
	public void pieceGrid(){
		grid = new boolean[largeurXActuel][longueurYActuel];
		for(int i = 0 ; i < largeurXActuel ; i++) {
			for(int j= 0 ; j < longueurYActuel ; j++) {
				grid[i][j]=true;
			}
		}
	}

	//Couleur violet
	@Override
	public String getColor() {
		return "\u001B[35m";
	}
}