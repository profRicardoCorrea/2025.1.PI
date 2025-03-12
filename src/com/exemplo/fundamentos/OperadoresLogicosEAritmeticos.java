package com.exemplo.fundamentos;

/**
 * Demonstração de operadores lógicos e aritméticos
 */
public class OperadoresLogicosEAritmeticos {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 15;
        int b = 4;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("Adição: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtração: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplicação: " + a + " * " + b + " = " + (a * b));
        System.out.println("Divisão: " + a + " / " + b + " = " + ((double) a / b));
        System.out.println("Resto: " + a + " % " + b + " = " + (a % b));

        // Operadores lógicos
        boolean temSol = true;
        boolean temChuva = false;
        int temperatura = 25;
        
        System.out.println("\n=== Operadores Lógicos ===");
        
        // Operador AND (&&)
        boolean diaAgradavel = temSol && temperatura < 30;
        System.out.println("Está sol E temperatura agradável? " + diaAgradavel);
        
        // Operador OR (||)
        boolean ficarEmCasa = temChuva || temperatura > 35;
        System.out.println("Deve ficar em casa? " + ficarEmCasa);
        
        // Operador NOT (!)
        System.out.println("Não está chovendo? " + !temChuva);
    }
} 