package ArrayList;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {

        HashMap<String, String> capitaisCidades = new HashMap<>();

        capitaisCidades.put("SP", "São Paulo");
        capitaisCidades.put("RJ", "Rio De Janeiro");
        capitaisCidades.put("MG", "Belo Horizonte");
        capitaisCidades.put("ES", "Vitória");
        // Imprime valor correspondente a chave
        System.out.println(capitaisCidades.get("ES"));
        // Imprime somente as chaves
        System.out.println(capitaisCidades.keySet());
        // Imprimir as chaves e os valores
        System.out.println(capitaisCidades);
        // Imprime somente os valores
        for (String i : capitaisCidades.keySet()) {
            System.out.println(capitaisCidades.get(i));
        }
    }
}
