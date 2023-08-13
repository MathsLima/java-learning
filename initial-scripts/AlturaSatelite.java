
/**
*Um satélite será lançado para uma órbita circular em torno da Terra, de forma que complete uma 
*órbita completa em torno do planeta a cada T segundos. A altitude h que o satélite deverá estar deve ser calculada 
*utilizando a formala para h.
 */

import java.util.Scanner;
import java.lang.Math;

public class Satelite
{
    public static void main (String args[]){
        double g, m, r, t, pi, h; 
        
        g = Math.pow((6.67426 * 10), -11); //gravidade
        m = Math.pow((5.97 * 10), 24); //massa da terra
        r = 6371 * 1000; //raio da terra
        pi = Math.pow(Math.PI, 2); //pi^2 
        
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("\fDigitie o valor de T: ");
        t = teclado.nextDouble();
        t = Math.pow(t, 2);
        
        h = (Math.pow((g*m*t), (1/3))/(4*pi))-r; //formula para h
        
        System.out.print("A altitude do satelite para " + t + " minutos é de " + h + " metros");

    
        
        
}
}