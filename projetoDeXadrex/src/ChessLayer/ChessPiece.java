package ChessLayer;

import BoardLayer.*;

public  void/*verificar se é realmente abstrata*/class ChessPiece extends Piece {
	protected Color color;
	protected Integer MoveCount;
	
	//ChessPosition é interpretado como um tipo... 
	public ChessPosition getChessPosition() {
		return null;
		
	}
	
	public boolean isThereOpponentPiece(Position position) {
		return false;
		//provavelmente é interface;
	}
	
	public void increaseMoveCount() {
		//provavelmente é interface;
	}
	
	public void decreaseMoveCount() {
		//provavelmente é interface;
	}
}


