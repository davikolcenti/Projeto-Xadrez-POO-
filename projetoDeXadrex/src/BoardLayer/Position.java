package BoardLayer;

public class Position {
    protected int row;
    protected int column;

    public Position(int row, int column) {
        this.row=row;
        this.column=column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString(){
        return "( "+ row +" , " + column + ")";
    }

    // Correção: Este método é essencial para atualizar a posição
    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }
}