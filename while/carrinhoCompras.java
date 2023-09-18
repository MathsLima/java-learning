
/**
Faça um carrinho de compras para um cliente. Enquanto o cliente desejar inserir
produtos, solicite o nome do produto, a quantidade e o valor unitário. O
programa deve mostrar ao final, o valor a ser pago pelo cliente.
 */

import java.util.Scanner;

public class carrinhoCompras
{
    public static void main (String arg[]){
        Scanner teclado = new Scanner(System.in);

        int valor = 1, preco = 1, count = 1, qtd = 1, total = 1;
        String nome;
        
        System.out.print("\fInforme quantos produtos deseja comprar: ");
        int num = teclado.nextInt();
        
        while(count <= num){
            System.out.print("informe o nome do produto " + count +":  ");
            nome = teclado.next();
            
            System.out.print("informe a quantidade do produto: "+ count +":  ");
            qtd = teclado.nextInt();
            
            System.out.print("informe o preco do produto: "+ count +":  ");
            valor = teclado.nextInt();
            
            total = valor * qtd;
            preco = preco + total;
          
            count++;
        } 
        preco = preco -1;
        count = count - 1;
        
        System.out.print("Você comprou " + count + "produtos.");
        System.out.print("O valor total é de " + preco + "R$.");
    }
}
