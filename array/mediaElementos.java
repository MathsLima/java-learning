/**
Escreva um programa que leia 30 valores reais, todos pertencentes ao intervalo [0;10], 
calcule a média aritmética desses valores. Os valores devem ser inseridos em um vetor.
 */
import java.util.*;

public class mediaElementos
{
   public static void main (String args[]){
    Scanner in = new Scanner(System.in);
    int []vetor = new int[30];
    Random num = new Random();   
    
    System.out.println("\fVetor de 30 numeros gerado aleatóriamente no intervalo 0:10 ");
    for(int i=0; i<30; i++){
        vetor[i] = num.nextInt(10);
        System.out.println(vetor[i]);
    }
    
    System.out.println("\n");
    int soma = 0;
    for (int numeros : vetor) {
        soma += numeros;
    }
    
    //calculo da média aritmética dos numeros 
    //media em double pois pode dar num decimal
    double media = (double) soma / vetor.length;

    System.out.println("A soma é: "+ soma);
    System.out.println("A média aritmética: "+ media);

    }
}

