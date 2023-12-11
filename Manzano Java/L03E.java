package manzano;

public class L03E {
    public static void main(String[] args) {
        int base = 3;
        int expoente = 0;
        int resultado = 1;

        System.out.println("Potências de 3:");

        while (expoente <= 15) {
            System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
            resultado *= base;
            expoente++;
        }
    }
}

