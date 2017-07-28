package Zadanie2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Mateusz on 2017-07-22.
 */
public class Main {
    LocalDateTime dateTime = LocalDateTime.now();
    LocalDateTime dateTime2 = LocalDateTime.of(1990,05,17,19,22);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy\\MM\\dd---hh:mm:ss");


    public void ktoraDataWczesniejsza(LocalDateTime dateTime, LocalDateTime dateTime2){
        if (dateTime.isBefore(dateTime2))
        {
            System.out.println("Data " + formatter.format(dateTime) + " jest wczesniejsza.");
        }else {
            System.out.println("Data " + formatter.format(dateTime2) + " jest wczesniejsza.");
        }
    }

    public static void main(String[] args) {
        Main data = new Main();
        data.ktoraDataWczesniejsza(data.dateTime, data.dateTime2);
    }
}
