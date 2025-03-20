package aula_12_03;

import java.util.Scanner;

public class SinalIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a cor do sinal (verde, amarelo, vermelho): ");
		String sinal = scanner.nextLine().toLowerCase();

		if (sinal.equals("verde")) {
			System.out.println("SIGA");
		} else if (sinal.equals("amarelo")) {
			System.out.println("ATENÇÃO");
		} else if (sinal.equals("vermelho")) {
			System.out.println("PARE");
		} else {
			System.out.println("ERRO: Cor inválida!");
		}

		scanner.close();
	}
}
