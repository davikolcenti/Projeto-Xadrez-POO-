package BoardLayer;

public class Board {
    private Integer row;
    private Integer column;
    public Piece[][] matriz;

    public Board (int row, int column){
        this.row = row;
        this.column = column;
        matriz = new Piece[row][column];
    }

}
