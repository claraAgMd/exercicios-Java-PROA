package manzano;

import java.util.Scanner;

public class L02H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        System.out.println("Digite o quarto número inteiro: ");
        int numero4 = scanner.nextInt();

        System.out.println("Digite o quinto número inteiro: ");
        int numero5 = scanner.nextInt();

        int maior = numero1;
        int menor = numero1;

        if (numero2 > maior) {
            maior = numero2;
        } else if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }

        if (numero4 > maior) {
            maior = numero4;
        } else if (numero4 < menor) {
            menor = numero4;
        }

        if (numero5 > maior) {
            maior = numero5;
        } else if (numero5 < menor) {
            menor = numero5;
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}

