package Zadanie12;

import java.util.Map;

/**
 * Created by Mateusz on 2017-07-28.
 */
public class Main {

    public static void main(String[] args) {
        NamesMapCreator namesMapCreator = new NamesMapCreator();
        Map<String, Integer> mapOfUsers = namesMapCreator.fillUsersMap();
        namesMapCreator.showMapOfUsers(mapOfUsers);
    }
}
