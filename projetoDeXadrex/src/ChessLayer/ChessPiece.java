package ChessLayer;

import BoardLayer.*;

public abstract class ChessPiece extends  Piece {
	protected Color color;
	protected Integer MoveCount;

    public ChessPiece(Board board) {
        super(board);
    }

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


