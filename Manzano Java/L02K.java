package manzano;

import java.util.Scanner;

public class L02K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        if (valor <= 3) {
            System.out.println("O valor é: " + valor);
        }
    }
}

