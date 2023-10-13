/**
Construa a classe Aluno de Fundamentos de Programação. Todo Aluno dessa
disciplina possui nome, matricula, frequência, 4 notas (P1, P2, P3 e Media de
Exercícios), e os graus G1 e G2. Defina os atributos e implemente os métodos de
instância básicos adequados para esta classe. Implemente também métodos que
calculam o grau G1 e se o aluno foi aprovado por média (média mínima de 7 no
grau G1 e frequência mínima de 75%).
Crie a classe Aplicação e veja alguns detalhes:
a) Criar um objeto a1 com um nome e matricula a sua escolha
b) Solicitar novas notas para P1, P2, P3, Media de Exercícios e Frequencia
c) Mostre a nota G1 do aluno
d) Se for o caso, altere uma das notas de provas para que o aluno seja apto a
fazer G2
e) Solicite ao usuário a nota da prova G2
f) Informe a média final, mostrando se o aluno está aprovado ou não
 */

import java.util.Scanner;

public class a1
{
    public static void main(String args[]){
        double p1, p2, p3, p4, trab, m, matricula, g2, grau_g2, freq;
        String nome;
        
        Scanner in = new Scanner(System.in);
        
        //objeto aluno
        Aluno pucker = new Aluno();
        
        System.out.print("\fDigite o nome do aluno:");
        nome = in.nextLine();
        pucker.setNome(nome);
        
        System.out.print("Digite a matricula do aluno:");
        matricula = in.nextDouble();
        pucker.setMatricula(matricula);
        
        System.out.print("Digite a nota da p1:");
        p1 = in.nextDouble();
        pucker.setp1(p1);
        
        System.out.print("Digite a nota da p2:");
        p2 = in.nextDouble();
        pucker.setp2(p2);
        
        System.out.print("Digite a nota da p3:");
        p3 = in.nextDouble();
        pucker.setp3(p3);
        
        System.out.print("Digite a nota da média de trabalhos:");
        trab = in.nextDouble();
        pucker.settrab(trab);
        
        System.out.print("Digite a frequencia de presença do aluno (0 a 100):");
        freq = in.nextDouble();
        pucker.setFrequencia(freq);
                
        m = pucker.calculoMedia(p1, p1, p3, trab);
        
        //output
        System.out.println("--------------------------------");
        System.out.println("Aluno: " + nome);
        System.out.println("\nMatricula" + matricula);
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println("P3: " + p3);
        System.out.println("Média de trabalhos: " + trab);
        System.out.println("Frequencia: " + freq);
        System.out.println("Media: " + pucker.calculoMedia(p1, p1, p3, trab));
        
        if(freq >= 75){
            if(m >= 7){
            System.out.println("Staus: Aluno aprovado em G1 com média " + m);
            } else if (m >= 4 && m < 7){
            System.out.println("Staus: Aluno em G2");
            
            System.out.print("Staus: Digite a nota da prova de G2:");
            g2 = in.nextDouble();
            pucker.setG2(trab);
            
            grau_g2 = (m + g2) / 2;
            if(grau_g2 >= 5){
                System.out.println("Staus: Aluno aprovado em G2 com média " + grau_g2);
            } else{
                System.out.println("Staus: Aluno reprovado em G2 com média " + grau_g2);
            }
            } else{
            System.out.println("Staus: Aluno Reprovado");
            }
        } else {
            System.out.println("Staus: Aluno reprovado por falta de frequencia - Menor que 75%");
        }
        
        System.out.println("--------------------------------");
    }
}
