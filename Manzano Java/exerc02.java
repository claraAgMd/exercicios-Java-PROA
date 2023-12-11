package manzano;

import java.util.Scanner;

public class exerc02 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário mensal (SM): ");
        double salarioMensal = scanner.nextDouble();
        System.out.println("Digite o percentual de reajuste (PR): ");
        double percentualReajuste = scanner.nextDouble();


        double valorReajuste = salarioMensal * (percentualReajuste / 100);


        double novoSalario = salarioMensal + valorReajuste;

        System.out.println("O valor do novo salário (NS) é: " + novoSalario);
    }
    }

