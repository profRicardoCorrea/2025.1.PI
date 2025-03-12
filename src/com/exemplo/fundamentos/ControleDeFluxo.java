package com.exemplo.fundamentos;

/**
 * Demonstração de estruturas de controle de fluxo
 */
public class ControleDeFluxo {
    
    public static String verificarNumero(int numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
    }

    public static void contarAte(int limite) {
        System.out.println("\nContando até " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Demonstração de if-else
        int idade = 18;
        System.out.println("=== Verificação de Idade ===");
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Demonstração do método verificarNumero
        System.out.println("\n=== Verificação de Números ===");
        System.out.println("O número 5 é: " + verificarNumero(5));
        System.out.println("O número -3 é: " + verificarNumero(-3));
        System.out.println("O número 0 é: " + verificarNumero(0));

        // Demonstração de loop for
        contarAte(5);

        // Demonstração de while
        System.out.println("\n=== Loop While ===");
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Demonstração de do-while
        System.out.println("\n=== Loop Do-While ===");
        contador = 1;
        do {
            System.out.println("Execução: " + contador);
            contador++;
        } while (contador <= 3);
    }
} 