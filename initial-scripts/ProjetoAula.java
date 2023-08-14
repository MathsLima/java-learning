
/**
 * Ler 3 nomes e 3 idades e calcular a media de idades.
 * Printar os nomes, idades e a media de idades
 * 
 * @author (matheus silva de lima) 
 * @version (14-08-2023)
 */

import java.util.Scanner;

public class ExercicioAula
{
    public static void mains (String args[]){
        Scanner teclado = new Scanner (System.in);
        int idade1, idade2, idade3, media_idade;
        
        System.out.println("\fDigite o nome:  ");
        String nome1 = teclado.nextLine();
        System.out.println("\fDigite a idade:  ");
        idade1 = teclado.nextInt();
    
        teclado.nextLine();
        
        System.out.println("\fDigite o nome:  ");
        String nome2 = teclado.nextLine();
        System.out.println("Digite a segunda idade:");
        idade2 = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Digite o nome:");
        String nome3 = teclado.nextLine();
        System.out.println("Digite a terceira idade:");
        idade3 = teclado.nextInt();
        
        
        media_idade = ((idade1 + idade2 + idade3)/ 3);
        
        System.out.println(nome1 + " tem " + idade1);
        System.out.println(nome2 + " tem " + idade2);
        System.out.println(nome3 + " tem " + idade3);
        System.out.println("A media de idades é: " + media_idade);
        

    }
}
