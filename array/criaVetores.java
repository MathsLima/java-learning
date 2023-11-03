/**
Crie um vetor de 20 elementos, do tipo double, com nome numeros.
Armazenar valores no vetor.
Mostrar em tela: Quantos elementos o vetor possui, os valores e seus 
respectivos índices.
 */

import java.util.Random;
import java.util.Scanner;

public class criaVetores
{
    public static void main(String args[]){
    
        Scanner teclado = new Scanner(System.in);
        Random gera_num = new Random();
        
        //criando o array de 20 elementos
        double []numeros = new double[20];
        
        //gera os 20 numeros aleatorios
        for(int i=0; i<20; i++){
            numeros[i] = gera_num.nextDouble((200)+1);
        }
        
        //mostra os valores e os indices
        for(int i=0; i<numeros.length; i++){
            System.out.println("Indice: " + i + " Numero: " + numeros[i]);
        }
    }
}
