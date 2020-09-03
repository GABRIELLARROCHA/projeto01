package aula2;

import java.util.Scanner;

public class ex7aula2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Apuracao eleicao de um Município teste ");

        System.out.println("Digite o total de votos brancos:");
        int brancos = scan.nextInt();

        System.out.println("Digite o total de votos nulos:");
        int nulos = scan.nextInt();

        System.out.println("Digite o total de votos válidos");
        int validos = scan.nextInt();

        int totalVotos = brancos+nulos+validos;
        System.out.println("Totoal de votos: " + totalVotos);

        double percentualBrancos = (brancos*100.0)/totalVotos;
        System.out.println("Votos brancos: " + percentualBrancos + " %");

        double percentualNulos = (nulos*100.0)/totalVotos;
        System.out.println("Votos Nulos: " + percentualNulos + " %");

        double percentualValidos = (validos*100.0)/totalVotos;
        System.out.println("Votos válidos: " + percentualValidos + " %");






















    }
}
