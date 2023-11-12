
/**
 Elaborar um programa para ler a quantidade de valores a ser armazenado numa
matriz retangular (número de linhas e colunas não pode ultrapassar 1 digito) cujo
conteúdo só pode ter números naturais maiores que zero. Você deve garantir
que o tamanho da matriz seja um valor adequado (que faça sentido) e as
condições do seu conteúdo. Seu programa deve escrever:
a. Quantidade de números pares e impares existentes na matriz;
b. Quantidade de números divisíveis por 11 existentes na matriz;
c. Quantidade de números primos existentes na matriz;
d. Quantidade de números perfeitos existentes na matriz;
e. Soma dos números armazenados nas posições das linhas ímpares da matriz;
f. Produto dos números armazenados nos índices pares das linhas pares na matriz;
g. Verificar se a média aritmética dos valores ímpares armazenados na matriz é menor ou maior que a média aritmética dos valores pares armazenados na matriz;
h. Escrever o maior valor armazenado na linha onde existe o menor valor armazenado na matriz;
i. Escrever a matriz com seus valores.
 */

import java.util.*;

public class ex7nova{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        Random geraNum = new Random();
        System.out.println("\f");
        
        //montando a matriz
        int linhas, colunas;
        while(true){
            System.out.println("Digite a quantidade de linhas da matriz (1 a 9): ");
            linhas = teclado.nextInt();
            if (linhas >= 1 && linhas <= 9) {
                    break;
                } else {
                    System.out.println("Número de linhas fora do intervalo. Tente novamente.");
                }
        }
        while(true){
            System.out.println("Digite a quantidade de colunas da matriz (1 a 9): ");
            colunas = teclado.nextInt();
            if (colunas >= 1 && colunas <= 9) {
                    break;
                } else {
                    System.out.println("Número de linhas fora do intervalo. Tente novamente.");
                }
        }
        
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++){
                matriz[i][j] = geraNum.nextInt(500);
            }
        }
        
        //imprimir matriz
        System.out.println("A matriz formado é: ");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        //A - Quantidade de números pares e impares existentes na matriz
        int qtdPar = 0, qtdImpar = 0;
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                int valor = matriz[i][j]; //pega cada indice da matriz
                if (valor % 2 == 0){
                    qtdPar++;
                } else{
                    qtdImpar++;
                }
            }
        }
        System.out.println("Quantidade de elementos pares: " + qtdPar);
        System.out.println("Quantidade de elementos impares: " + qtdImpar);
        
        //B - Quantidade de números divisíveis por 11 existentes na matriz
        int divOnze = 0;
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                int valor = matriz[i][j]; //pega cada indice da matrtiz
                if (valor % 11 == 0){
                    divOnze++;
                }
            }
        }
        System.out.println("Quantidade de elementos divisiveis por onze: " + divOnze);
        
        //C - Quantidade de números primos existentes na matriz
        int qtdPrimo = 0;
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                int valor = matriz[i][j];
                if (numPrimo(valor)){
                    qtdPrimo++;    
                }
            }
        }
        System.out.println("Quantidade de elementos primos: " + qtdPrimo);
        
        //D - Quantidade de números perfeitos existentes na matriz
        int qtdPerfeito = 0;
         for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                int valor = matriz[i][j];
                if (numPerfeito(valor)){
                    qtdPerfeito++;
                }
            }
        }
        System.out.println("Quantidade de elementos perfeitos: " + qtdPerfeito);
        
        //E - Soma dos números armazenados nas posições das linhas ímpares da matriz
        int somaPar = 0, somaImpar = 0;
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                int valor = matriz[i][j]; //pega cada indice da matriz
                if (valor % 2 == 0){
                    somaPar += valor;
                } else{
                    somaImpar += valor;
                }
            }
        }
        System.out.println("Soma elementos pares: " + somaImpar);
        System.out.println("Soma elementos impares: " + somaImpar);
        
        //F - Produto dos números armazenados nos índices pares das linhas pares na matriz
        int produtoPares = 1;
        for (int i=0; i<linhas; i+= 2){
            for (int j=0; j<colunas; j+=2){
                int valor = matriz[i][j];
                if(i % 2 == 0 && j % 2 == 0){
                    produtoPares *= valor;
                }
            }
        }
        System.out.println("Produto dos elementos em indice pares: " + produtoPares);
        
        int menorValorLinha = Integer.MAX_VALUE, linhaMenorValor = 0, maiorValorLinha = Integer.MIN_VALUE;
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                int valor = matriz[i][j];
                if(valor < menorValorLinha){
                    menorValorLinha = valor;
                    linhaMenorValor = i;
                }
            }
        }
        System.out.println("Maior valor armazenado na linha " + (linhaMenorValor + 1) + ": " + encontrarMaiorValorLinha(matriz, linhaMenorValor));
    }
    
    //metodo para encontrar um numero primo
        private static boolean numPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //metodo para numero perfeito
     private static boolean numPerfeito(int numero) {
        if (numero <= 1) { //menor ou igual a 1 nao pode ser perfeito
            return false;
        }

        int somaDivisores = 1; // Inicia com 1, pois todo número é divisível por 1
        for (int i = 2; i <= Math.sqrt(numero); i++) { //começa em i=2 e vai até a raiz quadrada do numero
            if (numero % i == 0){
                somaDivisores += i;
                if (i != numero / i) {
                    somaDivisores += numero / i;
                }
            }
        }
        return somaDivisores == numero;
    }
    
    // Função auxiliar para encontrar o maior valor em uma linha da matriz
    private static int encontrarMaiorValorLinha(int[][] matriz, int linha) {
        int maiorValor = Integer.MIN_VALUE;
        for (int valor : matriz[linha]) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        return maiorValor;
    }
    
    //metodo para produto de indice par
    private static int produtoIndicesPares(int[][] matriz) {
        int produtoPares = 1;
        for (int i = 0; i < matriz.length; i += 2) {
            for (int j = 0; j < matriz[i].length; j += 2) {
                produtoPares *= matriz[i][j];
            }
        }
        return produtoPares;
    }
}