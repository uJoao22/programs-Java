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
		
		System.out.println("Digite um número:");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite outro número:");
		int num2 = sc.nextInt();
		
		System.out.println("\nO maior é: " +dif(num1,num2));
		
		sc.close();
	}
}