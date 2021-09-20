package Lista_1;

public class Nums_1000_1999 {//Fa�a um algoritmo em Java que informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.

	public static void main(String[] args) {
		
		System.out.println("Programa que mostra todos os n�meros de 1000 a 1999 que quando divididos por 11 o resto � 5\n");
		
		for (int i = 1000; i <= 1999; i++) {
			
			if(i%11==5) {
				System.out.println(i);	
			}
		}
		
	}
}
