package aula4;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Números primos são os números naturais que têm apenas dois divisores: o 1 e ele mesmo.
        //Exemplos:
        // 2 tem apenas os divisores 1 e 2, portanto 2 é um número primo.
        // 17 tem apenas os divisores 1 e 17, portanto 17 é um número primo.
        // 10 tem os divisores 1, 2, 5 e 10, portanto 10 não é um número primo.
        //escreva um programa que verifique se um número é
        //ou não primo.

        System.out.println("Descrubra se o número é primo:");
        int Primo = scan.nextInt();

        if (Primo==2){
            System.out.println("número Primo");
        }

        for (int i = 2; i < Primo; i++){

            if (Primo % i == 0){
                System.out.println("Não é primo");
            }
            else {
                System.out.println("Número Primo");
            }

            break;

        }







/*
        while (p<x){

           if (x%p ==0){

                p++;


              System.out.println("número  n é Primo");


           }
           else {

               System.out.println("número primo");
              break;
           }

break;

        }

     *//*   System.out.println("número Primo");*/








    }
}
