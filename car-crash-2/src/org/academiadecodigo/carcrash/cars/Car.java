package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Direction;
import org.academiadecodigo.carcrash.field.Position;

public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;

    private int speed;
    private Direction direction;


    public Car(int speed, int col, int row) {
        this.pos = new Position(col, row);
        this.speed = speed;
        this.direction = Direction.getRandomDirection();

    }

    public Car(int speed) {
        this.pos = new Position();
        this.speed = speed;
        this.direction = Direction.getRandomDirection();

    }


    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {

        changeDirection();

        moveInDirection();

    }

    private void changeDirection() {

        if (pos.isOnEdge(direction)) {
            direction = direction.getOppositeDirection();
            return;
        }

        float probChangingDir = 0.8f;

        if (Math.random() < probChangingDir) {
            return;
        }

        if (Math.random() > 0.5) {
            // turn left
            direction = direction.turnLeft();
        } else {
            // turn right
            direction = direction.turnRight();
        }
    }

    private void moveInDirection() {

        for (int i = 0; i < speed; i++) {

            switch (this.direction) {
                case DOWN:
                    pos.moveDown();
                    break;
                case LEFT:
                    pos.moveLeft();
                    break;
                case RIGHT:
                    pos.moveRight();
                    break;
                case UP:
                    pos.moveUp();
                    break;

            }
        }
    }

    @Override
    public String toString() {
        return "C";
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }

}
