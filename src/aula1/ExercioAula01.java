package aula1;

import com.sun.xml.internal.rngom.digested.DXMLPrinter;

import java.util.concurrent.LinkedTransferQueue;

public class ExercioAula01 {

    public static void main(String[] args) {

        //Exercicio 01 questao 5 -calcule a area de um losango

        System.out.println("Calcule a área do losango");
        System.out.println("Para D=6.82 e d= 3.41");

        double D = 6.82;
        double d = 3.41;
        double AreaDolosango = D*d/2;

        System.out.println("ÁREA DO LOSANGO = " + AreaDolosango);


        // Questao 06 - calcule a média ponderada

        System.out.println("Calcule a média pomderada das notas de Gabriel");
        System.out.println("Para N1= 6.5 , N2= 7.8 , N3= 8.0 , N4= 7.1");

        double N1= 6.5;
        double N2= 7.8;
        double N3= 8.0;
        double N4= 7.1;
        int P1= 2;
        int P2= 2;
        int P3= 3;
        int P4= 3;
        int SP = (P1+P2+P3+P4);
        double MediaPonderada= (((N1*P1)+(N2*P2)+(N3*P3)+(N4*P4))/SP);

        System.out.println("Média de gabriel =  " + MediaPonderada);


        //Questao 07 - calcule a área e o perímetro de um circulo com raio =6.5

        System.out.println("Calcule a área e o perímetro de um círculo com raio= 6.5 ");

        double Raio= 6.5;
        double PI= 3.14;
        double Perimetro= 2*Raio*PI;
        double Area= Raio*Raio*PI;

        System.out.println("Área de um circulo cupo raio é 6.5 é igual a " + Area);
        System.out.println("Périmetro de um circulo cujo raio é 6.5 é igual a " + Perimetro);


        //Questao 08 - Calcule a velocidade média em milhas por hora de um corredor que correu 15km em 50min30s

        System.out.println("Calcule a velocidade média em milhas por hora");
        System.out.println("Para um corredor que percorreu 15km em 50min30s");

        double milha= 1.6; //1milha =1.6km
        double hora=60; //1hora = 60min
        double min=60; //1min=60s

        double x= 30; // 30 segundos
        double y= 50; // 50 min

        double z= 15; // 15km

        double funcaoHora= ((x/min)+y)/hora;

        System.out.println("50min30s= " + funcaoHora + " horas");

        double funcaoMilha= z/milha;

        System.out.println("15km = " + funcaoMilha + " milas" );

        double velocidadeMedia= funcaoMilha/funcaoHora;

        System.out.println("A verlocidade média percorrida é de " + velocidadeMedia + " milas/hora");


        // Qestao desafio - Equacao de segundo Grau axˆ2 +bx + c = 0

        System.out.println("Resolva a équacao de 2 graus para axˆ2 +bx + c = 0" );

        double a= 2;
        double b= 4;
        double c= -6;

        double potencia = Math.pow (b,2); // variavel potencia = (bˆ2) = 16 da funcao : x= -(b + raiz de ((Bˆ2) + (4*a*c)))/2*a
        System.out.println(potencia);

        double r = potencia-(4*a*c);
        double raiz = Math.sqrt(r); // variavel raiz da funcao : bˆ2 + (4*a*c) = 8
        System.out.println(raiz);

        double x1 = -(b + raiz)/(2*a); // valor de x1 = -3
        double x2 = -(b - raiz)/(2*a); // valor de x2 = 1
        System.out.println("x1= " + x1);
        System.out.println("x2= " + x2);

        double pot2= Math.pow(x1,2); //pot2= potencia (xˆ2) da funcao : a*(xˆ2) + b*x + c = 0
        System.out.println(pot2);

        double equacao2Grau;
        equacao2Grau= (a*pot2)+b*x1+(c);
        System.out.println("Equacao= " + equacao2Grau + " logo, os valores de x sao reais "); // para variavel "equacao2GArau"= 0 verdadeiro











































































    }
}
