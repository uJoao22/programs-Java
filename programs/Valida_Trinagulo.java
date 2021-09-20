package Lista_1;

import java.util.Scanner;

public class Valida_Trinagulo { /*Faça um algoritmo em Java que ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever 
							se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 
							2 lados.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que informa se é um triângulo\n");
		
		System.out.println("Digite a medida de um lado:");
		float a = sc.nextFloat();
		
		System.out.println("Digite a medida de outro lado:");
		float b = sc.nextFloat();
		
		System.out.println("Digite a medida de mais um dos lados:");
		float c = sc.nextFloat();
		
		if(a < b+c && b < a+c && c < a+b) {
			System.out.println("Forma um triângulo!");
		} else {
			System.out.println("Não forma um triângulo!");
		}
		
		sc.close();
	}
}