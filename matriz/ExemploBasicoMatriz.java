
import java.util.Scanner;

public class ExemploBasicoMatriz {
    public static void main(String[] args) {
        int[][] mat = new int[2][2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Digite os valores da matriz:");

        //controle de linha - fica em cada linha para entrar no proximo for para controle de coluna
        for (int i = 0; i < 4; i++) {
            //controle de coluna
            //percorre cada coluna dentro de 1 linha
            for (int j = 0; j < 4; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Imprimindo a matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}