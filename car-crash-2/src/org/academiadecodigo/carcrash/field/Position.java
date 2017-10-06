package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.Direction;

public class Position {

    private int col;
    private int row;


    public Position() {
        this.col = (int) (Math.random() * Field.width);
        this.row = (int) (Math.random() * Field.height);
    }

    public Position(int col, int row) {

        if (col > Field.width - 1) {
            col = Field.width - 1;
        }

        if (col < 0) {
            col = 0;
        }

        if (row > Field.height - 1) {
            row = Field.height - 1;
        }

        if (row < 0) {
            row = 0;
        }

        this.col = col;
        this.row = row;
    }


    public void moveUp() {

        if (row <= 0) {
            row = 0;
            return;
        }

        row--;
    }

    public void moveDown() {

        if (row >= Field.height - 1) {
            row = Field.height - 1;
            return;
        }

        row++;
    }

    public void moveLeft() {

        if (col <= 0) {
            col = 0;
            return;
        }

        col--;
    }

    public void moveRight() {

        if (col >= Field.width - 1) {
            col = Field.width - 1;
            return;
        }

        col++;
    }


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "col: " + col + " | row: " + row;
    }

    public boolean isOnEdge(Direction direction) {

         return col == 0 && direction == Direction.LEFT ||
                col == Field.width - 1 && direction == Direction.RIGHT ||
                row == 0 && direction == Direction.UP ||
                row == Field.height - 1 && direction == Direction.DOWN;
    }
}
