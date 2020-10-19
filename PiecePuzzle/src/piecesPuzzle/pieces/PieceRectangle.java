package piecesPuzzle.pieces;

import java.util.ArrayList;

public class PieceRectangle implements PiecesPuzzle{

	public int largeurX, longueurY;
	public boolean[][] grid;
	public int rotationActuel;	
	private int x,y;
	
	public PieceRectangle(int x, int y){
		this.x = x;
		this.y = y;
		this.rotationActuel = 0;
	}
	
	public PieceRectangle(int x, int y, int rotation){
		this.x = x;
		this.y = y;
		this.rotationActuel = rotation;
	}

	/**
	 * Créer la grille de la pièce
	 */
	public void pieceGrid(){
		choiceRotation(this.rotationActuel);
	}
	
	public void pieceGrid(int rotationNum){
		grid = new boolean[largeurX][longueurY];
		for(int i = 0 ; i < largeurX ; i++) {
			for(int j= 0 ; j < longueurY ; j++) {
				grid[i][j]=true;
				//System.out.print("true");
			}
			//System.out.println();
		}
	}

	/**
	 * Permet de changer la longuer/largeur de la pièce, changer le grille de la pièce,ainsi que de prévenir l'observeur qu'il ya un changement de rotation
	 * @param rotationNum 
	 */
	public void choiceRotation(int rotationNum) {
		if(this.rotationActuel == 0 || this.rotationActuel == 2){
			this.largeurX = x;
			this.longueurY = y;
		}else if(this.rotationActuel == 1 || this.rotationActuel == 3){
			this.largeurX = y;
			this.longueurY = x;
		}
		pieceGrid(rotationNum);
		
	}

	public boolean[][] getGrid() {
		return this.grid;
	}

	public int getLargeurX() {
		return this.largeurX;
	}

	public int getLongueurY() {
		return this.longueurY;
	}
}