
/**
*Faça um programa que informe se o aluno está aprovado ou está em G2 ou foi reprovado.
 */

import java.util.Scanner;

public class AprovacaoAluno{
    public static void main (String args[]){
        int nota;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme a nota: ");
        nota = teclado.nextInt();
        
        if (nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >=4){
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
