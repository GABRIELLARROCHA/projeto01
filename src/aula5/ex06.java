package aula5;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Preencha uma matriz 2 x 2 com números inteiros. Em seguida, conte e escreva quantos valores
        //maiores que 10 ela possui.

        int[][] matriz = new int[2][2];

        int count = 1;

        for (int i = 0; i < matriz.length; i++){
            for (int j =0; j< matriz.length; j++){
            System.out.println("informe um valor");
            matriz[i][j]= scan.nextInt();
            //System.out.println("valores da matriz " + matriz[i][j]);
          }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j =0; j< matriz.length; j++){
                System.out.println("valores da matriz " + matriz[i][j] );}}


    }
}
