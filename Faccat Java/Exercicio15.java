package FaccatJava;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	 
			System.out.println("Digite o ano Atual");

			int anoAtual = sc.nextInt();

			System.out.println("Digite o seu ano de nascimento");

			int anoNascimento = sc.nextInt();
	 
			int subtracao = anoAtual - anoNascimento;
	 
			if (subtracao >= 18) {

				System.out.println("Sua idade é: " + subtracao + " anos");

				System.out.println("Você pode votar");

			} else {

				System.out.println("Sua idade é: " + subtracao + " anos");

				System.out.println("Você não pode votar");

			}
	 
		}
}
