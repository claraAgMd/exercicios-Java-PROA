package FaccatJava;

import java.util.Scanner;
public class Exerc34 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o nome do produto");
		String produto = leia.next();
		System.out.println("Informe o preço do produto");
		float preco = leia.nextFloat();
		System.out.println("Informe a quantidade que deseja comprar");
		int quantidade = leia.nextInt();
		leia.close();
		float valorTotal = quantidade*preco;
		if(quantidade <= 5) {
			valorTotal= valorTotal-((valorTotal*2)/100);
		}else if(quantidade > 5 && quantidade <=10) {
			valorTotal= valorTotal-((valorTotal*3)/100);
		}else {
			valorTotal=valorTotal-((valorTotal*5)/100);
		}
		System.out.println("Produto: " + produto + " Quantidade: " + quantidade + " Total: " + valorTotal + "R$");
		
	}

}
