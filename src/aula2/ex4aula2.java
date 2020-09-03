package aula2;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class ex4aula2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva seus dados");

        System.out.println("Digite seu nome:");
        String nome = scan.next();

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        System.out.println("Digite o ano atual");
        int ano = scan.nextInt();

        int diferenca = 2030-ano;

        int idadeFutura = idade+diferenca;

        System.out.println("Em 2030, " +nome+ " terá " +idadeFutura+ " anos.");
















    }
}
