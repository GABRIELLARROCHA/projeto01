package aula2;

import java.util.Scanner;

public class excomplementar1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
         double numero = scan.nextDouble();

         if (numero >=0){
             System.out.println("Número positivo");
         }
         else{
             System.out.println("Número negativo");
         }
    }
}
