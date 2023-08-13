
/**
*Faça um programa que converte de Fahrenheit para graus Celsius. O programa deve ler um valor
*em Fahrenheit, converter e escrever o valor correspondente em Celsius. Para realizar a conversão
*use a fórmula $
% (f – 32)
*/

import java.lang.Math;
import java.util.Scanner;

public class ConversorTemperatura
{
    public static void main(String args[]){
        double far, valor_convertido;
        
        Scanner teclado = new Scanner (System.in);
        
        
        //valor em Fahrenheit
        System.out.print("\fDigitie o valor em Fahrenheit: ");
        far = teclado.nextDouble();
        
        valor_convertido = ((far - 32) / 5.0/9.0); //como o valor é em double, colocar numero com virgula para não dar erro 
        
        System.out.print("O valor de " + far + " Fahrenheit é " + valor_convertido + " graus");

    }
}
