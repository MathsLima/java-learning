
/**
Faça um programa que leia um número e conte quantos divisores tem esse
número. Imprimir na tela a quantidade final de divisores
 */

import java.util.Scanner;

public class numeroDivisores
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int i = 1;
        int count = 0;
        System.out.print("\fDigite um numero: ");
        int num = teclado.nextInt();
        
        while(i <= num){
            if(num % i == 0){
                count++;
            }
            i++;
        }
        System.out.print(num + " possui " + count + " divisores");
}
}