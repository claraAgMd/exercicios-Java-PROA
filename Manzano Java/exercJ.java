package manzano;

import java.util.Scanner;

public class exercJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.println("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();
        double valorEmReais = cotacaoDolar * quantidadeDolares;

        System.out.println("O valor em moeda brasileira (real) é: R$" + valorEmReais);
    }
}

