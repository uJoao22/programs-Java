package Lista_4;

import java.util.Scanner;

public class Matriz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mat[][] = new int[5][5];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Digite:");
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + "-");
			}
			System.out.println();
		}
		sc.close();
	}
}