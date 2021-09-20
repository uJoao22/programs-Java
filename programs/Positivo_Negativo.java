package Lista_1;

import java.util.Scanner;

public class Positivo_Negativo { //Faça um algoritmo em Java que ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que fala se um número é positivo ou negativo");
		
		System.out.println("\nDgite um número:");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Este número é positivo");
		} else {
			System.out.println("Este número é negativo");
		}
		
		sc.close();
	}
}
