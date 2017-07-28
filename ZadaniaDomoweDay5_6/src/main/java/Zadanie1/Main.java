package Zadanie1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Mateusz on 2017-07-22.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime thisDay = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy\\MM\\dd---hh:mm:ss");
        System.out.println(formatter.format(thisDay));
    }
}
