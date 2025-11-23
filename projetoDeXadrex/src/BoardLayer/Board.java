package BoardLayer;

public class Board {
    // Alterado de Integer para int, pois são dimensões
    private int rows;
    private int columns;
    public Piece[][] matriz;

    public Board (int rows, int columns) {

        if(rows < 1 || columns < 1 ) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        matriz = new Piece[rows][columns];
    }

    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }

    public Piece piece(int row, int column){
        // Adicionada verificação de existência da posição
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board!");
        }
        return matriz[row][column];
    }

    public Piece piece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board!");
        }
        return matriz[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on position " + position);
        }
        matriz[position.getRow()][position.getColumn()] = piece;
        // Atribui a posição à peça
        piece.position = position;
    }

    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        matriz[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        // Chamada direta para a matriz, já que positionExists foi verificada
        return matriz[position.getRow()][position.getColumn()] != null;
    }
}