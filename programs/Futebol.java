package Lista_1;

import java.util.Scanner;

public class Futebol { /*Faça um algoritmo em Java que ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever 
							o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra o resultado de uma partida de futebol");
		
		System.out.println("\n\nDigite o nome do primeiro time:");
		String time1 = sc.nextLine();
		
		System.out.println("\nDigite o nome do segundo time:");
		String time2 = sc.nextLine();
		
		System.out.println("\nQuantos gols o " +time1+ " marcou?");
		int gols1 = sc.nextInt();
		
		System.out.println("\nQuantos gols o " +time2+ " marcou?");
		int gols2 = sc.nextInt();
		
		if(gols1 > gols2) {
			System.out.println("\nO vencedor foi o " +time1);
		} else if(gols2 > gols1){ 
			System.out.println("\nO vencedor foi o " +time2);
		} else {
			System.out.println("\nEMPATE");
		}
		
		sc.close();
	}
}