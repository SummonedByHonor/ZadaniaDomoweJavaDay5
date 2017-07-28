package Zadanie9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mateusz on 2017-07-27.
 */
public class Names {

    public static void uniqueNamesListCreator() {
        String tempName = "";
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = new ArrayList<>();
        do {
            System.out.println("Podaj imię:");
            tempName = scanner.nextLine();
            if(tempName.equals("exit")){
                System.exit(0);
            } else if  (namesList.contains(tempName)) {
                System.out.println("Takie imię już istnieje!");
            }else if (!(namesList.contains(tempName))){
                namesList.add(tempName);
                System.out.println("Imię " + tempName + "zostało dodane do listy!");
            }
        } while (tempName != "exit");
    }

}
