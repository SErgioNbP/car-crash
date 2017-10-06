package org.academiadecodigo.carcrash;

/**
 * Created by codecadet on 06/10/2017.
 */
public enum Direction {

    UP("Up"),
    DOWN("Down"),
    LEFT("Left"),
    RIGHT("Right");

    private String direction;

    Direction(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public static Direction getRandomDirection() {
        return Direction.values()[(int) (Math.random() * Direction.values().length)];
    }

    public Direction turnRight() {

        switch (this) {

            case UP:
                return Direction.RIGHT;
            case DOWN:
                return Direction.LEFT;
            case LEFT:
                return Direction.UP;
            case RIGHT:
                return Direction.DOWN;
            default:
                System.out.println("something really bad happened");
                return null;
        }
    }

    public Direction turnLeft() {

        switch (this) {

            case UP:
                return Direction.LEFT;
            case DOWN:
                return Direction.RIGHT;
            case LEFT:
                return Direction.DOWN;
            case RIGHT:
                return Direction.UP;
            default:
                System.out.println("something really bad happened");
                return null;
        }
    }

    public Direction getOppositeDirection() {

        switch (this) {
            case UP:
                return Direction.DOWN;
            case DOWN:
                return Direction.UP;
            case LEFT:
                return Direction.RIGHT;
            case RIGHT:
                return Direction.LEFT;
            default:
                System.out.println("something went wrong");
                return null;
        }
    }
}
