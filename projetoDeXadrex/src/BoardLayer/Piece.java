package BoardLayer;

public class Piece {

    private Board board;
    public Piece (Board board){
        this.board = board;
    }

    protected Board getBoard(){
        return board;
    }
}
