import java.util.Scanner;

public class 1153 {

	public static void main(String[] hadouken) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		System.out.println(fatorial(n));
		
		entrada.close();
	}

	public static int fatorial(int n) {
		int soma = 1;
		for(int i = 1; i <= n; i++) {
			soma *= i;
		}
		return soma;
	}

}
