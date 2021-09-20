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
		
		System.out.println("Programa que mostra qual n�mero � maior usando fun��es");
		
		System.out.println("\nDigite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		System.out.println("\nO maior n�mero �: " +dif(num1,num2));
		
		sc.close();
	}
}