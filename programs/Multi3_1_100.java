package Lista_1;

public class Multi3_1_100 { //Faça um algoritmo em Java que imprima todos os múltiplos de 3, entre 1 e 100.

	public static void main(String[] args) {
		
		System.out.println("Programa que mostra todos os múltiplos de 3 entre 1 e 100\n");
		
		for(int i = 1; i <= 100; i++) {
			
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		
	}
}
