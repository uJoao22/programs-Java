package aulaP2;

import java.util.Scanner;

public class Triangulo_Asterisco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro");
		int num = sc.nextInt();
		
		for (int i=1; i <= num; i++){
			for (int j=1; j <= i; j++){
				System.out.print("*");			
			}
			System.out.print("\n");
		}
		
	sc.close();
	}
}