package Lista_1;

import java.util.Scanner;

public class Fatorial { //Fa�a um algoritmo em Java que ler um n�mero e mostrar o fatorial. 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra o fatorial de um n�mero");
		
		System.out.println("\nDigite o n�mero:");
		int num = sc.nextInt();
		
		int x = num;
		
		while (x > 1) {
			num = num * (x-1);
			x= x-1;
		}
		
		System.out.println("\nO valor fatorial �: " +num);
		
		sc.close();
	}
}
