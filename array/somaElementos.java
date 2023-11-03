/**
Crie um programa que leia 2 vetores, A e B, ambos de 10 valores reais. O
programa deve calcular e guardar em um vetor soma, a soma dos elementos
de A com B. A leitura dos vetores, o cálculo e escrita do vetor soma devem
ser feitos por métodos. 
*/
import java.util.Scanner;

public class somaElementos {
    public static void main(String[] args) {
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorSoma = new double[10];

        System.out.println("\f");
        lerVetor("A", vetorA);
        lerVetor("B", vetorB);

        calcularSoma(vetorA, vetorB, vetorSoma);

        System.out.println("Vetor soma:");
        escreverVetor(vetorSoma);
    }

    public static void lerVetor(String nomeVetor, double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos do vetor " + nomeVetor + ":");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
    }

    public static void calcularSoma(double[] vetorA, double[] vetorB, double[] vetorSoma) {
        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }
    }
    //print do vetor usando o for que percorre cada elemento do vetor - outra maneira de percorrer o vetor.
    public static void escreverVetor(double[] vetor) {
        for (double elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}