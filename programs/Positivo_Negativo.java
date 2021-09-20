package Lista_1;

import java.util.Scanner;

public class Positivo_Negativo { //Fa�a um algoritmo em Java que ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo)

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que fala se um n�mero � positivo ou negativo");
		
		System.out.println("\nDgite um n�mero:");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Este n�mero � positivo");
		} else {
			System.out.println("Este n�mero � negativo");
		}
		
		sc.close();
	}
}
