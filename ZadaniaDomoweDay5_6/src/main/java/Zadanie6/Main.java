package Zadanie6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Mateusz on 2017-07-26.
 */
public class Main {

    public static <T> void returnRandomLoot(T[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        System.out.println(array[index]);
    }

    public static void main(String[] args) {
        LootBox lootBox = new LootBox();
        Object ggg = new LootBox<>();

        LootBox<String> lootNapis1 = new LootBox<>();
        lootNapis1.setLootObject("Jestem lootem 1!");
        LootBox<String> lootNapis2 = new LootBox<>();
        lootNapis2.setLootObject("Numer 2 też nienajgorszy!");
        LootBox<String> lootNapis3 = new LootBox<>();
        lootNapis3.setLootObject("Loocik z napisami - bramka numer 3!");

        LootBox<Integer> lootInteger1 = new LootBox<>();
        lootInteger1.setLootObject(12);
        LootBox<Integer> lootInteger2 = new LootBox<>();
        lootInteger2.setLootObject(666);
        LootBox<Integer> lootInteger3 = new LootBox<>();
        lootInteger3.setLootObject(15100900);

        List<LootBox> listaobiektow = new ArrayList<>();
        listaobiektow.add(lootNapis1);
        listaobiektow.add(lootNapis2);
        listaobiektow.add(lootNapis3);
        listaobiektow.add(lootInteger1);
        listaobiektow.add(lootInteger2);
        listaobiektow.add(lootInteger3);

        for (LootBox lootBoxik : listaobiektow) {
            System.out.println(lootBoxik.getLootObject());
        }

        String[] tablicaObiektow = {lootInteger1.getLootObject().toString(), lootInteger2.getLootObject().toString(), lootInteger3.getLootObject().toString(),
                lootNapis1.getLootObject().toString(), lootNapis2.getLootObject().toString(), lootNapis3.getLootObject().toString()};

        returnRandomLoot(tablicaObiektow);
        returnRandomLoot(tablicaObiektow);
        returnRandomLoot(tablicaObiektow);
        returnRandomLoot(tablicaObiektow);


    }

}
