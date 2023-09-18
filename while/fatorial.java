
/**
 Faça um programa que leia um número e calcule seu fatorial. Mostrar o valor o
resultado na tela.
 */

import java.util.Scanner;

public class fatorial
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        int fat = 1;
        System.out.print("\fDigite um numero: ");
        int num = input.nextInt();
    
        while (count <= num){
            fat = fat * count;
            count++;
        }
        System.out.println("O fatorial de " + num + " é: " + fat);
    }
}
