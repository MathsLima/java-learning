/* Faça um programa que leia o horário de início de um jogo, em horas e minutos, e o
horário de fim desse jogo, também em hora e minutos. Sabendo que a duração máxima
do jogo é de 24 horas, determine o tempo de duração do jogo em horas e minutos.
*/

import java.util.Scanner;

public class DuracaoJogo {
     public static void main (String args[]){
         int hora_inicio, hora_fim, min_inicio, min_fim; //variavel de entrada
         int duracao_horas, duracao_minutos; // variavel de calculo
         
         Scanner teclado = new Scanner(System.in);
         
         //input usuario
         System.out.println("Digite o a hora de inicio do jogo: ");
         hora_inicio = teclado.nextInt();
         
         System.out.println("Digite o a hora do fim do jogo: ");
         hora_fim = teclado.nextInt();
         
         System.out.println("Digite os minutos do inicio do jogo: ");
         min_inicio = teclado.nextInt();
         
         System.out.println("Digite os minutos de fim do jogo: ");
         min_fim = teclado.nextInt();
         
         if (hora_fim >= hora_inicio){
             duracao_horas = hora_fim - hora_inicio;
         } else{
             duracao_horas = 24 - hora_inicio + hora_fim;
         }
         
          if (min_fim >= min_inicio){
             duracao_minutos = min_fim - min_inicio;
         } else{
             duracao_minutos = 60 - min_inicio + min_fim;
         }
         
         System.out.println("A duracao do jogo é de " + duracao_horas + " horas e " + duracao_minutos + " minutos." );
     }
}