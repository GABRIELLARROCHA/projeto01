package aula3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         /*Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (A-álcool, G-
                gasolina). Em seguida, calcule e imprima o valor a ser pago pelo cliente.
        Álcool: R$ 2,90
        o até 20 litros, desconto de 3% por litro; acima, desconto de 5% por litro.
        Gasolina: R$ 3,30
        o até 20 litros, desconto de 4% por litro; acima, desconto de 6% por litro.*/

        System.out.println("Venda de combustivel");

       // System.out.println("Informe o tipo de combustivel [A- Álcool, B- Gasolina]");
        //String tipoCombustivel = scan.next();
        System.out.println("Informe o tipo de combustivel [1- Álcool, 2- Gasolina]");
        int tipoCombustivel = scan.nextInt();

        System.out.println("informe o números de liros que deseja");
        double quantidadeDeLitros = scan.nextDouble();

        double precoAlcool = 2.90;
        double descontoAlcool1 = precoAlcool - (precoAlcool*0.03);// Preco com 3% de desconto
        double descontoalcool2 = precoAlcool - (precoAlcool*0.05);// Preco com 5% de desconto
        double precoGasolina = 3.30;
        double descontoGasolina1 = precoGasolina - (precoGasolina*0.03);//Preco com 3% de desconto
        double descontoGasolina2 = precoGasolina - (precoGasolina*0.06);//Preco com 6% de desconto

        switch (tipoCombustivel){

            case 1:
                if (quantidadeDeLitros<=20){
                    double precoDescontoAlcool1 = descontoAlcool1*quantidadeDeLitros;
                    System.out.println("Aplicado desconto de 3%");
                    System.out.printf("Valor a pagar : %.2f " , precoDescontoAlcool1);
                }
                else {
                    double precoDescontoAlcool2 = descontoalcool2*quantidadeDeLitros;
                    System.out.println("Aplicado desconto de 5%");
                    System.out.printf("Valor a pagar: %.2f" , precoDescontoAlcool2);
                }
            break;

            case 2:

                if (quantidadeDeLitros<=20){
                    double precoDescontoGasolina1 = descontoGasolina1*quantidadeDeLitros;
                    System.out.println("Aplicado desconto de 3%");
                    System.out.printf("Valor a pagar : %.2f " , precoDescontoGasolina1);
                }
                else {
                    double precoDescontoGasolina2 = descontoGasolina2*quantidadeDeLitros;
                    System.out.println("Aplicado desconto de 6%");
                    System.out.printf("Valor a pagar: %.2f" , precoDescontoGasolina2);

                }
            break;

            default:
                System.out.println("Operacao inválida");
             break;


        }


    }
}
