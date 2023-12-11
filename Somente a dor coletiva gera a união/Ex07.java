package lista1java;

public class Exerc07 {
	public static void main(String[]args) {
		for(int i = 1; i < 6; i++) {
			if(i ==3) {
				break;
			}else {
			
			switch (i) {
			case 1:
				System.out.println("Número 1");
				break;

			case 2:
				System.out.println("Número 2");
				break;

			case 4:
				System.out.println("Número 3");
				break;

			case 5:
				System.out.println("Número 5");
				break;

			default:
				System.out.println("Número inválido");
				break;
			}
			}
		}
	}
}
