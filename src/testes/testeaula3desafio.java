package testes;

import java.util.Scanner;

public class testeaula3desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Descubral qual seu signo");

        System.out.println("Qual seu mês de nascimento: ");
        int mes = scan.nextInt();

        System.out.println("Qual é o dia do seu nascimento: ");
        double dia = scan.nextDouble();


        switch (mes){

            case 1 :
                if (dia >= 1 && dia <= 20){
                    System.out.println("Seu signo é Capricórnio");
                }
                if (dia >= 21 && dia <= 31){
                    System.out.println("Seu signo é Aquário");
                }
                break;

            case 2 :
                if (dia >= 1 && dia <= 19){
                    System.out.println(" Seu signo é Aquário");
                }
                if (dia >= 20 && dia <= 29){
                    System.out.println("Seu signo é Peixes");
                }
                break;

            case 3 :
                if (dia >= 1 && dia <= 20){
                    System.out.println("Seu signo é Peixes");
                }
                if (dia >= 21 && dia <= 31){
                    System.out.println("Seu signo é Áries");
                }
                break;

            case 4 :
                if (dia >= 1 && dia <= 20){
                    System.out.println("Seu signo é Áries");
                }
                if (dia >= 21 && dia <= 30){
                    System.out.println("Seu signo é Touro");
                }
                break;

            case 5 :
                if (dia >= 1 && dia <= 20 ){
                    System.out.println("Seu signo é Touro");
                }
                if (dia >= 21 && dia <= 31 ){
                    System.out.println("Seu signo é Gêmeos");
                }
                break;

            case 6 :
                if (dia >= 1 && dia <= 20 ){
                    System.out.println("Seu signo é Gêmeos");
                }
                if (dia >= 21 && dia <= 30 ){
                    System.out.println("Seu signo é Câncer");
                }
                break;

            case 7 :
                if (dia >= 1 && dia <= 21 ){
                    System.out.println("Seu signo é Câncer");
                }
                if (dia >= 22 && dia <= 31 ){
                    System.out.println("Seu signo é Leão");
                }
                break;

            case 8 :
                if (dia >= 1 && dia <= 22 ){
                    System.out.println("Seu signo é Leão");
                }
                if (dia >= 23 && dia <= 31 ){
                    System.out.println("Seu signo é Virgem");
                }
                break;

            case 9 :
                if (dia >= 1 && dia <= 22 ){
                    System.out.println("Seu signo é Virgem");
                }
                if (dia >= 23 && dia <= 30 ){
                    System.out.println("Seu signo é Libra");
                }
                break;

            case 10 :
                if (dia >= 1 && dia <= 22 ){
                    System.out.println("Seu signo é Libra");
                }
                if (dia >= 23 && dia <= 31 ){
                    System.out.println("Seu signo é Escorpião");
                }
                break;

            case 11 :
                if (dia >= 1 && dia <= 21 ){
                    System.out.println("Seu signo é Escorpião");
                }
                if (dia >= 22 && dia <= 30 ){
                    System.out.println("Seu signo é Sagitário");
                }
                break;

            case 12 :
                if (dia >= 1 && dia <= 21 ){
                    System.out.println("Seu signo é Sagitário");
                }
                if (dia >= 22 && dia <= 31 ){
                    System.out.println("Seu signo é Capricórnio");
                }
                break;

        }

        System.out.println("Operacão inválida");


    }
}








