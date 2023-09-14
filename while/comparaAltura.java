
/**
*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
*metro e cresce 3 centímetros por ano. Construa um programa que calcule e exiba
*quantos anos serão necessários para que Zé seja maior que Chico.
 */

public class comparaAltura
{
    public static void main (String args[]){
    
    int altura_chico = 150;
    int altura_ze = 110;
    int anos = 0;
    
    
    
    while (altura_chico >= altura_ze){
        
        altura_chico += altura_chico + 2;
        altura_ze += altura_ze + 3;
        anos++;
        
     }
        
    System.out.print("Necessario " + anos + "anos");

  }
}
