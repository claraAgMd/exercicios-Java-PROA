package manzano;

import java.util.Scanner;

public class exerc01 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro A: ");
        int A = scanner.nextInt();
        System.out.println("Digite um valor inteiro B: ");
        int B = scanner.nextInt();
        System.out.println("Digite um valor inteiro C: ");
        int C = scanner.nextInt();
        System.out.println("Digite um valor inteiro D: ");
        int D = scanner.nextInt();

        int P = A * C;
        int S = B + D;

        System.out.println("Resultado do produto de A e C: " +P);
        System.out.println("Resultado da soma de B e D: " +S);
    }
}
