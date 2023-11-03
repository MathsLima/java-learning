/**
Faça um programa que leia um matriz A(5,5) e escreve a soma dos seus elementos. 
A leitura e a soma dos elementos de A, utilize métodos.
 */

import java.util.Scanner;

public class somaElementos
{
    public static void main(String[] args) {
        int [][] matriz = new int[5][5];
        
        Scanner in = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Digite os valores da matriz: ");
        
        //inut dados matriz
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                matriz[i][j] = in.nextInt();
            }
        }
        
        //imprimir matriz
        System.out.println("A matriz formado é: ");
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        //chamando o metodo de soma
        int soma = somaElementos(matriz);
        System.out.println("A soma dos elementos é: " + soma);
    }
    
    public static int somaElementos (int[][] matriz){
     int soma = 0;
     for (int i=0; i<matriz.length; i++){
         for (int j=0; j<matriz.length; j++){
             soma += matriz[i][j];
         }
     }
     return soma;
    }
}
