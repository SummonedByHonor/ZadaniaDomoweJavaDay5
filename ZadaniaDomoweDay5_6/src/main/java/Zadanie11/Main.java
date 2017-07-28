package Zadanie11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mateusz on 2017-07-27.
 */
public class Main {

    public static void main(String[] args) {
        Map<String,Integer> userMap = new HashMap<>();
        userMap.put("Mateusz Deptuła", 30);
        userMap.put("Fredek Zgredek", 20);
        userMap.put("Ziomek Poziomek", 35);
        userMap.put("Jagienka Ziober", 55);
        userMap.put("Anna Majek", 18);

        System.out.println(userMap);

    }
}
