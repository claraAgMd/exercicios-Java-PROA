package FaccatJava;

import java.util.Scanner;
public class Exerc36 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o número do funcionário!");
		String nFuncionario = leia.next();
		System.out.println("Informe o ano de nascimento do funcionario!");
		int anoNascimento = leia.nextInt();
		System.out.println("Informe o ano de ingresso da empresa!");
		int entradaEmpresa = leia.nextInt();
		System.out.println("Informe o ano atual!");
		int anoAtual = leia.nextInt();
		leia.close();
		int idadeFuncionario = anoAtual-anoNascimento;
		int tempoDeEmpresa = anoAtual-entradaEmpresa;
		if(idadeFuncionario>64) {
			System.out.println(nFuncionario + " Requerer aposentadoria!");
		} else if(tempoDeEmpresa>29) {
			System.out.println(nFuncionario + " Requerer aposentadoria!");
		}else if(idadeFuncionario > 59 && tempoDeEmpresa > 24) {
			System.out.println(nFuncionario + " Requerer aposentadoria!");
		}else {
			System.out.println(nFuncionario + " Não requerer aposentadoria!");
		}
		
	}
}
