package Zadanie8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 2017-07-27.
 */
public class Main {

    public static void main(String[] args) {
        ListCreator object = new ListCreator();

        List<Integer> listOfNumbers = object.createList();
        object.writeTheHighestNumber(listOfNumbers);
    }
}
