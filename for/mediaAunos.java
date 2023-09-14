
/**
*Faça um programa que informe o número de alunos de uma turma e
* calcule a média do exercício de avaliação 1 dos alunos
*/

import java.util.Scanner;

public class mediaAunos
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite a quantidade de alunos: ");
        int num_alunos = teclado.nextInt();
        int contador, somanotas=0;
        for (contador = 1; contador <= num_alunos; contador++){
            System.out.println("Informe a nota do aluno " + contador + ":" );
            int nota  = teclado.nextInt();
            
            somanotas += nota; 
        }
        
        int media = somanotas / num_alunos;
        System.out.println("A media das notas dos alunos é: " + media );
        
    }
}
