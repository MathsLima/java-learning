/**
Escreva um programa para auxiliar na cobrança dos horários de alocação de quadras de
um centro esportivo. O programa deve receber dois horários, formados por hora e
minuto relacionados ao início e ao fim da partida e imprima qual o valor a ser cobrado
sabendo que o aluguel de cada quadra custa R$50,00 por hora até 2 horas. Acima disso,
custa R$20,00 a hora excedente.
*/

import java.util.Scanner;

public class ValorHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o horário de início da partida
        System.out.print("Digite o horário de início da partida (hora e minuto separados por espaço): ");
        int horaInicio = scanner.nextInt();
        int minutoInicio = scanner.nextInt();

        // Solicita ao usuário que insira o horário de fim da partida
        System.out.print("Digite o horário de fim da partida (hora e minuto separados por espaço): ");
        int horaFim = scanner.nextInt();
        int minutoFim = scanner.nextInt();

        // Fecha o objeto Scanner
        scanner.close();

        // Calcula a duração da partida em minutos
        int duracaoMinutos = (horaFim * 60 + minutoFim) - (horaInicio * 60 + minutoInicio);

        // Calcula o valor a ser cobrado
        double valorTotal;
        if (duracaoMinutos <= 120) {
            // Até 2 horas, o custo é de R$50,00 por hora
            valorTotal = (duracaoMinutos / 60.0) * 50.0;
        } else {
            // Acima de 2 horas, o custo é de R$50,00 pelas 2 primeiras horas
            // e R$20,00 por cada hora excedente
            valorTotal = 2 * 50.0 + ((duracaoMinutos - 120) / 60.0) * 20.0;
        }

        // Exibe o valor a ser cobrado
        System.out.println("O valor a ser cobrado pelo aluguel da quadra é: R$" + valorTotal);
    }
}
