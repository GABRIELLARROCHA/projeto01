package aula2;

import java.util.Scanner;

public class exemplo03aula2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double N = scan.nextDouble();

        if (N >=1 && N <=10){
            System.out.println("O número está entre 1 e 10");
        }
        else {
            System.out.println("O número não está entre 1 e 10");
        }




    }
}
