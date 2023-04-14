package Java.ExerciciosWhile;

public class exercios {

    public void exercicio4() {

        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        int i = 0;
        int cont = 0;

        while (i < letras.length) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {

            } else {
                cont++;
                System.out.println(letras[i] + " é uma consoante.");
            }

            i++;
        }

        System.out.println("O nº de consoantes é: " + cont);

    }

    public void exercicio5() {

        int nInteiros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int i = 0;
        int contPar = 0;
        int contImpar = 0;
        int resto;

        while (i < nInteiros.length) {

            resto = nInteiros[i] % 2;

            if (resto == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            i++;
        }

        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        i = 0;
        contPar = 0;
        contImpar = 0;

        while (i < nInteiros.length) {

            resto = nInteiros[i] % 2;

            if (resto == 0) {
                vetorPar[contPar] = nInteiros[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = nInteiros[i];
                contImpar++;
            }

            i++;

        }

        i = 0;

        while (i < nInteiros.length) {
            System.out.println("Vetor[" + i + "]=" + nInteiros[i]);
            i++;
        }
        System.out.println("=======================================");

        i = 0;

        while (i < vetorPar.length) {
            System.out.println("VetorPar[" + i + "]=" + vetorPar[i]);
            i++;
        }
        System.out.println("=======================================");

        i = 0;

        while (i < vetorImpar.length) {
            System.out.println("VetorImpar[" + i + "]=" + vetorImpar[i]);
            i++;
        }
    }

    public void exercicio6() {
        
    }

}
