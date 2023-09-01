
/**
Escreva um programa que receba 3 números verifique se eles são diferentes entre si e,
somente quando esta condição se verificar, então os escreva em ordem decrescente. 
 */

import java.util.Scanner;

public class NumerosDiferentes
{
    public static void main (String args[]){
     int n1, n2, n3;
     
     Scanner teclado = new Scanner (System.in);
     
     System.out.println("Digite o 1º numero: ");
     n1 = teclado.nextInt();
     
     System.out.println("Digite o 2º numero: ");
     n2 = teclado.nextInt();
     
     System.out.println("Digite o 3º numero: ");
     n3 = teclado.nextInt();
     
     if (n1 > n2 && n1 > n3 && n2 > n3){
         System.out.println("Ordem: " + n1 + "-" + n2 + "-" + n3);
     } else if (n1 > n2 && n1 > n3 && n3 > n2){
         System.out.println("Ordem: " + n1 + "-" + n3 + "-" + n2);
     } else if (n2 > n1 && n2 > n3 && n1 > n3){
         System.out.println("Ordem: " + n2 + "-" + n1 + "-" + n3);
     } else if (n2 > n1 && n2 > n3 && n3 > n1){
         System.out.println("Ordem: " + n2 + "-" + n3 + "-" + n1);
    } else if (n3 > n1 && n3 > n2 && n1 > n2){
         System.out.println("Ordem: " + n3 + "-" + n1 + "-" + n2);
    } else {
        System.out.println("Ordem: " + n3 + "-" + n2 + "-" + n1);
    }
}
}
