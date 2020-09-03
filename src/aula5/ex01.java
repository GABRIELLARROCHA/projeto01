package aula5;

public class ex01 {
    public static void main(String[] args) {

        // Exercício 01
        // Declare um vetor de dez posições e o preencha com os dez primeiros números ímpares.

        int[] vetor = new int[10]; // length -> 10 / última posicao é 9
        int posicao = 0;

        for (int i = 0 ; i <= 20; i++){
            if (i % 2 != 0){
                vetor[posicao]=i;
                posicao++;
                System.out.println("Vetores impares:" + i);
            }
        }
        System.out.println(vetor);


    }
}
