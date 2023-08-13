
/**
 * Construa um programa que leia dois valores inteiros e escreve na tela:
*• a soma
*• a diferença
*• a média
*• a distância (valor absoluto da diferença)
*• o maior dos dois 
*• o menor dos dois 
 */

import java.util.Scanner;

public class CalculoNumeros
{
   public static void main (String args[]){
       int a, b, som, dif, med, dist, maior, menor;
       
       Scanner teclado = new Scanner (System.in);
       
       System.out.println("\fDigite o primeiro numero: ");
       a = teclado.nextInt();
       
       System.out.println("Digite o segundo numero");
       b = teclado.nextInt();
       
       som = a + b;
       
       dif = b - a;
       
       med = (a + b) / 2;
       
       dist = Math.abs(b - a);
       
       maior = ((a+b)+Math.abs(a-b))/2;
       
       menor = ((a+b)-Math.abs(a-b))/2;
       
       System.out.println("A soma é: " + som);
       System.out.println("A diferenca é: " + dif);
       System.out.println("A media é: " + dist);
       System.out.println("O maior numero é: " + maior);
       System.out.println("O menor numero e: " + menor);
    
   }
}
