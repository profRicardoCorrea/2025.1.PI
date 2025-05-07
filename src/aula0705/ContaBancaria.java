package aula0705;

public class ContaBancaria {
    // Atributos
    private String numeroConta;
    private String titular;
    private double saldo;
    private boolean contaAtiva;
    private String tipoConta; // corrente, poupança
    private double limiteChequeEspecial;

    // Construtores
    public ContaBancaria() {
        this.saldo = 0.0;
        this.contaAtiva = true;
        this.limiteChequeEspecial = 0.0;
    }

    public ContaBancaria(String numeroConta, String titular, String tipoConta) {
        this();
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipoConta = tipoConta;
    }

    // Métodos
    public void depositar(double valor) {
        if (valor > 0 && contaAtiva) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public boolean sacar(double valor) {
        if (contaAtiva && valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
            return true;
        }
        System.out.println("Saque não permitido");
        return false;
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
        if (saldo < 0) {
            System.out.println("Usando cheque especial!");
        }
    }

    public void ativarChequeEspecial(double limite) {
        this.limiteChequeEspecial = limite;
        System.out.println("Cheque especial ativado com limite de R$ " + limite);
    }

    // Getters e Setters (implementar conforme necessidade)
} 