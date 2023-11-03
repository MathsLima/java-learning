/*
1) A main deve conter a chamada dos métodos criados (com menu)
2) Crie um método subtrai que cria um 3o vetor cujos elementos resultam da subtração dos outros dois vetro1-vetor2 -> vetor 3 
3) Crie um método que troque os elementos das posições pares pelos elementos das posições ímpares (o vetor original deve ser mantido) 
4) crie um método substitua os elementos das posições pares por -2 e os elementos das posições ímpares por -1 (detalhe o vetor original deve ser mantido) 
5) crie um método que receba dois vetores e devolve os vetores concatenados "colados em sequência" 
6) Crie um método que receba dois vetores e devolve a intersecção dos vetores 
7) Crie um método que receba dois vetores e devolve a união dos vetores 
8) Crie um método que permita inserir um valor no vetor 
9) Crie um método que permita remover um valor no vetor 
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class operacoesVetores {
    public static void main(String[] args) {
        int[] vetor1 = gerarVetor(10);
        int[] vetor2 = gerarVetor(10);

        boolean sair = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\fVetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
    

        menu();

        while (sair) {
            int opcao = scanner.nextInt();
            int[] resultado;

            switch (opcao) {
                case 1: // Subtração
                    resultado = subtrai(vetor1, vetor2);
                    System.out.println("Resultado da subtração:");
                    imprimirVetor(resultado);
                    break;
                case 2: // Troca pares por ímpares
                    resultado = trocaParesImpares(vetor1);
                    System.out.println("Vetor com elementos pares e ímpares trocados:");
                    System.out.println("Vetor 1: " + Arrays.toString(resultado));
                    resultado = trocaParesImpares(vetor2);
                    System.out.println("Vetor 2: " + Arrays.toString(resultado));
                    break;
                case 3: // Substitui pares por -2 e ímpares por -1
                    resultado = substituiParesImpares(vetor1);
                    System.out.println("Vetor com elementos pares substituídos por -2 e ímpares por -1:");
                    System.out.println("Vetor 1: " + Arrays.toString(resultado));
                    resultado = substituiParesImpares(vetor2);
                    System.out.println("Vetor 2: " + Arrays.toString(resultado));
                    break;
                case 4: // Concatenação
                    resultado = concatenaVetores(vetor1, vetor2);
                    System.out.println("Vetores concatenados:");
                    imprimirVetor(resultado);
                    break;
                case 5: // Intersecção
                    resultado = interseccao(vetor1, vetor2);
                    System.out.println("Intersecção dos vetores:");
                    imprimirVetor(resultado);
                    break;
                case 6: // União
                    resultado = uniao(vetor1, vetor2);
                    System.out.println("União dos vetores:");
                    imprimirVetor(resultado);
                    break;
                case 7: // Inserir valor
                    System.out.println("Digite o valor a ser inserido:");
                    int valor = scanner.nextInt();
                    System.out.println("Digite a posição do vetor:");
                    int posicao = scanner.nextInt();
                    resultado = inserir(vetor1, valor, posicao);
                    System.out.println("Vetor1 com valor inserido: " + Arrays.toString(resultado));
                    resultado = inserir(vetor2, valor, posicao);
                    System.out.println("Vetor2 com valor inserido: " + Arrays.toString(resultado));
                    break;
                case 8: // Remover valor
                    System.out.println("Digite a posição do vetor:");
                    posicao = scanner.nextInt();
                    resultado = remover(vetor1, posicao);
                    System.out.println("Vetor1 com valor removido: " + Arrays.toString(resultado));
                    resultado = remover(vetor2, posicao);
                    System.out.println("Vetor2 com valor removido: " + Arrays.toString(resultado));
                    break;
                case 0:
                    System.out.println("Até logo!");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    // Print menu
    public static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Subtrair vetores");
        System.out.println("2. Trocar elementos pares por ímpares");
        System.out.println("3. Substituir pares por -2 e ímpares por -1");
        System.out.println("4. Concatenar vetores");
        System.out.println("5. Intersecçao dos vetores");
        System.out.println("6. Uniao de vetores");
        System.out.println("7. Inserir valor em um vetor");
        System.out.println("8. Remover valor em um vetor");
        System.out.println("0. Sair");
    }

    // Gerar Vetor com numeros entre 0 e 20
    public static int[] gerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 20);
        }
        return vetor;
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

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static int[] interseccao(int[] vetor1, int[] vetor2) {
        // Cria uma lista para armazenar os valores da intersecção
        List<Integer> lista = new LinkedList<Integer>();
        for (int valor : vetor1) {
            // if valor está em vetor2 e não está em resultado
            if (contem(vetor2, valor) && !lista.contains(valor)) {
                lista.add(valor);
            }
        }
        // Converte a lista para um vetor
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }

    public static int[] uniao(int[] vetor1, int[] vetor2) {
        // Cria uma lista para armazenar os valores da união
        List<Integer> lista = new LinkedList<Integer>();
        for (int valor : vetor1) {
            // if valor não está em resultado
            if (!lista.contains(valor)) {
                lista.add(valor);
            }
        }
        for (int valor : vetor2) {
            // if valor não está em resultado
            if (!lista.contains(valor)) {
                lista.add(valor);
            }
        }
        // Converte a lista para um vetor
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }

    public static int[] inserir(int[] vetor, int valor, int posicao) {
        int[] resultado = new int[vetor.length + 1];
        for (int i = 0; i < resultado.length; i++) {
            if (i < posicao) {
                resultado[i] = vetor[i];
            } else if (i == posicao) {
                resultado[i] = valor;
            } else {
                resultado[i] = vetor[i - 1];
            }
        }
        return resultado;
    }

    public static int[] remover(int[] vetor, int posicao) {
        int[] resultado = new int[vetor.length - 1];
        for (int i = 0; i < resultado.length; i++) {
            if (i < posicao) {
                resultado[i] = vetor[i];
            } else {
                resultado[i] = vetor[i + 1];
            }
        }
        return resultado;
    }

    public static boolean contem(int[] vetor, int valor) {
        for (int elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}
