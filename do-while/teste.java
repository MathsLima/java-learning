
/**
 * Escreva uma descrição da classe teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class teste
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
