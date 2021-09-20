package lista_2;

import java.util.Scanner;

public class Funcao_Triangulo_Quadrado {
	
	public static int dif(int o, int n, int j, int i) {
		switch (o) {
		case 1:
			for (i=1; i <= n; i++){
				for (j=1; j <= i; j++){
					System.out.print("*");			
				}
				System.out.print("\n");
				}	
			break;
			
		case 2:
			for (i=1; i <= n; i++){
				for (j=1; j <= n; j++){
					System.out.print("*");			
				}
				System.out.print("\n");
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que faz triangulo e quadrado com asteriscos usando fun��es");

		System.out.println("\nDigite 1 para Tri�ngulo");
		System.out.println("Digite 2 para Quadrado");
		int option = sc.nextInt();
		
		System.out.println("\nDigite o tamanho que deseja");
		int num = sc.nextInt();
		
		dif(option,num,num,num);

		sc.close();
	}
}