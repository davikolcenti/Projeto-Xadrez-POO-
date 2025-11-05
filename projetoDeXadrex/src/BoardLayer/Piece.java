package BoardLayer;


public abstract class Piece {
	
	Position position() {
		return null;
		//provavelmente é interface;
	}
	
	public abstract boolean possibleMoves();
	
	public boolean possibleMove(Position position) {
		return false;
		
	}
	
	public boolean isTherePossibleMoves() {
		return false;
		
	}
	
	

}
