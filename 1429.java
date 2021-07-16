import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 1429 {

	public static void main(String[] hadouken) {
		Scanner entrada = new Scanner(System.in);

		int i, j, elemento, soma;
		while (entrada.hasNextLine()) {
			String input = entrada.next();
			List<Integer> listaNumeros = new ArrayList<>();

			if (input.equals("0"))
				break;

			for (String caracter : input.split("", 0)) {
				listaNumeros.add(Integer.valueOf(caracter));
			}
			
			soma = 0;
			for (i = 0, j = listaNumeros.size(); i < listaNumeros.size(); ++i, --j) {
				elemento = listaNumeros.get(i);
				soma += elemento * fatorial(j);
			}
			System.out.println(soma);
		}

		entrada.close();
	}

	public static int fatorial(int i) {
		int sum = 1;
		for (int j = 1; j <= i; j++) {
			sum *= j;
		}
		return sum;
	}

}
