package lista_2;

import java.util.Scanner;

public class Funcao_Fatorial {
	
	public static int fat(int x, int y) {
		while (x > 1) {
			y = y * (x-1);
			x--;
		}
		return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra o fatorial de um número usando funções");
		
		System.out.println("\nDigite um número para ter o seu fatorial:");
		int num = sc.nextInt();
		
		System.out.println("O seu fatorial: " +fat(num, num));
		
		sc.close();
	}
}