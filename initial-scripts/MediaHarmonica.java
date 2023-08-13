
/**
*Escreva um programa em Java que solicita 3 valores numéricos (a, b e c) para o usuário, calcula e
*exiba a média aritmética e a média harmônica destes valores. A função geral da média harmônica
*é:
 */

import java.util.Scanner;

public class MediaHarmonica
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        
        Double a, b, c, media;
        
        System.out.print("Digite o valor de a");
    a = teclado.nextDouble();
        
        System.out.print("Digite o valor de b");
    b = teclado.nextDouble();

    System.out.print("Digite o valor de c");
    c = teclado.nextDouble();
    
    media = (3 / ((1/a) + (1/b) + (1/c)));
    
    System.out.print("A media harmonica é: " + media);

        
    }
}
