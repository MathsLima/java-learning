
/**
 * Script que recebe a data atual e de aniversario do usuario, calcula quantos dias se passaram e faltam para seu aniversario,
 * se nasceu em um ano bissexto e qual o signo referente a data de aniversario
 *
 * 
 * @author (Matheus Lima) 
 * @version (10/09/2023)
 */

import java.util.Scanner; 

public class exercicioIntegrador
{
    public static void main (String args[]){
         Scanner teclado = new Scanner (System.in);
         
         // input data de aniversario
         System.out.print("\fDigite o dia do seu aniversario (dd): ");
         int dia = teclado.nextInt();
         System.out.print("Digite o mes do seu aniversario (mm): ");
         int mes = teclado.nextInt();
         System.out.print("Digite o ano do seu aniversario (aaaa): ");
         int ano = teclado.nextInt();
         
         //data do dia atual pelo usuario
         
         System.out.print("Digite o dia de hoje (dd): ");
         int dia_atual = teclado.nextInt();
         System.out.print("Digite o mes de hoje (mm): ");
         int mes_atual = teclado.nextInt();
         System.out.print("Digite o ano de hoje (aaaa): ");
         int ano_atual = teclado.nextInt();
         
         //output
         System.out.println("\nSua data de nascimento é " + dia + "/" + mes + "/" + ano);
         System.out.println("Hoje é " + dia_atual + "/" + mes_atual + "/" + ano_atual);
         
         String signo = Signo(dia, mes);
         System.out.println("Seu signo é " + signo);
         
         boolean bisxto = Bissexto(ano);
         System.out.println("Voce nasceu em um ano bissexto?  " + bisxto);
         
        if (dia == dia_atual && mes == mes_atual){
             System.out.println("Parabéns pelo seu aniversario!");
         } else{
             System.out.println("Hoje não é seu aniversario.");
         }
         
        /*calculo para calculo de dias considerando o mes com 30 dias
        * dias passados = dia atual soma o final do mes menos o dia do aniver que soma com o mes atual menos o mes do 
        * aniversario (menos 1 que desconta o mes atual pois ja esta somado os dias referentes ao mes atual) vezes 30 dias.
        * 
        * dias faltantes = 365 dias para ano nao bissexto e 366 para ano bissexto
        */ 
       
       if (bisxto == true){
            if(mes_atual > mes){
             int dias_passados = dia_atual + (30 - dia) + (mes_atual - mes -1) * 30;
             int dias_faltando = 366 - dias_passados;
             System.out.println("Passaram " + dias_passados + " dias do seu aniversario.");
             System.out.println("Faltam " + dias_faltando + " dias para seu aniversario.");
            
             } else if (mes_atual == mes){
             int dias_passados = dia_atual - dia;
             int dias_faltando = 366 - dias_passados;
             System.out.println("Passaram " + dias_passados + " dias do seu aniversario.");
             System.out.println("Faltam " + dias_faltando + " dias para seu aniversario.");
             
            } else {
             int dias_passados = dia_atual + (30 - dia) + (12 - mes + mes_atual -1) * 30;
             int dias_faltando = 366 - dias_passados;
             System.out.println("Passaram " + dias_passados + " dias do seu aniversario.");
             System.out.println("Faltam " + dias_faltando + " dias para seu aniversario.");
        
            }
       } else{
           if(mes_atual > mes){
             int dias_passados = dia_atual + (30 - dia) + (mes_atual - mes -1) * 30;
             int dias_faltando = 365 - dias_passados;
             System.out.println("Passaram " + dias_passados + " dias do seu aniversario.");
             System.out.println("Faltam " + dias_faltando + " dias para seu aniversario.");
            
             } else if (mes_atual == mes){
             int dias_passados = dia_atual - dia;
             int dias_faltando = 365 - dias_passados;
             System.out.println("Passaram " + dias_passados + " dias do seu aniversario.");
             System.out.println("Faltam " + dias_faltando + " dias para seu aniversario.");
             
            } else {
             int dias_passados = dia_atual + (30 - dia) + (12 - mes + mes_atual -1) * 30;
             int dias_faltando = 365 - dias_passados;
             System.out.println("Passaram " + dias_passados + " dias do seu aniversario.");
             System.out.println("Faltam " + dias_faltando + " dias para seu aniversario.");
            }
       }
    }
     
     //metodo para o signo
     public static String Signo (int dia, int mes){
         if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)){
             return "Aries";
        } 
        if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)){
            return "Touro";
        }
        if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)){
            return "Gemeos";
        }
        if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)){
            return "Cancer";
        }
        if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)){
            return "Leao";
        }
        if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)){
            return "Virgem";
        }
        if ((dia >= 23 && mes == 9) || (dia <= 21 && mes == 10)){
            return "Libra";
        }
        if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)){
            return "Escorpiao";
        }
        if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)){
            return "Sagitario";
        }
        if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 01)){
            return "Capricornio";
        }
        if ((dia >= 21 && mes == 1) || (dia <= 18 && mes == 2)){
            return "Aquario";
        }
        if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)){
            return "Peixes";
        }
        // Se nenhuma das condições acima for atendida, retorna null.
        return null;
    }

    //metodo para ano bissexto
    public static boolean Bissexto (int ano){
        if ((ano / 4 == 0) || (ano % 4 == 0) && (ano / 100 !=0))
            return true;
        else return false;
    }
}
