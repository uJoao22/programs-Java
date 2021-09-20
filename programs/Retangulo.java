package prova;

import java.util.Scanner;

public class Retangulo { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que faz um ret�ngulo com asteriscos");

		System.out.println("\nDigite o valor do comprimento:");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite o valor da altura:");
		int num2 = sc.nextInt();
		
		for (int i=1; i <= num2; i++){
			for (int j=1; j <= num1; j++){
				System.out.print("*");			
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
}