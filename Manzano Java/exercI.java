package manzano;

import java.util.Scanner;

public class exercI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor A (inteiro): ");
        int A = scanner.nextInt();
        System.out.println("Digite o valor B (inteiro): ");
        int B = scanner.nextInt();

        int resultado = (A - B) * (A - B);

        System.out.println("O quadrado da diferença entre A e B é: " + resultado);
    }
}
