package Lista_1;

import java.util.Scanner;

public class Num_Maior_10 { /*Faça um algoritmo em Java que ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, 
							caso contrário escrever NÃO É MAIOR QUE 10!*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que fala se um número é maior que 10");
		
		System.out.println("\nDigite um número");
		int num = sc.nextInt();
		
		if(num > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else if(num == 10) {
			System.out.println("É IGUAL A 10!");
		}else{
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		
		sc.close();
	}
}