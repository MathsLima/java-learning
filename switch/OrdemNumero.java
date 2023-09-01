/**
 *  Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um valor
inteiro (opcao). O programa deve escrever os valores n1, n2 e n3 em uma
determinada ordem, a qual é definida pelo valor de opcao.
(a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
(b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
(c) Se opcao for 3, o maior deve ser escrito entre os demais.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class OrdemNumero

{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double n1,n2,n3,aux;
        int opcao;
        
        System.out.println("\fInforme 3 valores reais: ");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        
        System.out.println(" --- M E N U ---");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior no meio");
        System.out.print("Informe a opção: ");
        opcao = teclado.nextInt();
        
        if(opcao<1 || opcao>3) System.out.println("Opçao invalida. Deve ser um valor de 1 a 3.");
        else{
            if(n2<n1){
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if(n3<n1){
                aux = n1;
                n1 = n3;
                n3 = aux;
            }
            if(n3 < n2){
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if(opcao==1) System.out.println("Ordem crescente: " + n1 + " " + n2 + " " + n3);
            else if(opcao==2) System.out.println("Ordem decrescente: " + n3 + " " + n2 + " " + n1);
                 else System.out.println("Maior no meio: " + n1 + " " + n3 + " " + n2); 
        }
        
    }
}