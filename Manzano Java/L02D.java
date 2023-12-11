package manzano;

import java.util.Scanner;

public class L02D {
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

        double mediaEscolar = (nota1 + nota2 + nota3 + nota4)/4;

        if (mediaEscolar >= 7) {
            System.out.println("Aprovado! Média: " +mediaEscolar);
        }else {
            if (mediaEscolar < 7) {
                System.out.println("Digite sua nota no exame de recuperação: ");
                double exame = scanner.nextDouble();
                double media = (exame + mediaEscolar) / 2;

                if (media >= 5) {
                    System.out.println("Aluno aprovado em exame! Média: " +mediaEscolar);
                }else{
                    System.out.println("Reprovado. Média: " +mediaEscolar);
                }

            }
        }
    }
}
