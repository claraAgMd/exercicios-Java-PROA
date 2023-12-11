package manzano;

public class L03C {
    public static void main(String[] args) {
        int numero = 1;
        int somatorio = 0;

        while (numero <= 500) {
            if (numero % 2 == 0) {
                somatorio = somatorio + numero;
            }
            numero++;
        }

        System.out.println("Somatório dos valores pares de 1 a 500: " + somatorio);
    }
}
