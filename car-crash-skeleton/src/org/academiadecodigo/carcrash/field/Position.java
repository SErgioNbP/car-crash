package org.academiadecodigo.carcrash.field;


public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void moveLeft() {
        if (col == 0) {
            col = col;
        }
        col -= 1;
    }

    public void moveRight() {
        if (col == Field.width - 1) {
            col -= 1;
        }
        col += 1;
    }

    public void moveUp() {
        if (row == 0) {
            row += 1;
        }
        row -= 1;
    }

    public void moveDown() {
        if (row == Field.height - 1) {
            row -= 1;
        }
        row += 1;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
