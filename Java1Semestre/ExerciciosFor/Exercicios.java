import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio3() {

        double vetorNotas[] = new double[4];

        // pegar as 4 notas do aluno
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota do aluno");
            vetorNotas[i] = sc.nextDouble();
        }
        // mostrar as notas e calcular a média
        double media = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + vetorNotas[i]);
            media += vetorNotas[i];
        }
        // dividir a media pelo nº de notas
        media /= vetorNotas.length;
        // imprimir a média
        System.out.println("A média do aluno é: " + media);
    }

    public void exercicio4() {

        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

        // ler o vetor letra por letra e verificar se é consoante e "contar"
        int contConsoante = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {
                System.out.println(letras[i] + " é uma vogal");
            } else {
                System.out.println(letras[i] + " é uma consoante");
                contConsoante++;
            }
        }
        System.out.println("O Nº de consoantes é: " + contConsoante);
    }

    public void exercicio4Ex() {

        System.out.println("Digite uma palavra: ");
        String letras = sc.next(); // next para ler somente a primeira palavra digitada - nextline iria ler tudo
        letras = letras.toLowerCase();
        // ler a palavra letra por letra e contar as consoantes
        int contConsoante = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c + " é uma vogal");
            } else {
                System.out.println(c + " é uma consoante");
                contConsoante++;
            }
        }
        System.out.println("O Nº de consoantes é: " + contConsoante);
    }

    public void exercicio5() {
        // ler um vetor de 20 nº e determinar impares e pares
        // guardar dentro de outros vetores
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0;
        int contImpar = 0;
        // contar o numero de impares e pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        // Criar os vetores Par e Impar
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        // preencher os vetores par e impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[contPar] = numeros[i];
                contPar++; // atribui elementos do vetor numeros a posição diferente no vetor nPar
            } else {
                nImpar[contImpar] = numeros[i];
                contImpar++;
            }
        }
        // imprimir vetor de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vetor [" + i + "] = " + numeros[i]);
        }
        System.out.println("===============================");
        // imprimir vetor de pares
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("Vetor Par [" + i + "] = " + nPar[i]);
        }
        System.out.println("===============================");
        // imprimir vetor de impares
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("Vetor Impar [" + i + "] = " + nImpar[i]);
        }
    }

    public void exercicio7() {
        // vetor 5 nº, soma, multiplicação, numeros
        double vetor[] = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor da posição[" + i + "] = ");
            vetor[i] = sc.nextDouble();
        }
        // realizar as operações (soma, multiplicação)
        double soma = 0; // incia com 0 neutro
        double mult = 1; // inicia com 1 neutro
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            mult *= vetor[i];
        }

        System.out.println("O valor da soma entre os elementos é: " + soma);
        System.out.println("O valor da multiplicação entre os elementos é: " + mult);

        // Imprimir todos os numeros
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]= " + vetor[i]);
        }
    }

    public void exercicio8() {
        // ler idade e altura de 5 pessoas e imprimir na ordem inversa
        // criar os vetores para receber as informações
        int idade[] = new int[5];
        double altura[] = new double[5];

        // preencher os vetores
        for (int i = 0; i < idade.length; i++) {
            System.out.print("Informe a Idade da pessoa " + (i + 1) + " : ");
            idade[i] = sc.nextInt();
            System.out.print("Informe a Altura da pessoa " + (i + 1) + " : ");
            altura[i] = sc.nextDouble();
        }

        // Iprimir na order inversa 4 -> 0
        for (int i = 4; i >= 0; i--) {
            System.out.println("Informações da Pessoa " + (i + 1));
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i]);
        }
    }

    public void exercicio9() {
        // ler um vetor de 10 elementos e calcular a soma quadrada
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // calcular a soma dos quadrados
        int soma = 0; // acumular o valor
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i] * vetor[i];
        }
        System.out.println("A soma do Quadrado dos elementos do vetor é " + soma);
    }
}
