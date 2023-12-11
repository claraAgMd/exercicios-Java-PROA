package manzano;
import java.util.Scanner;

public class exercK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.println("Digite a quantidade de reais disponíveis: ");
        double quantidadeReais = scanner.nextDouble();

        double valorEmDolares = quantidadeReais / cotacaoDolar;

        System.out.println("O valor em dólares é: $" + valorEmDolares);
    }
}

