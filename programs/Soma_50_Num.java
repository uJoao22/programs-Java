package prova;

import java.util.Scanner;

public class Soma_50_Num { 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Programa que mostra a soma de 50 até um número informado");
			
			System.out.println("\nDigite um número:");
			int num = sc.nextInt();
			
			int x=0;
			
			if (num > 50) {
			for (int i = 50; i <= num; i++) {
				x = x + i;
			}
			System.out.println(x);
			} else {
				System.out.println("\nDigite um número maior que 50");
			}

		sc.close();
	}
}