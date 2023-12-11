package manzano;

import java.util.Scanner;

public class exercF {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para a variável A: ");
        double A = scanner.nextDouble();

        System.out.println("Digite um valor para a variável B: ");
        double B = scanner.nextDouble();

        double temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A após a troca: " + A);
        System.out.println("Valor de B após a troca: " + B);


    }
}
