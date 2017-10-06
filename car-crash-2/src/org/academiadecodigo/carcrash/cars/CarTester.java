package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Direction;
import org.academiadecodigo.carcrash.field.Field;

/**
 * Created by codecadet on 06/10/2017.
 */
public class CarTester {

    public static void main(String[] args) {

        Field.init(50,25);

        Car c = new Car(2,10,10);

        c.setDirection(Direction.RIGHT);

        System.out.println(c.getPos());
        c.move();
        System.out.println(c.getPos());
    }
}
