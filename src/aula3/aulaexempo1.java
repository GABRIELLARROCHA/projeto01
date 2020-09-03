package aula3;

import java.util.Scanner;

public class aulaexempo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Programa Calculadora

        System.out.println("Calculadora");

        System.out.println("Digite o primeiro Número: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo Número: ");
        double n2 = scan.nextDouble();

        System.out.println("Escolha uma operacão: [ + - * / ]");
        String operacao = scan.next();

        double resultado = 0;

        switch (operacao) { //estruturas de escolhas

            case "+":
                resultado = n1 + n2;
                break;

            case "-":
                resultado = n1 - n2;
                break;

            case "*":
                resultado = n1 * n2;
                break;

            case "/":
                resultado = n1 / n2;
                break;

            default:
                System.out.println("Operacão inválida");
                break;

        }

        System.out.println("Resultado: " + resultado);


    }
}
