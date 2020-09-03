package aula2;

import java.util.Scanner;

public class excomplementar5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Folha salarial");

        System.out.println("Total de horas trabalhadas por mês:");
        double totalHoras = scan.nextDouble();

        System.out.println("informe o salário por hora de trabalho");
        double salarioHora = scan.nextDouble();

        double salarioBruto = salarioHora*(40*5);
        System.out.println("Salario bruto:" + salarioBruto);

        double horasExtras = totalHoras - (40*5);
        System.out.println("horas extras:" + horasExtras);

        double acrescimoSalario =(salarioHora + (salarioHora*0.5)) * horasExtras;
        System.out.println("Acrescimo de salario: " + acrescimoSalario);

        double salarioTotal = (salarioHora*(40*5))+ acrescimoSalario;
        System.out.println("Salário total: " + salarioTotal);







    }
}
