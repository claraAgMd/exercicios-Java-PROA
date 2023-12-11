package lista1java;

public class Exerc08 {
	public static void main(String[]args) {
		for(int i = 1; i < 11; i++) {
			if(i == 5) {
				continue;
			}
			if(i == 8) {
				break;
			}
			System.out.println(i);
		}
	}
}
