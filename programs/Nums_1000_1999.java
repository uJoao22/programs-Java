package Lista_1;

public class Nums_1000_1999 {//Faça um algoritmo em Java que informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
número
	public static void main(String[] args) {
		
		System.out.println("Programa que mostra todos os números de 1000 a 1999 que quando divididos por 11 o resto é 5\n");
		
		for (int i = 1000; i <= 1999; i++) {
			
			if(i%11==5) {
				System.out.println(i);	
			}
		}
		
	}
}
