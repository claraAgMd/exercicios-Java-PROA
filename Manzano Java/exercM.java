package manzano;

import java.util.Scanner;

public class exercM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double soma = A + B + C;
        double quadradoSoma = Math.pow(soma, 2);

        System.out.println("O quadrado da soma de A, B e C é: " + quadradoSoma);
    }
}
