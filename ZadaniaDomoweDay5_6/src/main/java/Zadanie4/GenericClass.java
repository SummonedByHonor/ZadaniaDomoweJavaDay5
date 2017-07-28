package Zadanie4;

/**
 * Created by Mateusz on 2017-07-22.
 */
public class GenericClass<T> {

    public void wypiszNazweKlasy(T object) {
        System.out.println(object.getClass().getName());
    }
}
