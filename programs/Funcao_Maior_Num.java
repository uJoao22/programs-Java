package lista_2;

import java.util.Scanner;

public class Funcao_Maior_Num {
	
	public static int dif(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra qual número é maior usando funções");
		
		System.out.println("\nDigite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("\nO maior número é: " +dif(num1,num2));
		
		sc.close();
	}
}