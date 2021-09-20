package Lista_1;

import java.util.Scanner;

public class Numeros_Fracionarios { /*Faça um algoritmo em Java que ler 3 números fracionários do teclado (lembrar de colocar as informações do que é para 
							ser feito para o usuário), ao final informar ao usuário se o primeiro é maior do que a soma dos dois últimos.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que informa se o primeiro número é maior que a soma dos dois últimos");
		
		System.out.println("\nDigite o primeiro número fracionário:");
		float num1 = sc.nextFloat();
		
		System.out.println("\nDigite o segundo número fracionário:");
		float num2 = sc.nextFloat();
				
		System.out.println("\nDigite o terceiro número fracionário:");
		float num3 = sc.nextFloat();
		
		if(num1 > num2 + num3) {
			System.out.println("\nO primeiro número é maior que a soma dos dois últimos.");
		} else {
			System.out.println("\nA soma dos dois últimos é maior que o primeiro número.");
		}
		
		sc.close();
	}
}
