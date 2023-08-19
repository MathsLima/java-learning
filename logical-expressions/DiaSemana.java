
/**
Implemente um programa que leia um valor inteiro entre 1 e 7, correspondente ao dia da semana. O programa deve escrever o dia da semana por
extenso correspondente ao valor lido. Por exemplo, se o usuário escrever 1, o programa deve exibir Domingo.
*/

import java.util.Scanner;

public class DiaSemana
{
    public static void main (String args[]){
        int dia;
        
        Scanner teclado = new Scanner (System.in);
        
        //horario de inicio
        System.out.print("\fInforme o dia da semana conforme:\n 1=seg\n 1=ter\n 1=qua\n 1=qui\n 1=sex\n");
        dia = teclado.nextInt();
        
        if (dia == 1){
            System.out.print("Hoje é Segunda-feira");
        } else if (dia == 2){
            System.out.print("Hoje é Terça-feira");
        } else if (dia == 3){
            System.out.print("Hoje é Quarta-feira");
        } else if (dia == 4){
            System.out.print("Hoje é Quinta-feira");
        } else if (dia == 5){
            System.out.print("Hoje é Sexta-feira");
        } else if (dia == 6){
            System.out.print("Hoje é Sábado");
        } else {
            System.out.print("Hoje é Domingo");
        }
    }
}
