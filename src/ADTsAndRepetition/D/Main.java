package ADTsAndRepetition.D;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Square> squares = new ArrayList<>();

        Square square1 = new Square(10,10);
        Square square2 = new Square(48,22);
        Square square3 = new Square(30,12);

        squares.add(square1);
        squares.add(square2);
        squares.add(square3);

        System.out.println(squares);

        Collections.sort(squares);

        System.out.println(squares);


    }
}
