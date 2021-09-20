 package Lista_1;

import java.util.Scanner;

public class Maior_Menor_Num { //Fa�a um algoritmo em Java que Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que fala qual n�mero � maior que o outro");
		
		System.out.println("\nDigite o primeiro n�mero:");
		int num1 = sc.nextInt();
		
		System.out.println("\nDigite o segundo n�mero:");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("\nO maior n�mero �: " +num1);
		} else {
			System.out.println("\nO maior n�mero �: " +num2);
		}
		
		sc.close();
	}
}
