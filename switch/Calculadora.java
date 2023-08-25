
/**
System.out.print("A soma é "+div);
 */

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args){
     
        Scanner teclado = new Scanner (System.in);
        int num1, num2, calculo, soma, sub, mult, div;
        
        //input user
        System.out.print("\fDigite 1 para soma\nDigite 2 para subtracao\nDigite 3 para multiplicacao\nDigite 4 para divisao ");
        calculo = teclado.nextInt();
                
        //valores para calculo
        System.out.print("Digite o primeiro valor: ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo  valor: ");
        num2 = teclado.nextInt();
        
        switch (calculo) {
            case 1:
                soma = num1 + num2;
                System.out.print("A soma é "+soma);
                break;
                
            case 2:
                sub = num1 - num2;
                System.out.print("A diferenca é "+sub);
                break;
            case 3:
                mult = num1 * num2;
                System.out.print("A multiplicacao é "+mult);
                break;
            case 4:
                div = num1 / num2;
                System.out.print("A divisao é "+div);
                break;
            default:
                System.out.print("Digite o valor de entrada novamente");
                break;
        }
    }
}
