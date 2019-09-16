package coleccionesArrays;

import java.util.*;

public class Entrada {

    public static void main(String[] args) {
        ArrayList<Integer> listaElementos = new ArrayList<Integer>();

        listaElementos.add(4);
        listaElementos.add(4);
        listaElementos.add(4);
        listaElementos.add(4);

        for (Object item : listaElementos){
            System.out.println(item);
        }
        //listaElementos.contains(4); Contiene num"4" true or false;



        System.out.println(listaElementos.size());
    }
}
