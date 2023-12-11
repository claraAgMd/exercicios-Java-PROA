package manzano;


import java.util.Scanner;

public class exercC {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();
        System.out.println("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        String volumeFormatado = String.format("%.2f", volume);

        System.out.println("O volume da lata de óleo é de: " + volumeFormatado);



    }
}

