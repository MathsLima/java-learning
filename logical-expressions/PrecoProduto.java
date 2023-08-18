
/**
Escreva um programa que determina o preço de venda dos produtos de uma loja
conforme o preço de custo desses produtos. O programa deve ler o preço de custo
e calcular o valor de venda conforme o que segue: 
valor abaixo de R$10,00, lucro de 70%; 
de R$10,00 a menos de R$30,00, lucro de 50%; 
de R$30,00 a menos de R$50,00 lucro de 40%; 
de R$50,00 ou mais, lucro de 30%.
 */

import java.util.Scanner;

public class PrecoProduto
{
    public static void main (String args[]){
        double preco, preco_final;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\fInforme o preco de custo: ");
        preco = teclado.nextDouble();
        
        if (preco < 0){
            System.out.println("Preco de custo invalido");
        } else if (preco < 10){
            preco_final = preco * 1.7;
            System.out.println("Valor final: "+preco_final);
        } else if (preco >= 10 && preco < 30){
            preco_final = preco * 1.5;
            System.out.println("Valor final: "+preco_final);
        } else if (preco >= 30 && preco < 50){
            preco_final = preco * 1.4;
            System.out.println("Valor final: "+preco_final);
        } else {
            preco_final = preco * 1.3;
            System.out.println("Valor final: "+preco_final);
        }
    }
   
}
