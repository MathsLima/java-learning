//Faça um programa em java que lê uma palavra e imprime a mesma na ordem inversa.
import java.util.Scanner;

public class ordemInversaPalavra{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        StringBuilder palavraInvertida = new StringBuilder();

        // adiciona as letras da palavra invertida ao StringBuilder
        for (int i = palavra.length() - 1; i >= 0; i--) {
            char c = palavra.charAt(i);
            palavraInvertida.append(c);
        }

        System.out.println("Palavra invertida: " + palavraInvertida.toString());
    }
}
