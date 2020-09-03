package aula2;

import java.util.Scanner;

public class excomplementar2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mercado de Frutas");

        System.out.println("Informfe a quantidade de Macãs:");
        int quantidade = scan.nextInt();

        double preco = 1.30;


        if (quantidade>=12){
            System.out.println("Aplicar desconto , valor da unidade R$ 1,00");
            preco = 1;
            double valorDesconto= preco*quantidade;
            System.out.println("Valor a ser pago com desconto: " + valorDesconto);

        }
        else {
            System.out.println("Não aplicar desconto , valor da unidade R$1,30");
            double valorSemDesconto = preco*quantidade;
            System.out.println("Valor a ser pago sem desconto : " + valorSemDesconto);
        }


    }
}
