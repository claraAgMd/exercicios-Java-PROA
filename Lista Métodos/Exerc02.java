package ListaMetodos;

import java.util.Scanner;

public class Exerc02 {

	static boolean valorPrimo(int numero) {
		int contagemDivisores = 0;
		if (numero < 2) {
			return false;
		} else {
			for (int contador = 1; contador <= numero; contador++) {
				if (numero % contador == 0) {
					contagemDivisores++;
				}
			}

			if (contagemDivisores < 3) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int numero = leia.nextInt();
		System.out.println(Exerc02.valorPrimo(numero));
		leia.close();
	}
}
