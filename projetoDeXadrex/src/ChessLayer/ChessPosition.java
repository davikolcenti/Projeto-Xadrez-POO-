package ChessLayer;

import BoardLayer.Position;

public class ChessPosition {
    private char Column;
    private int row; // Mudado de Integer para int

    // Mudança de Throwable para ChessException no construtor
    public ChessPosition(char column, int row) throws ChessException {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.Column = column;
        this.row = row;
    }

    public char getColumn() {
        return Column;
    }

    public int getRow() {
        return row;
    }

    // Converte a posição de xadrez (a1-h8) para a matriz (0-7, 0-7)
    protected Position toPosition() {
        return new Position(8 - row, Column - 'a');
    }

    // Converte a posição da matriz (0-7, 0-7) para a posição de xadrez (a1-h8)
    protected static ChessPosition fromPosition(Position position) throws ChessException {
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + Column + row;
    }
}