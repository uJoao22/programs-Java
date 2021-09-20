 package Lista_1;

import java.util.Scanner;

public class Maior_Menor_Num { //Faça um algoritmo em Java que Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que fala qual número é maior que o outro");
		
		System.out.println("\nDigite o primeiro número:");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite o segundo número:");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("\nO maior número é: " +num1);
		} else {
			System.out.println("\nO maior número é: " +num2);
		}
		
		sc.close();
	}
}
