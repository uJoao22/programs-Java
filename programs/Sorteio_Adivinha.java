package Lista_1;

import java.util.Scanner;
import java.util.Random;

public class Sorteio_Adivinha { /*Fa�a um algoritmo em Java que utilize as duas linhas iniciais no m�todo Main() sejam: 
							Random rnd = new Random(); //Inicia Aleat�rio 
							int x = rnd.nextInt(100); //Gera um n�mero aleat�rio (0 � 99) 
							Fa�a um la�o de repeti��o que solicite ao usu�rio digitar um n�mero (lembrar de colocar as informa��es do que � para 
							ser feito para o usu�rio). O la�o encerra quando o usu�rio acertar o n�mero sorteado. Se o n�mero do usu�rio for menor 
							que o oculto (sorteado), escrever: �MAIOR�, se o n�mero do usu�rio for maior que o oculto (sorteado), escrever: �MENOR�. 
							Ao final deve ser mostrado que acertou e quantas tentativas foram feitas.*/

	public static void main(String[] args) {
		Random rnd = new Random();
		int x = rnd.nextInt(100);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que sorteia um n�mero para voc� adivinhar\n\n");
		
		System.out.println("Tente a sorte!");
		System.out.println("Digite um n�mero de 0 a 99");
		int num = sc.nextInt();
		
		while(num != x) {
			
			if(num > x) {
				System.out.println("\n� MENOR");
			} else {
				System.out.println("\n� MAIOR");
			}
			
			System.out.println("Tente novamente");
			num = sc.nextInt();
		}
		
		System.out.println("\nAcertou!");
		
		sc.close();
	}
}