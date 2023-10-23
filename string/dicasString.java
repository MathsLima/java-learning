import java.util.Scanner;
public class dicasString
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String s1, s2, nova;
        int comprimento, result;
        char caracter;
        
        System.out.print("\fInforme a string 1: ");
        s1 = teclado.nextLine();
        
        //Comprimento: quantos caracteres a string tem - length
        System.out.println("Quantidade de caracteres da string1: " + s1.length());
        
        //Para acessar caracter a caracter de uma string - charAt(posicao)
        System.out.println("Primeiro caracter da string 1: " + s1.charAt(0));
        System.out.println("Segundo caracter da string 1: " + s1.charAt(1));
        
        System.out.print("Informe a string 2: ");
        s2 = teclado.nextLine();
        
        comprimento = s2.length();
        System.out.println("Quantidade de caracteres da string2: " + comprimento);
        
        caracter = s2.charAt(0);
        System.out.println("Primeiro caracter da string 2: " + caracter);
        
        caracter = s2.charAt(1);
        System.out.println("Segundo caracter da string 2: " + caracter);
        
        caracter = s2.charAt(comprimento-1);
        System.out.println("Ultimo caracter da string 2: " + caracter);
        
        
        //Comparação de strings
        //equals : retorna true se forem exatamente iguais ; false em c.c
        if(s1.equals(s2) == true) System.out.println("Strings exatamente iguais");
        else System.out.println("Strings diferentes");
        /*if(s1.equals(s2)) System.out.println("Strings exatamente iguais");
        else System.out.println("Strings diferentes");*/
        
        //equalsIgnoreCase :retorna true se a sequencia de caracteres for a mesma, ignora a caixa (ALTA ou baixa)
        if(s1.equalsIgnoreCase(s2) == true) System.out.println("Strings com a mesma sequencia de caracteres");
        else System.out.println("Strings são distintas"); 
        
        //Comparação lexiografica
        //result = s1.compareTo(s2) devolve um valor inteiro
        // 0 se s1 e s2 são iguais
        // <0 se s1 vem antes de s2
        //>0 se s1 é depois de s2
        result = s1.compareTo(s2);
        if(result==0) System.out.println("String1 e String2 são exatamente iguais");
        if(result<0) System.out.println("String1 é antes da String2: " + s1 + " - " + s2);
        if(result>0) System.out.println("String1 é depois da String2: " + s2 + " - " + s1);
        
        //toLowerCase -> devolve uma nova string que é a s1 original toda em caixa baixa
        nova = s1.toLowerCase();
        System.out.println("String1 em minusculo: " + nova);
        
        //toUpperCase -> devolve uma nova string que é a s2 original toda em caixa alta
        nova = s2.toUpperCase();
        System.out.println("String2 em maiusculo: " + nova);
    }
    
    
}