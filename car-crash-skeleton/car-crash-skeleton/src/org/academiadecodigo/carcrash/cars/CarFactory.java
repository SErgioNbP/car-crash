package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {


    public static Car getNewCar(Position pos) {


        if ((int)Math.floor(Math.random() * 2) == 0){
            return new Fiat(pos);
        } else {
            return new Mustang(pos);
        }
    }
}
