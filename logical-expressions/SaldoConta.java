
/**
Implemente um programa que leia o saldo médio de uma conta corrente, calcule e escreve o seu limite conforme: 
menor que R$ 500,00 não há limite; 
de R$ 500,00 a R$ 1.000,00 8% do saldo médio; 
maior ou igual a R$ 1.000,00 15% do saldo médio.
 */

import java.util.Scanner;

public class SaldoConta
{
    public static void main(String args[]){
        double saldo, limite;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme o seu saldo: ");
        saldo = teclado.nextDouble();
        
        
        if (saldo < 500){
            System.out.println("Não ha limite.");
        } else if (saldo >= 500 && saldo < 1000){
            limite = saldo * 0.08;
            System.out.println("O seu limite é de: " + limite);
        } else {
            limite = saldo * 0.15;
            System.out.println("O seu limite é de: " + limite);
        }
    }
}
