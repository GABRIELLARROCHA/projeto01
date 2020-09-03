package aula2;

import java.util.Scanner;

public class excomplementar4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Verifique se é elegivel para pagamento de meia entrada:");

        System.out.println("Informe sua idade:");
        int idade = scan.nextInt();

        System.out.println("Estudante:");
        boolean estudante = scan.hasNextBoolean();
        estudante = true;


        if (idade<21 || idade >65 || estudante){

            System.out.println("Direito a meia entrada");
        }
        else{
            System.out.println("Não tem direito a meia entrada");
        }





    }
}
