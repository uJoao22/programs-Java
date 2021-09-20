package prova;

import java.util.Scanner;

public class Soma_50_Num { 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Programa que mostra a soma de 50 at� um n�mero informado");
			
			System.out.println("\nDigite um n�mero:");
			int num = sc.nextInt();
			
			int x=0;
			
			if (num > 50) {
			for (int i = 50; i <= num; i++) {
				x = x + i;
			}
			System.out.println(x);
			} else {
				System.out.println("\nDigite um n�mero maior que 50");
			}

		sc.close();
	}
}