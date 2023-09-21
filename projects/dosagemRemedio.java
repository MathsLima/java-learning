
/**
Implemente um programa que leia a idade (em anos) e o peso (em kg) de uma
criança. Sabendo que a tabela a seguir calcula a dosagem em mg (miligramas) de um
determinado remédio para crianças com menos de 12 anos, o programa deve calcular e
escrever a dosagem, em gotas, que a criança deve receber conforme a sua idade (de
acordo com tabela abaixo). Para resolver o problema, considere que para esse remédio
cada 100 mg corresponde a 10 gotas. Só apresente a dosagem se os valores de entrada
forem válidos.
Peso x Dosagem
5 kg a 9 kg - 125 mg
9.1 kg a 16 kg - 250 mg
16.1 kg a 24 kg - 375 mg
24.1 kg a 30 kg - 500 mg
acima de 30 kg - 750 mg
 */
import java.util.Scanner;

public class dosagemRemedio
{
    public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("\fDigite a idade da criança: ");
     double idade = teclado.nextInt();
     
     System.out.println("Digite o peso da criança: ");
     double peso = teclado.nextInt();
     
     if (idade > 12){
         System.out.println("Medicamento pode ser aplicado apenas para criança de até 12 anos.");
     }else{
         if (peso >= 5 && peso <= 9 ){
             double gotas = (125 / 100) * 10;
             System.out.println("Dosagem: " + gotas + " gotas.");
         }else if (peso >= 9.1 && peso <= 16 ){
             double gotas = (250 / 100) * 10;
             System.out.println("Dosagem: " + gotas + " gotas.");
         }else if (peso >= 16.1 && peso <= 24 ){
             double gotas = (375 / 100) * 10;
             System.out.println("Dosagem: " + gotas + " gotas.");
         }else if (peso >= 24.1 && peso <= 30 ){
             double gotas = (500 / 100) * 10;
             System.out.println("Dosagem: " + gotas + " gotas.");
         }else if (peso > 30) {
             double gotas = (750 / 100) * 10;
             System.out.println("Dosagem: " + gotas + " gotas.");
         }
     }
    }
}
