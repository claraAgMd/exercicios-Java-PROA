package manzano;

import java.util.Scanner;

public class L02E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A (deve ser diferente de zero): ");
        double A = scanner.nextDouble();

        if (A == 0) {
            System.out.println("A equação não é de segundo grau. O valor de A deve ser diferente de zero.");
            return;
        }

        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double delta = B * B - 4 * A * C;

        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (delta == 0) {
            double raizUnica = -B / (2 * A);
            System.out.println("A equação tem uma raiz real: x = " + raizUnica);
        } else {
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("A equação tem duas raízes reais: x1 = " + raiz1 + " e x2 = " + raiz2);
        }
    }
}

