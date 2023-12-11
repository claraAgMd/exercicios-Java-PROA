package ListaMetodos;

import java.util.Scanner;

public class Exerc05 {

	static int contarVogais(String texto) {
	
		String textoMinusculo = texto.toLowerCase();
			
		char[] caracteres = textoMinusculo.toCharArray();
		
		int quantidadeVogais = 0;
		
		for (int i = 0; i < caracteres.length; i++) {
			
			if(caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
				quantidadeVogais++;
			}
			
		}
		return quantidadeVogais;
	}
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
	        System.out.println("Escreva um texto!");
	        String texto = leia.nextLine();
	        leia.close();
	        System.out.println("O texto informado tem "+contarVogais(texto) + " vogais");

	        
	    }
		
		
	}