package aula5;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Escreva um programa que leia os nomes de três pessoas e armazene-os em um array. Em
        // seguida, o programa deve ler outro nome e responder se ele está ou não no array.

        String[] cadastro = new String[3];
        String nome;
        int cont = 1;

        for (int i = 0; i < cadastro.length; i++) {
            System.out.println("Digite o nome da " + cont++ + " pessoa: ");
            cadastro[i] = scan.next();
        }
        System.out.println("Verifique se é cadastrado: ");
        nome = scan.next();
        boolean achei = false;

        for (int j = 0; j < cadastro.length; j++) {
            if (nome.equalsIgnoreCase(cadastro[j])) {
                achei = true;
                break; }
        }
        if (achei){
            System.out.println(nome+ "está cadastrado"); }
        else {
            System.out.println(nome+ "n esta cadastrado"); }
    }

}































