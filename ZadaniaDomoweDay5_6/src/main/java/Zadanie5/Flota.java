package Zadanie5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 2017-07-25.
 */
public class Flota<T extends Auto> {

    private List<T> listaAut = new ArrayList<>();

    public List<T> getListaAut() {
        return listaAut;
    }

    public List<T> dodajAuto(T t){
        List<T> list = this.listaAut;
        list.add(t);
        return  list;
    }

    public void flotaWyjedz(List<Auto> listaAut){

        for (Auto auto : listaAut){
            auto.jedz();
        }

    }

}
