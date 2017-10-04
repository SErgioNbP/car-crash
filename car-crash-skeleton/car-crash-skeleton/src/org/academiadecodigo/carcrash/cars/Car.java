package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Directions;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed;
    private Directions currentDirection;


    public Car(Position pos) {
        this.pos = pos;

        currentDirection = Directions.getRandomDirection();

    }

    public void move() {

        if (isCrashed()) {
            return;
        }

        // escolher uma direccao
        chooseDirection();

        // mover nessa direccao
        switch (currentDirection) {
            case LEFT:
                pos.moveLeft();
                break;
            case RIGHT:
                pos.moveRight();
                break;
            case UP:
                pos.moveUp();
                break;
            case DOWN:
                pos.moveDown();
                break;
        }

    }

    private void chooseDirection() {

        // ver se esta numa borda, se sim, escolher uma nova direccao

        // Left()
        if (pos.getCol() == 0 && currentDirection == Directions.LEFT) {
            currentDirection = Directions.RIGHT;
            return;
        }

        // Right()
        if (pos.getCol() == Field.width - 1 && currentDirection == Directions.RIGHT) {
            currentDirection = Directions.LEFT;
            return;
        }

        // Up()
        if (pos.getRow() == 0 && currentDirection == Directions.UP) {
            currentDirection = Directions.DOWN;
            return;
        }

        // Down()
        if (pos.getRow() == Field.height - 1 && currentDirection == Directions.DOWN) {
            currentDirection = Directions.UP;
            return;
        }


        // se nao..
        // grande parte das vezes, nao mudar de direccao
        // mas uma pequena parte das vezes, muda para a esquerda/direita

        if (currentDirection == Directions.LEFT) {

            if ((int) Math.floor(Math.random() * 100) > 10) {
                return;
            }

            if ((int) Math.floor(Math.random() * 100) <= 5) {
                currentDirection = Directions.UP;
                return;
            }

            currentDirection = Directions.DOWN;
            return;

        }

        if (currentDirection == Directions.RIGHT) {

            if ((int) Math.floor(Math.random() * 100) > 10) {
                return;
            }

            if ((int) Math.floor(Math.random() * 100) <= 5) {
                currentDirection = Directions.DOWN;
                return;
            }

            currentDirection = Directions.UP;
            return;
        }

        if (currentDirection == Directions.UP) {

            if ((int) Math.floor(Math.random() * 100) > 10) {
                return;
            }

            if ((int) Math.floor(Math.random() * 100) <= 5) {
                currentDirection = Directions.LEFT;
                return;
            }

            currentDirection = Directions.RIGHT;
            return;
        }

        if (currentDirection == Directions.DOWN) {

            if ((int) Math.floor(Math.random() * 100) > 10) {
                return;
            }

            if ((int) Math.floor(Math.random() * 100) <= 5) {
                currentDirection = Directions.RIGHT;
                return;
            }

            currentDirection = Directions.LEFT;
            return;
        }
    }


    public boolean equals(Position position) {
        return pos.getCol() == position.getCol() &&
                pos.getRow() == position.getRow();
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void crashed() {
        crashed = true;
    }
}

