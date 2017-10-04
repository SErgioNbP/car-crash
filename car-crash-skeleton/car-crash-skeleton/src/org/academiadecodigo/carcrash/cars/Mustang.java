package org.academiadecodigo.carcrash.cars;
import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 03/10/2017.
 */
public class Mustang extends Car {


    public Mustang(Position pos){
       super(pos);
    }

    @Override
    public Position getPos() {
        return super.getPos();
    }

    @Override
    public boolean isCrashed() {
        return super.isCrashed();
    }

    @Override
    public String toString() {
        if (isCrashed()) {
            return "C";
        }
        return "M";
    }
}
