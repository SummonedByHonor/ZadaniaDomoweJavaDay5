package Zadanie12;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mateusz on 2017-07-28.
 */
public class NamesMapCreator {

   public Random random = new Random();
   public int intValue;
   private Map<String, Integer> usersMap = new HashMap<>();

   public Map<String,Integer> fillUsersMap(){
       Scanner scanner = new Scanner(System.in);
       String name = "";
       System.out.println("Wpisz imiona użytkowników:");

       do {
           name = scanner.nextLine();
           if(name.equals("exit")){
               break;
           } else {
               intValue = random.nextInt(50);
               usersMap.put(name, intValue);
           }
       }while (!(name.equals("exit")));
       return usersMap;
   }

   public void showMapOfUsers(Map<String, Integer> mapTemplate){
       System.out.println("Lista Użytkowników:");
       int counter = 1;
       for(Map.Entry<String,Integer> entry : mapTemplate.entrySet()){
           System.out.println(counter + ". " + entry.getKey() + ", lat " + entry.getValue());
           counter++;
       }
   }

}
