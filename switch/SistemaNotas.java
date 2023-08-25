
/**
Elabore um programa que leia uma nota do intervalo [0; 10],
verifique e escreva o conceito correspondente conforme:
9 a 10 A;
7 a 8,9 B;
5 a 6,9 C;
3 a 4,9 D;
abaixo de 3 E.
 */

import java.util.Scanner;

public class SistemaNotas
{
    public static void main (String args[]){
        double nota;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("\fInforme a nota do aluno de 0 a 10:");
        nota = teclado.nextDouble();
        
        if (nota > 10 ){
            System.out.print("Valor incorreto. Digite a nota entre 0 e 10");
        } else if (nota >= 9 && nota <= 10){
            System.out.print("Nota A");
        } else if (nota >= 7 && nota <= 8.9){
            System.out.print("Nota B");
        } else if (nota >= 5 && nota <= 6.9){
            System.out.print("Nota C");
        } else if (nota >= 3 && nota <= 4.9){
            System.out.print("Nota D");
        } else{
            System.out.print("Nota E");
        }
    }
}
