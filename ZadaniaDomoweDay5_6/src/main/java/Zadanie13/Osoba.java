package Zadanie13;

import java.util.List;

/**
 * Created by Mateusz on 2017-07-28.
 */
public class Osoba {

    String imie;
    String nazwisko;
    Integer wiek;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getWiek() {
        return wiek;
    }

    public Osoba(String imie, String nazwisko, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}
