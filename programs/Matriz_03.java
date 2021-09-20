package Lista_4;

import java.util.Scanner;

public class Matriz_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mat[][] = new int[4][5];
		int menor=999999999, l=0, c=0;
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Digite:");
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < menor) {
					menor= mat[i][j];
					l= i;
					c= j;
				}
			}
		}
		System.out.println("\nO menor número é: " +menor+ " e ele está na linha " +l+ " e na coluna " +c);
		sc.close();
	}
}