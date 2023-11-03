
/**
Crie um vetor para 20 alturas em cm (use um vetor de inteiros): 
a) Preencha o vetor com alturas aleatórias do intervalo [0; 200]; 
b) Escreva apenas as alturas pares; 
c) Escreva apenas as alturas cujos indices são pares; 
d) Escreva apenas as alturas pares; //alterei este item apenas para indice impar :)
e) Escreva o vetor ao contrário; 
f) Escreva a média de altura; 
g) Escreva quantas alturas estão acima da média; 
h) Escreva a menor altura e a sua posição.
 */
import java.util.*;

public class escreveVetores{
    public static void main(String args[]){
        
        int []alturas = new int[20];
        Random num = new Random();
        
        System.out.println("\f");
        
        for(int i=0; i<20; i++){
            alturas[i] = num.nextInt(201);
        }
        
        for(int i=0; i<alturas.length; i++){
            System.out.println("Altura " + (i+1) + ":" + alturas[i] + "cm");
        }
        
        System.out.println("\n");
        //A
        for(int i=0; i<alturas.length; i++){
            if (alturas[i] % 2 == 0){
                System.out.println("Altura " + (i+1) + " é par: " + alturas[i] + "cm");
            }
        }
        
        System.out.println("\n");
        //B
        for(int i=0; i<alturas.length; i++){
            if (i % 2 != 0){
                System.out.println("indice " + (i+1) + " é par: " + alturas[i] + "cm");
            }
        }
        
        System.out.println("\n");
        //C
        for(int i=0; i<alturas.length; i++){
            if (i % 2 == 0){
                System.out.println("indice " + (i+1) + " é impar: " + alturas[i] + "cm");
            }
        }
        
        System.out.println("\n");
        //D
        for(int i = alturas.length - 1; i>=0; i--){
            System.out.println("Altura " + (i+1) + ":" + alturas[i] + "cm");
        }
        
        System.out.println("\n");
        //E
        int soma = 0;
        for (int altura : alturas) {
            soma += altura;
        }
        double media = (double) soma / alturas.length;
        int contador = 0;
        for (int altura : alturas) {
            if (altura > media) {
                contador++;
            }
        }
        System.out.println("Média das alturas: " + media + " cm");
        System.out.println("O vetor possui " + contador + " alturas acima da média");
        
        System.out.println("\n");
        //F
        int menoraltura = alturas[0];
        int posmenor = 0;
        for (int i = 1; i < alturas.length; i++){
            if(alturas[i] < menoraltura){
                menoraltura = alturas[i];
                posmenor = i;
            }
        }
        System.out.println("A menor altura é " + menoraltura + " cm e esta na posicao "+ (posmenor + 1));
    }
}
