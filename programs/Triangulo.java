package Lista_1;

import java.util.Scanner;

public class Triangulo { /*Fa�a um algoritmo em Java que ler um n�mero inteiro (lembrar de colocar as informa��es do que � para ser feito para o 
							usu�rio), ao final, imprime um tri�ngulo de asteriscos com o tamanho definido pelo n�mero que foi lido. Exemplo:
							Digite o tamanho para seu tri�ngulo: 3
							*
							**
							***
							*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que faz um tri�ngulo com asteriscos");

		System.out.println("\nDigite um n�mero inteiro");
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