package aula2;

import java.util.Scanner;

public class exer6aula2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura em fahrenheit?");
        double TempFahrenheit = scan.nextDouble();

        double Tempcelsius = (TempFahrenheit - 32)*(5.0/9.0);

        System.out.printf("temperatura em celsius é:  %.2f", Tempcelsius);
    }
}
