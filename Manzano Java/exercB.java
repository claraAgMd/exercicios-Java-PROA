package manzano;

import java.util.Scanner;

public class exercB{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em Fahrenheit para converter em Celsius: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit-32)*(5.0/9.0);

        System.out.println("O valor de Celsius convertido em Fahrenheit é de: " + celsius);

    }
}
