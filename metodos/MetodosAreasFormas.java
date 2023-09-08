
/**
* Metodos para calculo de geometria
* 
* área do triangulo 
* área do retângulo
* área do círculo
* área do quadrado
* volume paralelepípedo
* volume pirâmide
* volume esfera 
* volume cilindro
* superficie do Paralelepípedo
* superficie da pirâmide
* superficie do cilindro
* superficie da esfera
*/

import java.lang.Math.*;

public class MetodosAreasFormas
{
    //criacao do metodo para o calculo da area de um circulo
    public static double Circulo (double raio){
        double areaCirculo;
        
        areaCirculo = Math.PI * Math.pow(raio, 2);
        
        return areaCirculo;
        
        // ou poderia ser: retunrn Math.PI * Math.pow(raio, 2);
    }
    
    //metodo para area do quadrado
    public static double Quadrado (double lado){
        double areaQuadrado;
        
        areaQuadrado = lado * lado;
        
        return areaQuadrado;
    }
    
     //metodo para o calculo da area do retangulo
    public static double Retangulo (double base, double altura){
        double arearet;
        
        arearet = base * altura;
        
        return arearet;
        
        // ou poderia ser: retunrn Math.PI * Math.pow(raio, 2);
    }
    
    //area do triangulo 
    public static double Triangulo (double b, double h){
        double areaTriangulo;
        
        areaTriangulo = (b * h) / 2 ;
        
        return areaTriangulo;
    }
    
    //volume paralelepipedo 
    public static double VolParalelepipedo(double a, double b, double c){
        double volParale;
        
        volParale = a * b * c;
        
        return volParale;
    
    }
    
    //volume piramide 
    public static double VolPiramide(double lado, double altura){
        double volPiram;
        
        volPiram = (1/3) * lado * lado * altura;

        return volPiram;
    
    }
    
    //volume esfera 
    public static double VolEsfera(double raio){
        double VolEsfera;
        
        VolEsfera = ((4 * Math.PI * Math.pow(raio, 3)) / 3);

        return VolEsfera;
    
    }
    
    //volume cilindro 
    public static double VolCilindro(double raio, double altura){
        double VolCilindro;
        
        VolCilindro = Math.PI * Math.pow(raio,2) * altura;

        return VolCilindro;
    
    }
        
    //superficie paralelepipedo 
    public static double SupParale(double a, double b, double c){
        double SupParale;
        
        SupParale = (2 * a * b) + (2 * a * c) + (2 * b * c);

        return SupParale;
    
    }
        
    //supericie piramide  
    public static double SupPiramide(double lado, double altura, double x){
        double SupPiramide;
        
        SupPiramide = Math.pow(lado, 2) + (2 * lado * x);

        return SupPiramide;
    
    }

    //supericie cilindro  
    public static double SupCilindro(double raio, double altura){
        double SupCilindro;
        
        SupCilindro = 2 * Math.PI * raio * (raio + altura);
        
        return SupCilindro;
    
    }
    
    //supericie esfera  
    public static double SupEsfera(double raio){
        double SupEsfera;
        
        SupEsfera = 4 * Math.PI * Math.pow(raio, 2);
        
        return SupEsfera;
    
    }
}
