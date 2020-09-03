package aula2;

import java.util.Scanner;

public class excomp05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Folha salarial");

        System.out.println("Total de horas trabalhadas por mês:");
        double totalHoras = scan.nextDouble();

        System.out.println("informe o salário por hora de trabalho");
        double salarioHora = scan.nextDouble();

        double jornadasemAcrescimo = totalHoras*salarioHora;

        if (totalHoras>200) {
            double jornadaSemanal = 40;
            double jonadaMemsal = jornadaSemanal*5;
            double horasExtras = totalHoras - jonadaMemsal;
            double salarioHoraExtra = salarioHora + (salarioHora*0.5);
            double acrescimoSalario = salarioHoraExtra * horasExtras;
            double salarioBruto = jonadaMemsal*salarioHora;
            double salarioTotal = salarioBruto + acrescimoSalario;

            System.out.println("Esse mês você fez : " + horasExtras + " horas extras e terá um acrecimo de salário de: $" + acrescimoSalario);
            System.out.println("salario Bruto:" + salarioBruto);
            System.out.println("Salario a receber com acrecimo: " + salarioTotal);
        }
        else {

            System.out.println("Esse mês não tem horas extras");
            System.out.println("Salario a receber:" + jornadasemAcrescimo );
        }

    }
}
