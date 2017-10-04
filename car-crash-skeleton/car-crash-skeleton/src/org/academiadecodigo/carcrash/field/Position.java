package org.academiadecodigo.carcrash.field;
public class Position {

    private int col;
    private int row;


    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void moveLeft() {
            col -= 1;
    }

    public void moveRight() {
            col += 1;
    }

    public void moveUp() {
            row -= 1;
    }

    public void moveDown() {
            row += 1;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }



}
