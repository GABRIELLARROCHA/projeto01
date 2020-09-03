package aula2;

import com.oracle.javafx.jmx.json.impl.JSONStreamReaderImpl;

import java.util.Scanner;

public class desasfio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Descrubra se o ano é Bissexto");

        System.out.println("Informe o ano:");
        int ano = scan.nextInt();

        int condicao1 = ano % 4;
        System.out.println("Mutiplo de 4: " + condicao1);
        int condicao2 = ano % 100;
        System.out.println("Mutiplo de 100: " + condicao2);
        int condicao3 = ano % 400;
        System.out.println("Mutiplo de 400: " + condicao3);

        if (condicao1==0 && condicao2!=0 || condicao3==0){

            System.out.println(ano+ " É um ano Bissexto!");
        }
        else {
            System.out.println(ano + " Não é um ano Bissexto");
        }









    }
}
