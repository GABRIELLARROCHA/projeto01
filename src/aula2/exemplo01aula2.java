package aula2;

import java.util.Scanner;

public class exemplo01aula2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preco do produto:");
        double preco =scan.nextDouble();
        double desconto = 0;

        if (preco > 300){

            desconto = (10*preco)/100.0;

        }

        double valorFinal = preco - desconto;

        System.out.println("O valor a ser pago é: " + valorFinal);


    }
}
