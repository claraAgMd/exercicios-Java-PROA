package manzano;

import java.util.Scanner;

public class L02C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota em Português: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua nota em Matemática: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua nota em Educação Física: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite sua nota em Artes: ");
        double nota4 = scanner.nextDouble();

        double mediaEscolar = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média escolar: " + mediaEscolar);

        if (mediaEscolar >= 5) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
