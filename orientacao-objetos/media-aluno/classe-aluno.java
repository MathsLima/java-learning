
/**
Classe Aluno com métodos
 */

public class Aluno
{
    private String nome;
    private double matricula;
    private double p1, p2, p3, trab, m, g2, freq;
    
    public Aluno(){
        this.nome = nome;
        this.matricula = matricula;
        p1 = 0;
        p2 = 0;
        p3 = 0;
        trab = 0;
        m = 0;
        g2 = 0;
        freq = 0;
    }
    
    //set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setMatricula(double matricula){
        this.matricula = matricula;
    }
    
    public void setp1(double p1){
        this.p1 = p1;
    }
    
    public void setp2(double p2){
        this.p2 = p2;
    }
    
    public void setp3(double p3){
        this.p3 = p3;
    }
    
    public void settrab(double trab){
        this.trab = trab;
    }
    
    public void setG2(double g2){
        this.g2 = g2;
    }
    
    public void setFrequencia(double freq){
        this.freq = freq;
    }
    
    //get
     public void getMatricula(double matricula){
        this.matricula = matricula;
    }
    
    public void getp1(double p1){
        this.p1 = p1;
    }
    
    public void getp2(double p2){
        this.p2 = p2;
    }
    
    public void getp3(double p3){
        this.p3 = p3;
    }
    
    public void gettrab(double trab){
        this.trab = trab;
    }
    
    public void getG2(double g2){
        this.g2 = g2;
    }
    
    public void getFrequencia(double freq){
        this.freq = freq;
    }
    
    //return
    public double calculoMedia(double p1, double p2, double p3, double trab){
        double media = (p1 + p2 + p3 + trab) / 4;
        return media;
    }
}
