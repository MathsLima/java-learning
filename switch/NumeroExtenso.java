
/**
Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um
valor inteiro (opcao). O programa deve escrever os valores n1, n2 e n3
em uma determinada ordem, a qual é definida pelo valor de opcao.
(a) Se opcao for 1, o programa deve escrever os valores em ordem
crescente.
(b) Se opcao for 2, o programa deve escrever os valores em ordem
decrescente.
(c) Se opcao for 3, o maior deve ser escrito entre os demais.
 */

import java.util.Scanner;

public class NumeroExtenso
{
    public static void mani(String args[]){
        int n1, n2, n3,aux,opcao;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o primeiro valor: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        
        System.out.println(" --- M E N U ---");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior no meio");
        System.out.print("Informe a opção: ");
        opcao = teclado.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("Ordem crescente: " + n1 + " " + n2 + " " + n3);
            
            case 2:
                System.out.println("Ordem decrescente: " + n3 + " " + n2 + " " + n1);
                
            case 3:
                System.out.println("Maior no meio: " + n1 + " " + n3 + " " + n2);
        }
        }
    }

