package aulaP2;

import java.util.Scanner;

public class Funcao_05_maiorNum {
	
	public static int dif(int x, int y) {
		if(x > y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite outro n�mero:");
		int num2 = sc.nextInt();
		
		System.out.println("\nO maior �: " +dif(num1,num2));
		
		sc.close();
	}
}