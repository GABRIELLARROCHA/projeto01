package aula4;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Dessafio 1
        // escreva um programa que exiba o fatorial de um número
        // digitado pelo usuário.
        // ex: n! = n . (n-1) . (n-2) . (n-3) ... (n-(n-1))
        // ex: 6! = 6 . (6-1) . (6-2) . (6-3) . (6-4). (6-5)
        //     6! = 6 . 5 . 4 . 3 . 2 . 1
        //     6! = 720
        // Importante: n >= 0 (n maior ou igual a zero) , ou seja,
        // não existe fatorial para números negativos. Além disso, o fatorial de 0 ( 0! ) é 1,
        // pois o produto de número nenhum é 1.


        System.out.println("Descubra o fatorial de um número: ");
        double x = scan.nextDouble();

        double f = x;

        if (x==0) {
            f = 1;

        }
        while (x>1){
            f = f*(x-1); x--;

        }
        System.out.println("Fatorial : " + f);


    }
}
