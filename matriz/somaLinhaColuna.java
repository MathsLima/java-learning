
/**
Faça um programa que leia um matriz A(6,6) e escreve a soma dos elementos da
sua diagonal principal e da sua diagonal secundária. A leitura e as somas devem
ser feitas por métodos.
 */

import java.util.Scanner;

public class somaLinhaColuna{
    public static void main(String[] args) {
        int [][] matriz = new int[6][6];
        
        Scanner in = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Digite os valores da matriz: ");
        
        //inut dados matriz
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                matriz[i][j] = in.nextInt();
            }
        }
        
        //imprimir matriz
        System.out.println("A matriz formado é: ");
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        int somacoluna = somaColTres(matriz);
        System.out.println("Soma dos elementos da coluna 3: " + somacoluna);
        
        int somalinha = somaLinhaCinco(matriz);
        System.out.println("Soma dos elementos da linha 5: " + somalinha);
    }
    
    public static int somaColTres (int[][] matriz){
        int somaColuna = 0;
        for (int i=0; i<matriz.length; i++){
             for (int j=0; j<matriz.length; j++){
                 if (j == 2){
                     somaColuna += matriz[i][j];
                    }
             }
        }
        return somaColuna;
    }
    
    public static int somaLinhaCinco (int[][] matriz){
        int somalinha = 0;
        for (int i=0; i<matriz.length; i++){
             for (int j=0; j<matriz.length; j++){
                 if (i == 5){
                     somalinha += matriz[i][j];
                    }
             }
        }
        return somalinha;
    }
}

