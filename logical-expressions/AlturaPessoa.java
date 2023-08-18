
/**
Faça um programa que lê a altura de uma pessoa em metros e o seu sexo (use 1 para feminino e 2 para masculino). 
A seguir, o programa deve escrever o peso ideal dessa pessoa conforme descrito: 
Para homens, use 72.7 x altura -58. 
Para mulheres, use 62.1 x altura -44.7
 */

import java.util.Scanner;

public class AlturaPessoa
{
    public static void main (String args[]){
        double sexo, altura, peso;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme o sexo (1 para fem e 2 para masc): ");
        sexo = teclado.nextDouble();
        
        System.out.println("Informe a altura em metros: ");
        altura = teclado.nextDouble();
        
        if (sexo == 1){
            peso = 62.1 * altura - 44.7;
            System.out.println("Sexo: Feminino");
            System.out.println("Peso ideal: "+ peso);
        } else {
            peso = 72.7 * altura - 58;
            System.out.println("Sexo: Feminino");
            System.out.println("Peso ideal: "+ peso);
        }   
    }
}
