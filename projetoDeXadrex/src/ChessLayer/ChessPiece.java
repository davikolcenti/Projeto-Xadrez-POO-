package ChessLayer;

import BoardLayer.Piece;
import BoardLayer.Board;
import BoardLayer.Position;

public abstract class ChessPiece extends  Piece {
    protected Color color;
    // Alterado de Integer para int, e nome padronizado
    protected int moveCount;

    public ChessPiece(Board board, Color color ) {
        super(board);
        this.color = color;
        // Inicializa o contador de movimentos
        this.moveCount = 0;
    }

    public Color getColor(){
        return color;
    }
    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount++;
    }

    // Correção: deve decrementar o contador
    public void decreaseMoveCount() {
        moveCount--;
    }

    // Alterado de Throwable para ChessException
    public ChessPosition getChessPosition() throws ChessException {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        Piece p = getBoard().piece(position);
        // Verifica se existe uma peça na posição E se a cor é diferente
        return p != null && ((ChessPiece)p).getColor() != color;
    }
}