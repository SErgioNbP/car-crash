package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;
    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar(new Position((int) Math.floor(Math.random() * Field.width), (int) Math.floor(Math.random() * Field.height)));
        }

        Field.draw(cars);
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }
    }

    private void moveAllCars() {
        for (int i = 0; i < cars.length; i++) {
            cars[i].move();
        }

        checkCollision();
    }

    private void checkCollision() {

        for (int i = 0; i < cars.length; i++) {

            for (int j = 0; j < cars.length; j++) {

                if (cars[i] != cars[j]) {
                    if (cars[i].getPos().getRow() == cars[j].getPos().getRow() && cars[i].getPos().getCol() == cars[j].getPos().getCol()) {
                        cars[i].crashed();
                        cars[j].crashed();
                    }
                }
            }
        }
    }
}
