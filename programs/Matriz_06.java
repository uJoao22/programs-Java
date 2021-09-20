import java.util.*;

public class Matriz_06 {

	public static void main(String[] args) {
		int [][] matriz= new int [10][10];
		imprimematriz(matriz);
	}
		  	
	public static void imprimematriz(int [][]n) {
		Scanner sc = new Scanner (System.in);
		      
		for(int i=0; i<n.length; i++) {
			for(int j =0; j< n[i].length;j++){
				System.out.println("Digite:");
		        n[i][j] = sc.nextInt();
		    }
		    System.out.println();
		}
		      
		for(int i=0; i<n.length; i++){
			for(int j =0; j<n[i].length; j++){
				System.out.printf("  %2d ",n[i][j]);
		    }
		    System.out.println();
		}
		sc.close();
	}
}