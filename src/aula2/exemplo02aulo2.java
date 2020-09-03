package aula2;

import java.util.Scanner;

public class exemplo02aulo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota :");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota :");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;
        System.out.println("Média: " + media);


        if (media>=7) {
            System.out.println("Aluno aprovado!");
        }
        else {
            System.out.println("Aluno reprovado!");
        }


    }
}
