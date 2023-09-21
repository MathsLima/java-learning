
/**
 Escreva um programa que leia uma quantidade desconhecida de números. A
seguir, o programa deve contar e escrever a quantidade de valores pertencentes aos
seguintes intervalos: [0;25], [26;50], [51;75] e [76;100]. A entrada de dados deve
terminar quando for lido um número negativo. Ao final o programa deve exibir ainda a
quantidade de valores lidos.
 */

import java.util.Scanner;

public class quantidadeNumeros
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int count = 0;
        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0; 
        
        while(true){
            System.out.print("\fDigite um numero: ");
            int num = teclado.nextInt();
            count++;
            
            if(num >= 0 && num <= 25){
                intervalo1++;
            }
            if(num >= 26 && num <= 50){
                intervalo2++;
            }
            if(num >= 51 && num <= 75){
                intervalo3++;
            }
            if(num >= 76 && num <= 100){
                intervalo4++;
            }
            
            if( num < 0){
                break;
            }
        }
        
        System.out.println("Quantidade de numeros lidos: " + count);
        System.out.println("Quantidade de numeros no intervalo [0:25]: " + intervalo1);
        System.out.println("Quantidade de numeros no intervalo [26:50]: " + intervalo2);
        System.out.println("Quantidade de numeros no intervalo [51:75]: " + intervalo3);
        System.out.println("Quantidade de numeros no intervalo [76:100]: " + intervalo4);
        System.out.println("Quantidade de numeros no intervalo [76:100]: " + intervalo4);
    }
}
