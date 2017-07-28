package Zadanie8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mateusz on 2017-07-27.
 */
public class ListCreator {

    public List<Integer> createList(){
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        int numberScanner;
        do {
            System.out.println("Wprowadź liczbę:");
            System.out.println("Liczba: " + (numberScanner = scanner.nextInt()));
            listOfNumbers.add(numberScanner);
        }while (numberScanner != -1);
            return listOfNumbers;
    }

    public void writeTheHighestNumber(List<Integer> list){
        int counter = 0;
        for (int number : list){
            if(number >= counter){
                counter = number;
            }
        }
        System.out.println("Najwyższa liczba z podanej listy to: " + counter);
    }

}
