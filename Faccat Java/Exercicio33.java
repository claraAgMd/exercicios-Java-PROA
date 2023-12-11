package FaccatJava;

import java.util.Scanner;
public class Exerc33 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o usuário");
		int user = leia.nextInt();
		
		if(user == 1234) {
			System.out.println("Informe a senha do usuário!");
			int senha = leia.nextInt();
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Acesso negado");
			}
		}else {
			System.out.println("Acesso negado");
		}
		leia.close();
	}
}
