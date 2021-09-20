package Lista_1;

import java.util.Scanner;

public class Triangulo { /*Faça um algoritmo em Java que ler um número inteiro (lembrar de colocar as informações do que é para ser feito para o 
							usuário), ao final, imprime um triângulo de asteriscos com o tamanho definido pelo número que foi lido. Exemplo:
							Digite o tamanho para seu triângulo: 3
							*
							**
							***
							*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que faz um triângulo com asteriscos");

		System.out.println("\nDigite um número inteiro");
		int num = sc.nextInt();
		
		for (int i=1; i <= num; i++){
			for (int j=1; j <= i; j++){
				System.out.print("*");			
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
}