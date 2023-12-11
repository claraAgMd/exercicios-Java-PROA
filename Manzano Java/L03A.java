package manzano;

import java.util.Scanner;

public class L03A {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int valor = scanner.nextInt();

       int i = 1;

       while (i < 11) {
           int tabuada = valor * i;
           System.out.println(valor + "x" +i+ "=" +tabuada);
           i++;
       }
    }
}
