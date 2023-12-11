package FaccatJava;

import java.util.Scanner;

public class Exerc31 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a idade do primeiro homem");
		int homemA = leia.nextInt();
		System.out.println("Informe a idade do segundo homem");
		int homemB = leia.nextInt();
		System.out.println("Informe a idade da primeira mulher");
		int mulherA = leia.nextInt();
		System.out.println("Informe a idade da segunda mulher");
		int mulherB = leia.nextInt();
		leia.close();
		int homemNovo = 0;
		int homemVelho = 0;
		int mulherNova = 0;
		int mulherVelha = 0;

		if (homemA > homemB) {
			homemVelho = homemA;
			homemNovo = homemB;
		} else {
			homemVelho = homemB;
			homemNovo = homemA;
		}
		if (mulherA > mulherB) {
			mulherVelha = mulherA;
			mulherNova = mulherB;
		} else {
			mulherVelha = mulherB;
			mulherNova = mulherA;
		}
		int soma = homemVelho + mulherNova;
		int produto = homemNovo * mulherVelha;
		System.out.println("A soma do homem mais velho com a mulher mais nova é " + soma);
		System.out.println("O produto do homem mais novo com a mulher mais velha é " + produto);

	}
}
