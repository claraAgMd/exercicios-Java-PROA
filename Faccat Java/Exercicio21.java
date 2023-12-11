package FaccatJava;

import java.util.Scanner;

public class Exerc21 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu saldo");
		float saldo = leia.nextFloat();
		System.out.println("Informe seu debito");
		float debito = leia.nextFloat();
		System.out.println("Informe seu credito");
		float credito = leia.nextFloat();
		float saldoAtual = (saldo-debito+credito);
		String mensagem = (saldoAtual<0)?"Saldo negativo":"Saldo positivo";
		System.out.println(mensagem + ":" + saldoAtual+"R$");
		leia.close();
	}
}
