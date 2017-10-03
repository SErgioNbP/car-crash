package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {


    public static Car getNewCar(Position pos) {

        return new Fiat(pos);


    }
}
