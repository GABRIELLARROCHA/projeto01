package aula2;

import java.util.Scanner;

public class ex2aula2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Operacão Número antecessor");

        System.out.println("Digite um número:");
        double numero = scan.nextDouble();

        double antecessor = numero - 1.0;

        System.out.printf("Resultado operacão número antecessor: %.2f", antecessor);











    }
}
