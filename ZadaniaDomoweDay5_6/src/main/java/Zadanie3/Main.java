package Zadanie3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Mateusz on 2017-07-22.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Africa/Juba"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Katmandu"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy\\MM\\dd---hh:mm:ss");
        System.out.println(formatter.format(localDateTime));
        System.out.println(formatter.format(zonedDateTime));
        System.out.println(formatter.format(zonedDateTime2));
    }
}
