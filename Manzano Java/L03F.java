package manzano;

public class L03F {
    public static void main(String[] args) {
        int base = 2; 
        int expoente = 5; 
        int resultado = 1;

        System.out.println("Resultado da potência:");

        int contador = 0;
        while (contador < expoente) {
            resultado *= base;
            contador++;
        }

        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
}
