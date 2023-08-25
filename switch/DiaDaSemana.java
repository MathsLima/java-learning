/* programa pede ao usuário para inserir um número inteiro de 1 a 7
e em seguida, imprime o dia da semana correspondente ao número.
o comando switch é usado para verificar o valor da variável "numero" 
e executar um bloco de código correspondente ao caso correspondente. 
O caso padrão é usado para lidar com qualquer valor que não seja 1-7.
*/

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número de 1 a 7: ");
        int numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }
    }
}