package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>(); // array list
        List carros1 = new ArrayList<>(); // coleção

        carros.add("Fusca");
        carros.add("Brasilia");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");
        // Iterando com o laço for
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        // ordenar uma lista (sorte - Collection)
        Collections.sort(carros);
        // inverte a lista (precisa ter usado o sort primeiro)
        Collections.reverse(carros);
        // Iterando com o For-each
        for (String i : carros) {
            System.out.println(i);
        }

        carros.clear(); // apaga o arraylist
        System.out.println(carros);

    }
}
