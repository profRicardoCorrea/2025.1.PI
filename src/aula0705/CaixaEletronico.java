package aula0705;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
    private String identificacao;
    private boolean emOperacao;
    private double saldoDisponivel;
    private List<String> notasDisponiveis;
    private boolean precisaManutencao;
    private String bancoResponsavel;
    private boolean cartaoInserido;
    private String ultimaTransacao;
    private boolean impressoraPapel;
    private String localizacao;

    public CaixaEletronico() {
        this.emOperacao = true;
        this.notasDisponiveis = new ArrayList<>();
        this.precisaManutencao = false;
        this.cartaoInserido = false;
        this.impressoraPapel = true;
    }

    public CaixaEletronico(String identificacao, String bancoResponsavel, String localizacao) {
        this();
        this.identificacao = identificacao;
        this.bancoResponsavel = bancoResponsavel;
        this.localizacao = localizacao;
    }

    // Métodos específicos
    public void sacar(double valor) {
        if (emOperacao && saldoDisponivel >= valor && cartaoInserido) {
            this.saldoDisponivel -= valor;
            this.ultimaTransacao = "Saque: R$ " + valor;
            System.out.println("Saque realizado: R$ " + valor);
        }
    }

    public void inserirCartao() {
        if (!cartaoInserido) {
            this.cartaoInserido = true;
            System.out.println("Cartão inserido");
        }
    }

    public void retirarCartao() {
        if (cartaoInserido) {
            this.cartaoInserido = false;
            System.out.println("Retire seu cartão");
        }
    }

    // Getters e Setters
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    // ... implementar os demais getters e setters
} 