package manzano;

import java.util.Scanner;

public class exercH{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comprimento da caixa retangular: ");
        double comprimento = scanner.nextDouble();
        System.out.println("Largura da caixa retangular: ");
        double largura = scanner.nextDouble();
        System.out.println("Altura da caixa retangular: ");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("O volume da caixa retangular é de: " + volume);

    }
}
