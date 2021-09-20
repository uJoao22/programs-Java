package Lista_4;

import java.util.Scanner;

public class Matriz_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mat[][] = new int[10][10];
		int maior=0;
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Digite:");
				mat[i][j] = sc.nextInt();
				if(mat[i][j] > maior) {
					maior= mat[i][j];
				}
			}
		}
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + "-");
			}
			System.out.println();
		}	
		System.out.println("O maior número é: " +maior);
		sc.close();
	}
}