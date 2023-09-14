/**
 * Faça um programa que le 4 valores inteiros, calcula e escreve:
 * a) a soma dos valores lidos
 * b) a media dos valores lidos
 * c) quantidade de valores lidos entre 1 e 10.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class operacoesRepeticao
{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int cont, valor, soma = 0, quant = 0;
        double media=0;
        
        System.out.println("\f");
        cont = 0;
        while(cont<4){
            System.out.print("Informe um valor inteiro: ");
            valor = in.nextInt();
            if(valor>=1 && valor<=10) quant = quant + 1;
            soma = soma + valor;
            cont = cont + 1;
           
        }
        
        System.out.println("Soma = " + soma);
        //media = soma/4;
        media = (double)soma/cont;
        System.out.println("Media = " + media);
        System.out.println("Quantidade de valores lidos do intervalo [1;10]: " + quant);
        
    }
}
