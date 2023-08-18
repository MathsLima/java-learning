
/**
Escreva um programa que lê a idade e informa se é menor ou maior de idade 
*/

import java.util.Scanner;

public class MaiorIdade
{
    public static void main (String args[]){
        int idade;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme a idade: ");
        idade = teclado.nextInt();
        
        if (idade >= 18){
            System.out.print("Maior de idade");
        } else {
            System.out.print("Menor de idade");
        }
    }
}
