package aula2;

import java.util.Scanner;

public class ex3aula2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Descubra qual a área de um retângulo");

        System.out.println("Informe o valor da base:");
        int b = scan.nextInt();

        System.out.println("Informe o valor da altura:");
        int a = scan.nextInt();

        int area = b*a;

        System.out.println("Área do retângulo é: " + area);

















    }
}
