package Zadanie7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 2017-07-27.
 */
public class Main {

    public static void main(String[] args) {
        List<String> listanapisow = new ArrayList<>();

        String napis1 = "hohohoh";
        String napis2 = "blebleble";
        String napis3 = "ddddddd";

        listanapisow.add(napis1);
        listanapisow.add(napis2);
        listanapisow.add(napis3);

        for (String i : listanapisow){
            System.out.println(i);
        }
    }
}
