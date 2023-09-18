
/**
Faça um programa que leia 6 valores inteiros e, ao final, escreva o maior e o
menor valor informado.
 */
import java.util.Scanner;

public class maiorMenorNumero
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int maior=0, menor=9999, valor, cont=0;
        System.out.println("\f"); //limpa terminal fora da repeticao
        
        while (cont < 6){
            System.out.println("Digite um valor: ");
            valor = teclado.nextInt();
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior){
                maior = valor;
            }
            
            cont++;
        }
        System.out.println("O maior valor é " + maior + " e o menor valor é " + menor); 
    }
}
