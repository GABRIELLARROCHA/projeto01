package aula2;

import java.util.Scanner;

public class excomplementar3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Verifique se está apto para votar este ano");

        System.out.println("Informe o ano atual:");
        int anoAtual = scan.nextInt();

        System.out.println("Informe o ano de nascimento:");
        int anoNascimento = scan.nextInt();

        int idade = anoAtual-anoNascimento;
        System.out.println("idade: " +idade);


        if (idade>=16){
            System.out.println("Elegivel para votar");
        }
        else {
            System.out.println("Não elegivel para votar");
        }



    }

}
