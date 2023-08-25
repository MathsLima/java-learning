
/**
Implemente um programa que leia o saldo médio de uma conta corrente.
A seguir, o programa deve apresentar um menu de opções, semelhante a
um caixa eletrônico: 1 - Sacar 2 - Depositar 3 - Exibir limite
Para cada opção o programa deve ser comportar de uma forma diferente:
• Opção 1: solicita ao usuário o valor a ser sacado, se o valor for válido e o
usuário puder sacar (considerar o saldo e o limite), o programa efetua o
saque e exibe o saldo médio atual.
• Opção 2: solicita ao usuário o valor a ser depositado, se o valor for válido,
o programa efetua o depósito e exibe o saldo médio atual.
• Opção 3: exibe o limite conforme abaixo
Saldo menor que R$ 500,00 não há limite
Saldo de R$ 500,00 a R$ 1.000,00 - 8% do saldo médio
Saldo maior ou igual a R$ 1.000,00 - 15% do saldo médio
 */

import java.util.Scanner;

public class SistemaBancario
{
    public static void main(String[] args){
        double saldo, limite, valor_saque, valor_deposito, saldo_total, valor_saque2;
        int opcao;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme a opcao:\n1:sacar\n2:depositar\n3:exibir limite");
        opcao = teclado.nextInt();
        
        System.out.println("Informe o seu saldo: ");
        saldo = teclado.nextDouble();
        
        switch(opcao){
            case 1:
                System.out.println("Informe o valor a ser sacado: ");
                valor_saque = teclado.nextDouble();
                if (valor_saque <= saldo){
                    valor_saque2 = saldo - valor_saque;
                   System.out.println("Você sacou " + valor_saque); 
                   System.out.println("Saldo total " + valor_saque2); 
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;
            case 2:
                {
                    System.out.println("Informe o valor a ser depositado: ");
                    valor_deposito = teclado.nextDouble();
                    
                    System.out.println("Você depositou: "+valor_deposito);
                    
                    saldo_total = saldo + valor_deposito;
                    System.out.println("Seu saldo total é: "+saldo_total);
                }
                break;
            case 3:
                if (saldo < 500){
                    System.out.println("Não ha limite.");
                } else if (saldo >= 500 && saldo < 1000){
                    limite = saldo * 0.08;
                    System.out.println("O seu limite é de: " + limite);
                } else {
                    limite = saldo * 0.15;
                    System.out.println("O seu limite é de: " + limite);
                }
                break;
            default:
                System.out.println("Opcao invalida");
        }
            
        
  
        
    }
}
