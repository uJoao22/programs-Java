package aulaP2;

import java.util.Scanner;

public class Basico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String name = sc.nextLine();
		
		System.out.println("Ol� " +name);
		System.out.println("� um prazer te conhecer!");
		
		System.out.println("Qual a sua idade?");
		int idade = sc.nextInt();
		
		if (idade < 18) {
		System.out.println("Voc� n�o pode entrar, permitido apenas para maiores de 18 anos.");
		}
		else {
			System.out.println("Entrada liberada, seja bem vindo");
		}
		sc.close();
	}
}