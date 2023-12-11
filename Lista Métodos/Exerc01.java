package ListaMetodos;

import java.util.Scanner;

public class Exerc01 {
	
	static int somar(int primeiroValor, int segundoValor) {
		return primeiroValor + segundoValor;
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um valor:");
		int primeiroValor = leia.nextInt();
		
		System.out.println("Informe outro valor:");
		int segundoValor = leia.nextInt();
		
		System.out.println("A soma dos valores é: " + Exerc01.soma(primeiroValor, segundoValor));
		
		leia.close();
	}
}
