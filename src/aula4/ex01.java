package aula4;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Questao 01
        // Escreva um programa que imprima os números de 0 (inclusive) a 30 (inclusive) em ordem
        // crescente.

        int i = 0;

        while (i <= 30) {
            System.out.println("Ordem Crescente:" + i);
            i++; // mesmo que (i = i + 1) e tbm (i+= 1)

        }

        // Questao 02
        // Escreva um programa para imprimir os números entre -30 e 30
        // em ordem crescente.

        int j = -30;

        while (j < 30) {

            if (j == -30) {
                j++;
                continue;
            }
            System.out.println("resposta: " + j);

            j++;
        }


        // Questao 03
        // Escreva um programa para imprimir os 10 primeiros números inteiros
        // maiores que 100.

        int e = 100;

        while (e >= 100) {
            if (e == 100) {
                // condicao para os números serem apesentados após o número 100 ,
                // no caso, a partir do 101.
                e++;
                continue;
            }
            if (e == 111) {
                //condicao para parar o número antes de 111 , no caso o programa
                // vai imprimir ate chegar no número 110.
                e++;
                break;
            }
            System.out.println("Inteiros: " + e);
            e++;

        }

        // Questao 04
        // Escreva um programa para imprimir os números de 1 a 15 em ordem decrescente.


        int d = 15;

        while (d >= 1) {
            System.out.println("Decresente: " + d);
            d--;
        }


        // Questao 05
        // Escreva um programa que leia um valor N e imprima todos os valores inteiros entre 1 (inclusive)
        //e N (inclusive).

        System.out.println("Digite um número: ");
        int n = scan.nextInt();

        while (n >= 1) {     //Decrescente

            System.out.println("Res: " + n);

            n--;

        }

        // outra forma de fazer (crescente )

        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        int n2 = 1;

        while (n2 <= n1) {

            System.out.println("Resposta: " + n2);

            n2++;

        }

        //Qestao 06
        // Faça um programa que imprima na tela a tabuada de multiplicação por 6. O programa deve
        //imprimir na primeira linha a multiplicação de 6 por 1; na segunda, de 6 por 2; e assim
        //sucessivamente, até a décima (6 vezes 10):
        //6 x 1 = 6
        //....
        //6 x 10 = 60

        int t = 0;

        while (t <= 10) {


            System.out.println("6x" + t + "=" + (t*6));
            t++;
            /*System.out.println("6x2: " + t);
            t = t + 6;
            System.out.println("6x3: " + t);
            t = t + 6;
            System.out.println("6x4: " + t);
            t = t + 6;
            System.out.println("6x5: " + t);
            t = t + 6;
            System.out.println("6x6: " + t);
            t = t + 6;
            System.out.println("6x7: " + t);
            t = t + 6;
            System.out.println("6x8: " + t);
            t = t + 6;
            System.out.println("6x9: " + t);
            t = t + 6;
            System.out.println("6x10: " + t);
*/
        }











    }

}
