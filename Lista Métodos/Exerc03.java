package ListaMetodos;

public class Exerc03 {

	static int calcularMedia(int numeros[]) {
		int soma = 0;
		int media = 0;
		
		for (int numero : numeros) {
			soma += numero;
		}
		media = (soma/numeros.length);
		return media;
		
		
		
	}
	
	
	public static void main(String[]args) {
		int[] numeros = {10,20,30,40,50,60};
		
		System.out.println(Exerc03.calcularMedia(numeros));
		
		
		
	}
}
