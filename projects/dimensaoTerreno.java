
/**
Faça um programa que leia as dimensões de um terreno (largura e
comprimento) e a dimensões da casa (largura e comprimento) construída nesse mesmo
terreno, o programa deve calcular e escrever a área livre existente no terreno.
 */
import java.util.Scanner;

public class dimensaoTerreno{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\fDigite a largura do terreno: ");
        double larg_terreno = teclado.nextInt();
        
        System.out.println("Digite o comprimento do terreno: ");
        double comp_terreno = teclado.nextInt();
        
        System.out.println("Digite a largura da casa: ");
        double larg_casa = teclado.nextInt();
        
        System.out.println("Digite o comprimento da casa: ");
        double comp_casa = teclado.nextInt();
        
        double area_terreno = comp_terreno * larg_terreno;
        double area_casa = comp_casa * larg_casa;
        
        if(area_casa > area_terreno){
            double area_falta = area_casa - area_terreno;
            System.out.println("Faltam" + area_falta + " m2 de área no terreno");
        } else{
            double area_restante = area_terreno - area_casa;
            System.out.println("Restam" + area_restante + " m2 de área no terreno");
        }
    }
}
