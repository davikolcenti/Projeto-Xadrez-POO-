package ChessLayer;

import BoardLayer.Piece;

public class ChessMatch {

	private int turn;
	private Color currentPlayer;
	private boolean Check;
	private boolean Checkmate;
	private Piece enPassantVulnerable;
	private ChessPiece promoted;
	
	public Piece[][] getPieces(){
		return null;
	}
	
	public boolean[][] possibleMoves(ChessPosition sourcePosition){
		return null;
	}
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
		return null;
	}
	
	ChessPiece replacePromotedPiece(String type) {
		return null;
	}
	
}
