package aula5;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Escreva um algoritmo que permita a leitura das notas de uma turma de cinco alunos. Calcular a
        //média da turma e contar quantos alunos obteve nota acima desta média calculada.

        int[] notas = new int[5];
        int count = 1;
        double soma = 0;
        double media;
        int count2 = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("informe a nota do " + count++ + " aluno");
            notas[i] = scan.nextInt();
        }
        for (int j = 0; j < notas.length; j++) {
            soma = (soma +(notas[j]));
            System.out.println("Nota: " + notas[j]);
        }
        media = soma / 5;
        System.out.println("Média: " + media);

        for (int y = 0 ; y < notas.length; y++){
            if (notas[y]> media){
                count2++; }
        }
        System.out.println((count2) + " alunos ficaram acima da média");


    }

}

