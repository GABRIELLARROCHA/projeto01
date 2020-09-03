package aula2;

import java.util.Scanner; // blibioteca do java

public class exemplo1aula {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o priemiro número: ");
        double n1 = scan.nextDouble(); // recebe o número informado pelo usuário e salva na variavel n1

        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble(); //recebe o número informado e salva em n2

        double soma = n1+n2;

        System.out.printf("Resultado operacao Soma: %.2f", soma);





    }
}
