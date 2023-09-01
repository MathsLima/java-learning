
/**
 * Criar um programa que leia uma data no formato dd mm aaaa e imprimir se esta data é
 * válida ou não. Considere ano após 0 até 9999. Contexto os meses tem 30 dias.
 * @author (Matheus Lima) 
 * @version (25/08/2023)
 */

import java.util.Scanner;

public class Data
{
    public static void main (String args[]){
        
        Scanner teclado = new Scanner (System.in);
        int dia, mes, ano;
        
        //user input
        System.out.print("\fDigite o dia:");
        dia = teclado.nextInt();
        
        if (!(dia >= 1 && dia <= 30)){
            System.out.print("Digite um dia valido: ");
            return;
        }
            
        System.out.print("Digite o mes: ");
        mes = teclado.nextInt();
        
        if (!(mes >= 1 && mes <= 12)){
            System.out.print("Digite um dia valido: ");
            return;
        }
        
        System.out.print("Digite o mes: ");
        ano = teclado.nextInt();
        
        if (!(ano >= 0 && ano <= 9999)){
            System.out.print("Digite um dia valido: ");
            return;
        }            
 
        System.out.println("Data: " + dia + "/" + mes + "/" +ano);
    }
}