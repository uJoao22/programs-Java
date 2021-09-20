package aulaP2;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a sua nota?");
		int nota = sc.nextInt();
		
		if (nota >= 90 && nota<=100){
			System.out.println("Você tirou A");
		}
		
		if (nota >= 80 && nota<=89){
			System.out.println("Você tirou B");
		}
		
		if (nota >= 70 && nota<=79){
			System.out.println("Você tirou C");
		}
		
		if (nota >= 60 && nota<=69){
			System.out.println("Você tirou D");
		}
		
		if (nota >= 0 && nota<=59){
			System.out.println("Você tirou E");
		} 
		
		sc.close();
	}
}