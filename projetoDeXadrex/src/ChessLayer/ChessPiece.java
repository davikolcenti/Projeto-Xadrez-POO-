package ChessLayer;

import BoardLayer.*;

public  void/*verificar se é realmente abstrata*/class ChessPiece extends Piece {
	protected Color color;
	protected Integer MoveCount;
	
	//ChessPosition é interpretado como um tipo... 
	public ChessPosition getChessPosition() {
		return null;
		
	}
	
	private boolean isThereOpponentPiece(Position position) {
		return false;
	}
	
	private void increaseMoveCount() {
		MoveCount=MoveCount+1;
	}
	
	private void decreaseMoveCount() {
		MoveCount=MoveCount-1;
	}
}



