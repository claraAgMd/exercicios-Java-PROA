package lista1java;

public class Exerc10 {
	public static void main(String[]args) {
		int[] valores = {0,2,4,65,42,-2,78};
		for (int i : valores) {
			if(i < 0) {
			break;	
			}else {
			System.out.println(i);
			}
		}
		
	}
}
