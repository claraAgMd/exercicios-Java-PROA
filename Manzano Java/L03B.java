package manzano;

public class L03B {
    public static void main(String[] args) {
        int valor = 1;
        int soma = 0;

        while (valor <= 100) {
            soma = soma + valor;
            valor++;
        }

        System.out.println("A soma dos 100 primeiros números é: " + soma);
    }
}

