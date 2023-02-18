package Java.Operadores;

public class Operacoes {

    /**
     * 
     */
    public void aritimetica() {
        System.out.println("===============================");
        int adicao = 5 + 2;
        System.out.println("Resultado da adição de 5 com 2: " + adicao);

        int subtracao = 5 - 2;
        System.out.println("Resultado da subtração de 5 pelo 2: " + subtracao);

        int multiplicacao = 5 * 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: " + multiplicacao);

        double divisao = 5.0 / 2.0;
        System.out.println("Resultado da divisão de 5 pelo 2: " + divisao);

        double moduloOuResto = 5.0 % 2.0;
        System.out.println("Resto da divisão de 5 pelo 2: " + moduloOuResto);
        System.out.println("Fim!");
        System.out.println("===============================");
    }

    public void atribuicao() {
        System.out.println("===============================");
        int umNumero = 5;
        umNumero += 2;
        System.out.println("Resultado da adição de 5 com 2: " + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero -= 2;
        System.out.println("Resultado da subtração de 5 pelo 2: " + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero *= 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: " + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero /= 2;
        System.out.println("Resultado da divisão de 5 pelo 2: " + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero %= 2;
        System.out.println("Resto da divisão de 5 pelo 2: " + umNumero);
        System.out.println("Fim!");
        System.out.println("===============================");
    }
}
