package aulaP2;

import java.util.Scanner;

public class Numeros_porExtenso {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para escrever n�meros por extenso");
		System.out.println("\nDigite um n�mero de 1 a 9:\n");
		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tr�s");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Sete");
			break;
		case 8:
			System.out.println("Oito");
			break;
		case 9:
			System.out.println("Nove");
			break;
		default:
			System.out.println("N�mero inv�lido");
		}
		
		sc.close();
	}
}