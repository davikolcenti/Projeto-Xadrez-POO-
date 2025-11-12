package ChessLayer;

import BoardLayer.*;

public void public class ChessPiece extends  Piece {
	protected Color color;
	protected Integer MoveCount;

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


