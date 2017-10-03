package org.academiadecodigo.carcrash.field;
public class Position {

    private int col;
    private int row;
    private int speed = 2;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void moveLeft() {
        if (col > 0) {
            col -= speed;
        }
    }

    public void moveRight() {
        if (col < Field.width - 1) {
            col += speed;
        }
    }

    public void moveUp() {
        if (row > 0) {
            row -= speed;
        }
    }

    public void moveDown() {
        if (row < Field.height - 1) {
            row += speed;
        }
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

}
