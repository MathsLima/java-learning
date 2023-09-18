
/**
Faça um programa que leia a altura de 6 alunos e ao final, escreva a maior altura.
 */

import java.util.Scanner;

public class maiorDeTodos
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double maior = 0;
        double  count = 1; 
        
        System.out.print("\f");
        
        while(count <= 6){
            System.out.print("Digite a altura do aluno:  ");
            double num = teclado.nextDouble();
            
            if (num > maior){
                maior = num;
            }
            count++;
        }
        System.out.print("A maior altura é: " + maior);
    }
}
