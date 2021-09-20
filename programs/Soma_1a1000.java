package Lista_1;

public class Soma_1a1000 { //Faça um algoritmo em Java que imprima a soma de 1 até 1000.

	public static void main(String[] args) {
		int i, x=0;
		
		System.out.println("Programa que calcula a soma de 1 até 1000");
		
		for (i = 1; i <= 1000; i++) {
			x = x + i;
		}
		
		System.out.println("\nO valor da soma de 1 até 1000 é de: " +x);
	
	}
}
