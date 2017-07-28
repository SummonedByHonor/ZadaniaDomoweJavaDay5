package Zadanie10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Mateusz on 2017-07-27.
 */
public class WypisywaczLiter {

    public void wypiszLiteryZNapisu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz imię to literacji:");
        String string = scanner.nextLine();
        Set<String> nameSet = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            nameSet.add(String.valueOf(string.charAt(i)));
        }
        System.out.println("Wszystkie litery występujące w napisie to: " + nameSet);
    }

}
