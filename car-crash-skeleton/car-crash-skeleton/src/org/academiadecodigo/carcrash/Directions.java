package org.academiadecodigo.carcrash;

/**
 * Created by codecadet on 03/10/2017.
 */
public enum Directions {
    LEFT,
    RIGHT,
    UP,
    DOWN;

    public static Directions getRandomDirection(){

        return Directions.values()[(int) Math.floor(Math.random() * Directions.values().length)];
    }

}
