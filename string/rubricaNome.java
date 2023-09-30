
/**
Faça um programa que leia o nome completo de uma pessoa e mostra a rubrica
da pessoa. Esta rubrica deve ser composta pelas iniciais do seu nome(s) e
sobrenome(s)
 */
import java.util.Scanner;


public class rubricaNome
{
    public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
     System.out.println("para sair digite: SAIR");
     System.out.println("Digite uma palavra:"  );
     String palavra = teclado.nextLine();
     
     while(true){
        System.out.print("Digite uma palavra: "); 
        
        
    
         
        if (palavra == "SAIR"){
             break;
         }
     }
        
    }
}
