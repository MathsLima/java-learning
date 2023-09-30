
/**
 Faça um programa que leia o nome de 3 pessoas e os exiba em ordem crescente. Aproveite para explorar os comandos da classe String.
 */

import java.util.Scanner;

public class ordemPalavras
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        //user input
        System.out.println("\fDigite um nome: ");
        String nome1 = in.nextLine();
        
        System.out.println("Digite um nome: ");
        String nome2 = in.nextLine();
        
        System.out.println("Digite um nome: ");
        String nome3 = in.nextLine();
        
        String primeiro, segundo, terceiro;
            
        //compara nome1 com nome2 e nome3 e retorna nome1 caso seja menor de todos, depois outro if para comparar nome2 com nom3, 
        //caso nome2 seja menor retorna como segundo, caso contrário nome3 se torna o segundo maior.
        
        if (nome1.compareToIgnoreCase(nome2) <0 && nome1.compareToIgnoreCase(nome3) <0){          
            primeiro = nome1;
            if (nome2.compareToIgnoreCase(nome3) < 0){
                segundo = nome2;
                terceiro = nome3;
            }else{
                segundo = nome3;
                terceiro = nome2;
           }
           
         //segundo bloco de if caso o nome 2 seja menor que nome1 e nome3, retorna nome2 como segundo valor. Após um if comparando 
         //nome1 com nome3 retornando nome1 caso seja menor que nome3.
        } else if(nome2.compareToIgnoreCase(nome1) <0 && nome2.compareToIgnoreCase(nome3) <0){
            primeiro = nome2;
            if (nome1.compareToIgnoreCase(nome3) < 0){
                segundo = nome1;
                terceiro = nome3;
            }else{
                segundo = nome3;
                terceiro = nome1;
            }
            
            //caso nome3 seja menor que os demais, nome3 se torna o primeiros. Segundo if compara nome1 com nome2, caso nome1 seja menor 
            //que nome2 retorna como, caso contrario nome2 se torna o segundo menor
        } else {
            primeiro = nome3;
            if (nome1.compareToIgnoreCase(nome2) < 0){
            segundo = nome1;
            terceiro = nome2;
            }else{
                segundo = nome2;
                terceiro = nome1;
            }
        }
        
        //output em ordem
        System.out.println("Ordem crescente:" + primeiro + " - " + segundo + " - " + terceiro);
    }
}

