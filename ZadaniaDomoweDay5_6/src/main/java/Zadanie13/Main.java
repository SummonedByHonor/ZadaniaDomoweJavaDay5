package Zadanie13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mateusz on 2017-07-28.
 */
public class Main {

    public static void main(String[] args) {
        Slownik slownik = new Slownik();

        List<Osoba> listaPracownikowMlodszyMagazynier = new ArrayList<>();
        listaPracownikowMlodszyMagazynier.add(new Osoba("Maciej", "Kowalski", 35));
        listaPracownikowMlodszyMagazynier.add(new Osoba("Antek", "Białek", 16));
        listaPracownikowMlodszyMagazynier.add(new Osoba("Tomek", "Tomkowski", 45));
        listaPracownikowMlodszyMagazynier.add(new Osoba("Zenon", "Martyniuk", 55));
        listaPracownikowMlodszyMagazynier.add(new Osoba("Janusz", "Polak", 60));

        List<Osoba> listaPracowynikowMagazynier = new ArrayList<>();
        listaPracowynikowMagazynier.add(new Osoba("Adam", "Adamczyk", 20));
        listaPracowynikowMagazynier.add(new Osoba("Piotr", "Piotrowski", 25));
        listaPracowynikowMagazynier.add(new Osoba("Anna", "Strongarm", 20));

        List<Osoba> listaPracownikowKsiegowosc = new ArrayList<>();
        listaPracownikowKsiegowosc.add(new Osoba("Jagna", "Lowka", 28));
        listaPracownikowKsiegowosc.add(new Osoba("Sylwia", "Strzałkowska", 32));

        List<Osoba> listaPracownikowKadry = new ArrayList<>();
        listaPracownikowKadry.add(new Osoba("Artur", "Leniwski", 24));
        listaPracownikowKadry.add(new Osoba("Aleksandra", "Zapierdzielska", 23));


        Map<String, List<Osoba>> mlodsiMagazynierzy = slownik.stworzIndeksOsobNaJednymStanowisku("Młodszy Magazynier",
                listaPracownikowMlodszyMagazynier);

        Map<String, List<Osoba>> magazynierzy = slownik.stworzIndeksOsobNaJednymStanowisku("Magazynier",
                listaPracowynikowMagazynier);

        Map<String, List<Osoba>> kadry = slownik.stworzIndeksOsobNaJednymStanowisku("Dział Kadr", listaPracownikowKadry);

        Map<String, List<Osoba>> ksiegowosc = slownik.stworzIndeksOsobNaJednymStanowisku("Księgowość",
                listaPracownikowKsiegowosc);

        Map<String, Map<String, List<Osoba>>> dzialAdministracja = new HashMap<>();
        dzialAdministracja.put("Administracja",kadry);
        dzialAdministracja.put("Administracja",ksiegowosc);

        Map<String, Map<String, List<Osoba>>> dzialMagazyn = new HashMap<>();
        dzialMagazyn.put("Magazyn", mlodsiMagazynierzy);
        dzialMagazyn.put("Magazyn", magazynierzy);

        for(Map.Entry entry : dzialAdministracja.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

//        for(Map.Entry entry : dzialMagazyn.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

    }
}
