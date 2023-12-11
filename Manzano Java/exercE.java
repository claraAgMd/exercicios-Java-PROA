package manzano;

import java.util.Scanner;

public class exercE {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor da sua prestação: ");
        double valor = scanner.nextDouble();
        System.out.println("taxa de atraso da sua prestação: ");
        double taxa = scanner.nextDouble();
        System.out.println("Tempo de atraso da sua prestação: ");
        double tempo = scanner.nextDouble();

        double prestacao = valor + ((valor*taxa/100)*tempo);

        System.out.println("O valor da sua prestação em atraso é de: R$"+prestacao);
    }
}
