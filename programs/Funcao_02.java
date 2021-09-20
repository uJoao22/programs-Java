package aulaP2;

public class Funcao_02 {
	
	public static int retorna(int num) {
		num++;
		return num;
	}

	public static void main(String[] args) {
		
		System.out.println("====");
		int n=8;
		int num = retorna(n);
		System.out.println(num);
		
	}
}