
/**
Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.
 */

import java.util.Scanner;

public class ClassificaIdade{
    public static void main (String args[]){
        int idade;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme a idade: ");
        idade = teclado.nextInt();
        
        if (idade <= 11){
            System.out.print("Criança");
        } else if (idade > 12 && idade <= 17){
            System.out.print("Adolescente");
        } else if (idade >= 18 && idade <= 59){
            System.out.print("Adulto");
        } else {
            System.out.print("Idoso");
        }
    }
}
