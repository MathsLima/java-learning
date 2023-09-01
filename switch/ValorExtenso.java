
/**
Faça um programa que leia uma quantia inteira em R$ do intervalo
[1;9999] (garanta isso) e a escreva por extenso. Por exemplo, se o valor
lido for R$ 315, o programa deve escrever trezentos e quinze reais.
Implemente com switch − case, mas não use um case para cada valor
possível.
 */

import java.util.Scanner;

public class ValorExtenso
{
    public static void main (String args[]){
        int num;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor entre 1 e 9999: ");
        num = teclado.nextInt();
        
        if (num < 1 || num > 9999) {
            System.out.println("Valor fora do intervalo permitido.");
            return;
        }
        
        String valorPorExtenso = "";
        
        int milhar = num / 1000;
        int centena = (num % 1000) / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;
        
        switch (milhar) {
            case 1: valorPorExtenso += "mil "; break;
            case 2: valorPorExtenso += "dois mil "; break;
            case 3: valorPorExtenso += "tres mil "; break;
            case 4: valorPorExtenso += "quatro mil "; break;
            case 5: valorPorExtenso += "cinco mil "; break;
            case 6: valorPorExtenso += "seis mil "; break;
            case 7: valorPorExtenso += "sete mil "; break;
            case 8: valorPorExtenso += "oito mil "; break;
            case 9: valorPorExtenso += "nove mil "; break;
        }
        
        switch (centena) {
            case 1: valorPorExtenso += "cem "; break;
            case 2: valorPorExtenso += "duzentos "; break;
            case 3: valorPorExtenso += "trezentos "; break;
            case 4: valorPorExtenso += "quatrocentos "; break;
            case 5: valorPorExtenso += "quinhento "; break;
            case 6: valorPorExtenso += "seiscentos "; break;
            case 7: valorPorExtenso += "setecentos "; break;
            case 8: valorPorExtenso += "oitocentos "; break;
            case 9: valorPorExtenso += "novecentos "; break;
        }
        
        switch (dezena) {
            case 1:
                switch (unidade) {
                    case 0: valorPorExtenso += "dez "; break;
                    case 1: valorPorExtenso += "onze "; break;
                    case 2: valorPorExtenso += "doze "; break;
                    case 3: valorPorExtenso += "treze "; break;
                    case 4: valorPorExtenso += "quatore  "; break;
                    case 5: valorPorExtenso += "quinze "; break;
                    case 6: valorPorExtenso += "dezesseis "; break;
                    case 7: valorPorExtenso += "dezessete "; break;
                    case 8: valorPorExtenso += "dezoito "; break;
                    case 9: valorPorExtenso += "deznove "; break;
                }
                break;
            case 2: valorPorExtenso += "vinte "; break;
            case 3: valorPorExtenso += "trinta "; break;
            case 4: valorPorExtenso += "quarenta  "; break;
            case 5: valorPorExtenso += "cinquenta "; break;
            case 6: valorPorExtenso += "sessenta "; break;
            case 7: valorPorExtenso += "setenta "; break;
            case 8: valorPorExtenso += "oitenta "; break;
            case 9: valorPorExtenso += "noventa "; break;
        }
        
        if (dezena != 1) { 
            switch (unidade) {
                case 1: valorPorExtenso += "um "; break;
                case 2: valorPorExtenso += "dois "; break;
                case 3: valorPorExtenso += "três "; break;
                case 4: valorPorExtenso += "quatro  "; break;
                case 5: valorPorExtenso += "cinco "; break;
                case 6: valorPorExtenso += "seis "; break;
                case 7: valorPorExtenso += "sete "; break;
                case 8: valorPorExtenso += "oito "; break;
                case 9: valorPorExtenso += "nove "; break;
            }
        }
        
        System.out.println("Valor por extenso: " + valorPorExtenso + "reais");
    }
}
