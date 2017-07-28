package Zadanie13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mateusz on 2017-07-28.
 */
public class Slownik {

    private Map<String, List<Osoba>> osobyNaStanowisku = new HashMap<>();

    public  Map<String, List<Osoba>> stworzIndeksOsobNaJednymStanowisku(String stanowisko, List<Osoba> listaPracownikow) {
        Map<String, List<Osoba>> templateMap= new HashMap<>();
        templateMap.put(stanowisko, listaPracownikow);
        return templateMap;

    }

    public Map<String, Map<String, List<Osoba>>> stworzGeneralnyIndeksDzialow(String dzial, Map<String, List<Osoba>> indeksStanowisko){

        Map<String, Map<String, List<Osoba>>> mapTemplate = new HashMap<>();
        mapTemplate.put(dzial, indeksStanowisko);
        return mapTemplate;
    }


}
