
/**
Faça um programa que leia o nome completo de uma pessoa e mostra a rubrica
da pessoa. Esta rubrica deve ser composta pelas iniciais do seu nome(s) e
sobrenome(s)
 */

import java.util.Scanner;

public class vogalEmMaiuscula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = teclado.nextLine();
        
        StringBuilder novaFrase = new StringBuilder(); //cria objeto de string builder
        
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            char novaLetra = caractere; // a letra permanece a mesma
            
            // Verifica se o caractere é uma vogal (minúscula)
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                // Se for vogal, transforma em maiúscula
                novaLetra = Character.toUpperCase(caractere);
            }
            
            // Adiciona a nova letra ao StringBuilder
            novaFrase.append(novaLetra);
        }
        
        System.out.println("Frase com vogais em maiúsculas: " + novaFrase.toString());
    
   }
}
