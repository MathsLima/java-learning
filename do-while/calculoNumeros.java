
/**
 * Leia 4 valores, faça a soma e o produto desses valores lidos.
 */

import java.util.Scanner;

public class calculoNumeros
{
     public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int soma = 0, prod = 1;
        int numero, num = 0;
        while(num<4){
            System.out.print("Informe um valor inteiro: ");
            numero = in.nextInt();
            
            if(numero>=1 && numero<=9999){
                num = num + 1;
            }
            
            soma = soma + numero;
            prod = prod * numero;
        }
        
        System.out.println("Soma = " + soma);
        System.out.println("Produto = " + prod);
    }
}
