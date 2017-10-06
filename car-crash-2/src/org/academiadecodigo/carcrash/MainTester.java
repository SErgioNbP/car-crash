package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 06/10/2017.
 */
public class MainTester {

    public static void main(String[] args) {

        Field.init(10,10);

        System.out.println("creating position..");
        Position p = new Position(0, 0);
        System.out.println("col should be 0, row should be 0");
        System.out.println("col: " + p.getCol() + " | row: " + p.getRow());


        // testing col < 0
        System.out.println("Left...");
        p.moveLeft();
        System.out.println("should be 0,0... Position is " + p.toString());

        // testing row < 0
        System.out.println("Up...");
        p.moveUp();
        System.out.println("should be 0,0... Position is " + p);

        // testing col > Field.width
        for(int i = 0; i < Field.width + 1; i++) {
            System.out.println("Right...");
            p.moveRight();
            System.out.println("position is " + p);
        }
        System.out.println("position should be 9,0. Position is " + p);

        // testing row > Field.height
        for(int i = 0; i < Field.height + 1; i++) {
            System.out.println("Down...");
            p.moveDown();
            System.out.println("position is " + p);
        }
        System.out.println("position should be 9,0. Position is " + p);

    }



}
