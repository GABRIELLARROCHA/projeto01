package aula2;

import java.util.Scanner;

public class ex1aula2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Operacao Subtracão");

        System.out.println("Digite o priemeiro número:");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = scan.nextDouble();

        double subtracao = n1-n2;

        System.out.printf("Resultado operacao Subtracão: %.2f",subtracao);






    }
}
