package FaccatJavat;

import java.util.Scanner;
public class Exerc22 {
	public static void main(String[]args){
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira a quantidade máxima");
		int qtdMaxima = leia.nextInt();
		System.out.println("Insira a quantidade mínima");
		int qtdMinima = leia.nextInt();
		System.out.println("Insiro o valor total no estoque");
		int qtdEmEstoque = leia.nextInt();
		leia.close();
		int qtdMedia = (qtdMaxima+qtdMinima)/2;
		String mensagem = (qtdEmEstoque>=qtdMedia)?"Não efetuar a compra":"Efetuar a compra";
		System.out.println(mensagem);
		
	}
}
