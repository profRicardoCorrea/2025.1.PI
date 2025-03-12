package com.exemplo.fundamentos;

/**
 * Demonstração de variáveis e tipos de dados em Java
 */
public class VariaveisETiposDeDados {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        int idade = 25;
        double altura = 1.75;
        char sexo = 'M';
        boolean estudante = true;
        String nome = "João";

        // Demonstração de operações matemáticas
        double peso = 70.5;
        double imc = peso / (altura * altura);

        // Exibindo informações
        System.out.println("=== Informações Pessoais ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Sexo: " + sexo);
        System.out.println("É estudante? " + estudante);

        // Demonstração de operações matemáticas básicas
        int num1 = 10;
        int num2 = 5;
        System.out.println("\n=== Operações Matemáticas ===");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Divisão: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
} 