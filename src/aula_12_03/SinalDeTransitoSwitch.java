package aula_12_03;

import java.util.Scanner;

public class SinalDeTransitoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a cor do sinal (verde, amarelo, vermelho): ");
        String sinal = scanner.nextLine().toLowerCase();

        switch (sinal) {
            case "verde":
                System.out.println("SIGA");
                break;
            case "amarelo":
                System.out.println("ATENÇÃO");
                break;
            case "vermelho":
                System.out.println("PARE");
                break;
            default:
                System.out.println("ERRO: Cor inválida!");
                break;
        }

        scanner.close();
    }
}

