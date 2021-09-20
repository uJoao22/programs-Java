package Lista_1;

import java.util.Scanner;

public class Fatorial { //Faça um algoritmo em Java que ler um número e mostrar o fatorial. 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra o fatorial de um número");
		
		System.out.println("\nDigite o número:");
		int num = sc.nextInt();
		
		int x = num;
		
		while (x > 1) {
			num = num * (x-1);
			x= x-1;
		}
		
		System.out.println("\nO valor fatorial é: " +num);
		
		sc.close();
	}
}
