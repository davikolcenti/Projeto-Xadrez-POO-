package BoardLayer;

public abstract class Piece {

    // Alterado de protected para public para ser acessível diretamente pela subclasse ChessPiece
    public Position position;
    private Board board;

    public Piece (Board board){
        this.board = board;
        position = null;
    }

    protected Board getBoard(){
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position){
        // Valida se a posição destino é um movimento possível
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {

        boolean[][] mat = possibleMoves();
        for (int i=0; i < mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) { // Usar mat[0].length para colunas para garantir que a dimensão correta seja usada
                if(mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}