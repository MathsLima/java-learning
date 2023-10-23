//Faça um programa que leia uma frase e informe quantas palavras fazem parte desta frase.*

import java.util.Scanner;

public class qtdPalavras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        int numPalavras = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ' || c == '\t' || c == '\n') {
                numPalavras++;
            }
        }

        // adiciona 1 para considerar a última palavra da frase
        numPalavras++;

        System.out.println("A frase digitada contém " + numPalavras + " palavras.");
    }
}
