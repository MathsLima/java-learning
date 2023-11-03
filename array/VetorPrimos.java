
/**
Implemente um programa que preenche e escreve um vetor com os 100 primeiros valores
primos. A identificação dos primos e a escrita do vetor devem ser definidas por métodos.
 */

import java.util.*;
/*
public class ex8
{
    public static void main(String[] args) {
        int[] vetor = new int[100];
        numPrimo(vetor);
        

    }
    
    //verifica os primos
     public static boolean numPrimo(int num, int vetor[]) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= vetor.length; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //preencher vetor primos
    public static void VetorPrimos(int[] vetor) {
        int num = 2;
        int count = 0;

        while (count < 100) {
            if (numPrimo(num)) {
                vetor[count] = num;
                count++;
            }
            num++;
        }
    }
        
    public static void escreverVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
/*
 * 
 */
public class VetorPrimos {

    public static void main(String[] args) {
        int[] vetor = new int[100];
        preencherVetorPrimos(vetor);
        escreverVetor(vetor);
    }

    public static void preencherVetorPrimos(int[] vetor) {
        int num = 2;
        int count = 0;

        while (count < 100) {
            if (ehPrimo(num)) {
                vetor[count] = num;
                count++;
            }
            num++;
        }
    }

    public static boolean ehPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void escreverVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); // Quebra de linha a cada 10 elementos
            }
        }
    }
}
