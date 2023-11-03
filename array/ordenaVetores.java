/**
 Faça um programa que lê 20 valores inteiros e os insere de forma ordenada
em um vetor. O programa deve escrever o vetor ao nal. A inserção
ordenada e a escrita devem ser feitas em métodos.
*/

import java.util.Scanner;

public class ordenaVetores {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        lerValores(vetor);
        inserirOrdenado(vetor);
        escreverVetor(vetor);
    }
    //array é um objeto mutável, então não retorna valor ao final do método, além disso, deve ser void (sem retorno)
    public static void lerValores(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
    }

    public static void inserirOrdenado(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void escreverVetor(int[] vetor) {
        System.out.println("Vetor ordenado:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
