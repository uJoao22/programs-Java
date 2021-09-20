package Lista_1;

import java.util.Scanner;

public class Ordem_Cresc_Decresc { /*Fa�a um algoritmo em Java que ler 3 inteiros do teclado os valores em qualquer ordem (lembrar de colocar as informa��es 
							do que � para ser feito para o usu�rio), ao final mostre ao usu�rio os valores em ordem crescente e decrescente. */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Programa que coloca os n�meros em ordem crsescente e descrescente.");
		
		System.out.println("\n\nDigite o primeiro n�mero inteiro:");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite o segundo n�mero inteiro:");
		int num2 = sc.nextInt();
		
		System.out.println("\nDigite o terceiro n�mero inteiro:");
		int num3 =sc.nextInt();
		
		if(num1 > num2 && num2 > num3) {
			System.out.println("\nEm ordem crescente: " +num3+ ", " +num2+ " e " +num1);
			System.out.println("Em ordem decrescente: " +num1+ ", " +num2+ " e " +num3);
		} 
		else if(num1 > num3 && num3 > num2) {
			System.out.println("\nEm ordem crescente: " +num2+ ", " +num3+ " e " +num1);
			System.out.println("Em ordem decrescente: " +num1+ ", " +num3+ " e " +num2);
		}
		else if(num2 > num1 && num1 > num3) {
			System.out.println("\nEm ordem crescente: " +num3+ ", " +num1+ " e " +num2);
			System.out.println("Em ordem decrescente: " +num2+ ", " +num1+ " e " +num3);
		}
		else if(num2 > num3 && num3 > num1) {
			System.out.println("\nEm ordem crescente: " +num1+ ", " +num3+ " e " +num2);
			System.out.println("Em ordem decrescente: " +num2+ ", " +num3+ " e " +num1);
		}
		else if(num3 > num1 && num1 > num2) {
			System.out.println("\nEm ordem crescente: " +num2+ ", " +num1+ " e " +num3);
			System.out.println("Em ordem decrescente: " +num3+ ", " +num1+ " e " +num2);
		}
		else if(num3 > num2 && num2 > num1) {
			System.out.println("\nEm ordem crescente: " +num1+ ", " +num2+ " e " +num3);
			System.out.println("Em ordem decrescente: " +num3+ ", " +num2+ " e " +num1);
		}
		
		sc.close();
	}
}