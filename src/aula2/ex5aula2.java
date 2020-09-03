package aula2;

import java.util.Scanner;

public class ex5aula2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Reajuste salarial");

        System.out.println("Digite o valor do salario atual:");
        double salario = scan.nextDouble();

        System.out.println("Digite o percentual % de reajuste:");
        double percentual = scan.nextDouble();

        double vpercentual = (salario*percentual)/100;

        double novoSalario = salario+vpercentual;

        System.out.println("Novo salário: " + novoSalario);

















    }
}
