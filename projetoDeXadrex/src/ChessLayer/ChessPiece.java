package ChessLayer;

import BoardLayer.*;

public abstract class ChessPiece extends Piece {
	protected Color color;
	protected Integer MoveCount;
	  
	public ChessPosition getChessPosition();
	
	private boolean isThereOpponentPiece(Position position);
	
	private void increaseMoveCount() {
		MoveCount=MoveCount+1;
	}
	
	private void decreaseMoveCount() {
		MoveCount=MoveCount-1;
	}
}




