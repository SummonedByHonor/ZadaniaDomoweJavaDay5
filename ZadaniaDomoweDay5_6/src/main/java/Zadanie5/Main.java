package Zadanie5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 2017-07-25.
 */
public class Main {

    public static void main(String[] args) {
        AutoCiezarowe star = new AutoCiezarowe();
        AutoCiezarowe skanska = new AutoCiezarowe();
        AutoCiezarowe mercedesTIR = new AutoCiezarowe();
        AutoCiezarowe jakasCiezarowka = new AutoCiezarowe();

        AutoOsobowe opel = new AutoOsobowe();
        AutoOsobowe skoda = new AutoOsobowe();
        AutoOsobowe citroen = new AutoOsobowe();
        AutoOsobowe audi = new AutoOsobowe();
        AutoOsobowe honda = new AutoOsobowe();


        Flota<Auto> flota = new Flota();
        flota.dodajAuto(opel);
        flota.dodajAuto(skoda);
        flota.dodajAuto(skanska);
        flota.dodajAuto(star);
        flota.dodajAuto(citroen);
        flota.dodajAuto(jakasCiezarowka);
        flota.dodajAuto(audi);
        flota.dodajAuto(mercedesTIR);
        flota.dodajAuto(honda);
        List<Auto> listofCars = flota.getListaAut();
        flota.flotaWyjedz(listofCars);

    }
}
