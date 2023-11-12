/**
Elaborar um programa para ler a quantidade de valores a ser armazenado num
vetor (número não pode ultrapassar 1 digito) cujo conteúdo só pode ter números
naturais maiores que zero. Você deve garantir que o tamanho do vetor seja um
valor adequado (que faça sentido) e as condições do seu conteúdo. Seu
programa deve escrever:
a. Quantidade de números pares e impares existentes no vetor;
b. Quantidade de números divisíveis por 7 existentes no vetor;
c. Quantidade de números primos existentes no vetor;
d. Quantidade de números perfeitos existentes no vetor;
e. Soma dos números armazenados nas posições ímpares do vetor;
f. Produto dos números armazenados nos índices ímpares do vetor;
g. Verificar se a média aritmética dos valores pares armazenados no vetor
é menor ou maior que a média aritmética dos valores ímpares
armazenados no vetor.
h. Escrever o vetor com seus valores
 */

import java.util.*;

public class Vetores{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //input usuario
        System.out.println("\fDigite a quantidade de elementos do vetor (0 a 9): ");
        int tamanho = teclado.nextInt();
        
        //cria o vetor de acordo com o tamanho especificado pelo usuario
        int []vetor = new int[tamanho];
        
        //input no vetor
        for(int i=0; i<vetor.length; i++){
            System.out.println("Digite o valor do indice " + (i+1) + ": ");
            vetor[i] = teclado.nextInt();
        }
        
        //mostra o vetor
        for(int i=0; i<vetor.length; i++){
            System.out.println("Indice: " + i + " Numero: " + vetor[i]);
        }
        System.out.println("\n");
        
        //Quantidade de números pares e impares existentes no vetor
        int contPar = 0;
        for(int i=0; i<vetor.length; i++){
            if (vetor[i] % 2 == 0){
                contPar++;
            }
        }
        System.out.println("Vetor possui " + contPar + " elementos pares");
        System.out.println("\n");
        
        //Quantidade de números divisíveis por 7 existentes no vetor
        int contDivSete = 0;
        for(int i=0; i<vetor.length; i++){
            if (vetor[i] % 7 == 0){
                contDivSete++;
            }
        }
        System.out.println("Vetor possui " + contDivSete + " elementos divisiveis por 7");
        System.out.println("\n");
        
        //Soma dos números armazenados nas posições ímpares do vetor
        int somaIndImpar = 0;
        for(int i=1; i<vetor.length; i+=2){
            somaIndImpar += vetor[i];
        }
        System.out.println("Soma dos numeros com indice impar: " + somaIndImpar);
        System.out.println("\n");
        
        //Produto dos números armazenados nos índices ímpares do vetor
        int ProdIndImpar = 1;
        for(int i=1; i<vetor.length; i+=2){
            ProdIndImpar *= vetor[i];
        }
        System.out.println("Produto dos numeros com indice impar: " + somaIndImpar);
        System.out.println("\n");
        
        //Verificar se a média aritmética dos valores pares armazenados no vetor é menor 
        //ou maior que a média aritmética dos valores ímpares armazenados no vetor.
        int somaPares = 0, somaImpares = 0;
        int contaPares = 0, contaImpares = 0;
        for(int i=1; i<vetor.length; i++){
            if (vetor[i] % 2 == 0){
                somaPares += vetor[i];
                contaPares++;
            } else {
                somaImpares += vetor[i];
                contaImpares++;
            }
        }
        
        double mediaPares = somaPares / contaPares;
        double mediaImpares = somaImpares / contaImpares;
        
        System.out.println("Media dos numeros pares: " + mediaPares); 
        System.out.println("Media dos numeros impares: " + mediaImpares);
        
        if (mediaPares > mediaImpares){
            System.out.println("Media dos valores pares maior que dos impares");
        } else if (mediaImpares > mediaPares){
            System.out.println("Media dos valores impares maior que dos pares");
        } else {
            System.out.println("Medias entre pares e impares sao iguais");
        }
    }
}
