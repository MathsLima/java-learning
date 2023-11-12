/**
Elaborar um programa para ler a quantidade de valores a ser armazenado num
vetor (número não pode ultrapassar 1 digito) cujo conteúdo é composto de
nomes (Strings). Você deve garantir que o tamanho do vetor seja um valor
adequado (que faça sentido). Seu programa deve escrever:
a. Quantidade de nomes existentes no vetor que possuem tamanho
indicado por um numero par;
b. Identificar qual o nome que possui o maior número de consoantes,
escrever este nome e a posição onde ele se encontra no vetor;
c. Quantidade de nomes existentes no vetor que iniciam por uma vogal;
d. Identifique qual é o maior nome e a porcentagem de nomes que possuem
este “maior tamanho”.
e. Escrever o vetor com seus valores 
 */

import java.util.*;

public class vetorStrings
{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\f");
        //input usuario
        int tamanho;
        while (true){
            System.out.println("Digite a quantidade de elementos do vetor (1 a 9): ");
            int input = teclado.nextInt();
            
            if (input >= 1 && input <=9){
               tamanho = input;
               break;
            } else{
                System.out.println("Numero fora do intervalo. Digite um valor entre 1 e 9");
            }
        }
        
        teclado.nextLine(); //limpa buffer
        
        //cria o vetor de acordo com o tamanho especificado pelo usuario
        String []vetor = new String[tamanho];
        
        //input no vetor
        for(int i=0; i<vetor.length; i++){
            System.out.println("Digite o nome do indice " + (i+1) + ": ");
            vetor[i] = teclado.nextLine();
        }
        System.out.println("\n");
        
        //E - mostra o vetor
        for(int i=0; i<vetor.length; i++){
            System.out.println("Indice: " + i + " Nome: " + vetor[i]);
        }
        System.out.println("\n");
        
        //A - Quantidade de nomes existentes no vetor que possuem tamanho indicado por um numero par;
        int contPar = 0;
        for(int i=0; i<vetor.length; i++){
            String nomePorIndice = vetor[i];
            if (nomePorIndice.length() % 2 == 0){
                contPar++;
            }
        }
        System.out.println("Vetor possui " + contPar + " nomes em indice par.");
        System.out.println("\n");
        
        int maiorNumConsoantes = 0;
        String nomeMaiorNumConsoantes = "";
        //B - Identificar qual o nome que possui o maior número de consoantes, escrever este nome e a posição onde ele se encontra no vetor;
        for(int i=0; i<vetor.length; i++){
            String nomePorIndice = vetor[i];
        
            int numConsoantes = contarConsoantes(nomePorIndice);
            if(numConsoantes > maiorNumConsoantes){
                maiorNumConsoantes = numConsoantes;
                nomeMaiorNumConsoantes = nomePorIndice;
            }
        }
        System.out.println("Nome com maior número de consoantes: " + nomeMaiorNumConsoantes +" (Indice: " + (indexOf(vetor, nomeMaiorNumConsoantes) + 1) + ")");
        System.out.println("\n");
        
        
        //C- Quantidade de nomes existentes no vetor que iniciam por uma vogal;
        int qtdNomesVogal = 0;
        for(int i=0; i<vetor.length; i++){
            String nomePorIndice = vetor[i];
            if (iniciaComVogal(nomePorIndice)) {
                    qtdNomesVogal++;
                }
        }
        System.out.println("Vetor possui " + qtdNomesVogal + " nomes que iniciam com vogal.");
        System.out.println("\n");
        
        
        //D - Identifique qual é o maior nome e a porcentagem de nomes que possuem este “maior tamanho”.
        String maiorNome = "";
        int qtdMaiorNome = 1; 
        for (int i = 0; i < vetor.length; i++){
            String nomePorIndice = vetor[i];
            
            if (nomePorIndice.length() > maiorNome.length()) {
                maiorNome = nomePorIndice;
                qtdMaiorNome = 1;
            } else if (nomePorIndice.length() == maiorNome.length()) {
                qtdMaiorNome++;
            }
        }
        System.out.println("Maior nome: " + maiorNome);
        System.out.println("% de nomes que possuem este “maior tamanho : " + qtdMaiorNome);
    }
    
    //metodos utilizados na main
    private static int contarConsoantes(String nome){  //função auxiliar para contar o número de consoantes em uma string
        int count = 0;
        for (int i = 0; i < nome.length(); i++) {
            char c = Character.toLowerCase(nome.charAt(i));
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count++;
            }
        }
        return count;
    }
    
    private static boolean iniciaComVogal(String nome){ //nomes existentes no vetor que iniciam por uma vogal
        char primeiraLetra = Character.toLowerCase(nome.charAt(0)); //letras iniciais lowercase
        return primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u';
    }
    
    private static int indexOf(String[] vetor, String elemento) { // Função auxiliar para obter o índice de uma string em um vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
