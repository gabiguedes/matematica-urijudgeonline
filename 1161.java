package map;

import java.util.Scanner;

public class 1161 {

	public static void main(String[] hadouken) {
		Scanner entrada = new Scanner(System.in);

		while(entrada.hasNext()) {
			long n = entrada.nextLong();
			long m = entrada.nextLong();
			System.out.println(fatorial(n, m));
		}

		entrada.close();
	}

	private static long fatorial(long numero, long numero1) {
		long soma = 1L;
		long soma1 = 1L;
		long somaTotal = 0L;

		for (int i = 1; i <= numero; i++) {
			soma *= i;
		}

		for (int i = 1; i <= numero1; i++) {
			soma1 *= i;
		}

		somaTotal += soma + soma1;
		return somaTotal;
	}

}
