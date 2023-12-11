package lista1java;

public class Exerc04 {
	public static void main(String[]args) {
		int i = 1;
		int A = 1;
		while(i < 6) {
			A=1;
			while(A < 6) {
				if(A == 3) {
					
					A++;
					continue;
				}
				System.out.println(A);
				A++;
			}
			System.out.println(i);
			i++;
		}
	}
}
