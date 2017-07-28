package Zadanie6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Mateusz on 2017-07-26.
 */
public class LootBox<T> {

    private T lootObject;
    private List<T> listOfObjects = new ArrayList<T>();

    public void setLootObject(T lootObject) {
        this.lootObject = lootObject;
    }

    public T getLootObject() {
        return lootObject;
    }

    public static <T> void printArray(T[] arrayOfSome) {
        for (T t : arrayOfSome) {
            System.out.println(t);
        }
    }


    }
