
/**
Escreva um programa que leia dois números e informe se o primeiro é divisível pelo
segundo. A ordem dos números não precisa observar a regra. Isto é, o seu programa
tratará disto para poder calcular se o 2º número é ou não divisor do 1º. 
 */

import java.util.Scanner;

public class NumeroDivisivel
{
    public static void main (String args[]){
        int n1, n2;
        
        Scanner teclado = new Scanner(System.in);
        
        // Solicita ao usuário que insira o primeiro número
        System.out.print("\fDigite o primeiro número: ");
        n1 = teclado.nextInt();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        n2 = teclado.nextInt();
        
        //para ser divisivel, 2º num dever ser igual a zero
        
        if (n2 == 0){
            System.out.println("Não é possível dividir por zero.");
        } else if (n1 % n2 == 0){
            System.out.println(n1 + " é divisivel por " + n2);
        } else{
            System.out.println(n1 + " não é divisivel " + n2);
        }
    }
}
