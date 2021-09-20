package aulaP2;

import java.util.Scanner;

public class Funcao_04_fatorial {
	
	public static int fat(int x, int y) {
		while (x > 1) {
			y = y * (x-1);
			x--;
		}
		return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número para ter o seu fatorial:");
		int num = sc.nextInt();
		
		System.out.println("O seu fatorial: " +fat(num, num));
		
		sc.close();
	}
}