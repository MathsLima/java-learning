import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {6, 7, 8, 9, 10};

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Subtrair vetores");
            System.out.println("2. Trocar elementos pares por ímpares");
            System.out.println("3. Substituir pares por -2 e ímpares por -1");
            System.out.println("4. Concatenar vetores");
            System.out.println("5. Clonar um vetor");
            System.out.println("6. Intersecção de vetores");
            System.out.println("7. União de vetores");
            System.out.println("8. Inserir valor no vetor");
            System.out.println("9. Remover valor do vetor");
            System.out.println("10. Sair");

            int opcao = scanner.nextInt();
            int[] resultado;

            switch (opcao) {
                case 1:
                    resultado = subtrai(vetor1, vetor2);
                    System.out.println("Resultado da subtração:");
                    imprimirVetor(resultado);
                    break;
                case 2:
                    resultado = trocaParesImpares(cloneVetor(vetor1));
                    System.out.println("Vetor com elementos pares e ímpares trocados:");
                    imprimirVetor(resultado);
                    break;
                case 3:
                    resultado = substituiParesImpares(cloneVetor(vetor1));
                    System.out.println("Vetor com elementos pares substituídos por -2 e ímpares por -1:");
                    imprimirVetor(resultado);
                    break;
                case 4:
                    resultado = concatenaVetores(cloneVetor(vetor1), cloneVetor(vetor2));
                    System.out.println("Vetores concatenados:");
                    imprimirVetor(resultado);
                    break;
                case 5:
                    resultado = cloneVetor(vetor1);
                    System.out.println("Vetor clonado:");
                    imprimirVetor(resultado);
                    break;
                case 6:
                    resultado = interseccao(vetor1, vetor2);
                    System.out.println("Intersecção dos vetores:");
                    imprimirVetor(resultado);
                    break;
                case 7:
                    resultado = uniao(vetor1, vetor2);
                    System.out.println("União dos vetores:");
                    imprimirVetor(resultado);
                    break;
                case 8:
                    System.out.println("Digite o valor a ser inserido:");
                    int valorInserir = scanner.nextInt();
                    vetor1 = inserirValor(vetor1, valorInserir);
                    System.out.println("Valor inserido no vetor.");
                    break;
                case 9:
                    System.out.println("Digite o valor a ser removido:");
                    int valorRemover = scanner.nextInt();
                    vetor1 = removerValor(vetor1, valorRemover);
                    System.out.println("Valor removido do vetor.");
                    break;
                case 10:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static int[] subtrai(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            resultado[i] = vetor1[i] - vetor2[i];
        }
        return resultado;
    }

    public static int[] trocaParesImpares(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i += 2) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 1];
            vetor[i + 1] = temp;
        }
        return vetor;
    }

    public static int[] substituiParesImpares(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = -2;
            } else {
                vetor[i] = -1;
            }
        }
        return vetor;
    }

    public static int[] concatenaVetores(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[vetor1.length + vetor2.length];
        for (int i = 0; i < vetor1.length; i++) {
            resultado[i] = vetor1[i];
        }
        for (int i = 0; i < vetor2.length; i++) {
            resultado[vetor1.length + i] = vetor2[i];
        }
        return resultado;
    }

    public static int[] cloneVetor(int[] vetor) {
        int[] clone = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            clone[i] = vetor[i];
        }
        return clone;
    }

    public static int[] interseccao(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[Math.min(vetor1.length, vetor2.length)];
        int contador = 0;

        for (int valor : vetor1) {
            if (contem(vetor2, valor) && !contem(resultado, valor)) {
                resultado[contador++] = valor;
            }
        }

        return Arrays.copyOf(resultado, contador);
    }

    public static int[] uniao(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[vetor1.length + vetor2.length];
        int contador = 0;

        for (int valor : vetor1) {
            if (!contem(resultado, valor)) {
                resultado[contador++] = valor;
            }
        }

        for (int valor : vetor2) {
            if (!contem(resultado, valor)) {
                resultado[contador++] = valor;
            }
        }

        return Arrays.copyOf(resultado, contador);
    }

    public static boolean contem(int[] vetor, int valor) {
        for (int elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] inserirValor(int[] vetor, int valor) {
        int[] resultado = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = vetor[i];
        }
        resultado[vetor.length] = valor;
        return resultado;
    }

    public static int[] removerValor(int[] vetor, int valor) {
        int contador = 0;
        for (int elemento : vetor) {
            if (elemento == valor) {
                contador++;
            }
        }

        int[] resultado = new int[vetor.length - contador];
        int index = 0;

        for (int elemento : vetor) {
            if (elemento != valor) {
                resultado[index++] = elemento;
            }
        }

        return resultado;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
