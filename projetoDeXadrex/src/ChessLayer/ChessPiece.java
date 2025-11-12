package ChessLayer;

import BoardLayer.*;

public abstract class ChessPiece extends Piece {
	protected Color color;
	protected Integer MoveCount;
	  
	public ChessPosition getChessPosition;
	
	private boolean isThereOpponentPiece;
	
	private void increaseMoveCount;
	
	private void decreaseMoveCount;

    public ChessPiece(Board board) {
        super(board);
    }

    public abstract boolean possibleMoves();
}




