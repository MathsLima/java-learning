
/**
Faça um programa que leia uma frase e informe quantas palavras fazem parte desta frase.
 */

import java.util.Scanner;
import java.lang.*;

public class quantidadePalavras
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\fDigite a uma frase");
        String frase = teclado.nextLine();
        
        int numPalavras = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ' || c == '\t' || c == '\n') {
                numPalavras++;
            }
        }
        numPalavras++;
        
        System.out.print("A quantidade de palavras na frase é:" + numPalavras);
    }
}
