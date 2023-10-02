package ArrayList;

import java.util.HashMap;

public class ExercicioHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoa = new HashMap<>();

        pessoa.put("Daniel", 23);
        pessoa.put("João", 15);
        pessoa.put("José", 55);

        System.out.println(pessoa.get("Daniel"));

        System.out.println(pessoa.keySet());

        System.out.println(pessoa);

        for (String i : pessoa.keySet()) {
            System.out.println(pessoa.get(i));
        }
    }
}
