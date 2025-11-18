package ChessLayer;

import BoardLayer.Position;

public class ChessPosition {
	protected char Column;
	protected Integer row;

	
	Position toPosition() {
		Position MyPosition = new Position(this.row, this.Column);
		return MyPosition;
	}
	
	ChessPosition fromPosition(Position Position){
	return null;
	}
}

