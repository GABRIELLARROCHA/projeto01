package aula4;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int n = scan.nextInt();

        double Funcao = (n-1)+(n-2);



        while (Funcao <=20){

            System.out.println(n);

            n++;

            break;
        }



    }
}
