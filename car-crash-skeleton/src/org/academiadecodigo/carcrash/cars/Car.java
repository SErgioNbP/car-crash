package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Directions;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed;
    private int speed;
    private Directions previousDirection;
    private Directions currentDirection;

    public Car(Position pos) {
        this.pos = pos;

    }

    public void move() {

        if (!isCrashed()) {

            currentDirection = Directions.values()[(int) Math.floor(Math.random() * Directions.values().length)];

            if (currentDirection == previousDirection) {
                move();
                return;
            }

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

            previousDirection = currentDirection;
        }
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }
}
