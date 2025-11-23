package ChessLayer;

public class ChessPosition {
	protected char Column;
	protected Integer row;

	
	position toPosition() {
		Position MyPosition = new Position(this.row, this.Column);
		return MyPosition;
	}
	
	ChessPosition fromPosition(position Position){
	
	}
}

