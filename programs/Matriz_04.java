package Lista_4;

import java.util.Scanner;

public class Matriz_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mat[][] = new int[4][5];
		int x = 0;
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Digite:");
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<mat.length; i++) {
			int soma = 0;
			for (int j=0; j<mat[i].length; j++) {
				soma+= mat[i][j];
				x = soma / 5; 
			}
			System.out.println("A m�dia desta linha �: " +x);
		}	
		sc.close();
	}
}