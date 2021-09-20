package teste;

import java.util.Scanner;

public class Salario_Liquido {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double dia, tot, juros;
		
		System.out.println("Insira o número de dias trabalhados esse mes: ");
		dia = leia.nextInt();
		
		tot = dia * 20;
		juros = (tot/100) * 0.08;
		
		System.out.println("O valor liquido será: " +juros);
		
		leia.close();
	}
}