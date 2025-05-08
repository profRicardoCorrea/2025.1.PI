package aula0705;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens;
    private double valorTotal;
    private int quantidadeItens;
    private boolean fechado;
    private String cliente;
    private String formaPagamento;
    private double desconto;
    private boolean possuiCupom;
    private String status; // aberto, fechado, pago
    private String dataCompra;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
        this.quantidadeItens = 0;
        this.fechado = false;
        this.status = "aberto";
    }

    public CarrinhoDeCompras(String cliente) {
        this();
        this.cliente = cliente;
    }

    // Métodos específicos
    public void adicionarItem(String item, double preco) {
        if (!fechado) {
            itens.add(item);
            this.valorTotal += preco;
            this.quantidadeItens++;
            System.out.println("Item adicionado: " + item);
        }
    }

    public void removerItem(String item, double preco) {
        if (!fechado && itens.remove(item)) {
            this.valorTotal -= preco;
            this.quantidadeItens--;
            System.out.println("Item removido: " + item);
        }
    }

    public void aplicarDesconto(double percentual) {
        if (!fechado && percentual > 0 && percentual <= 100) {
            this.desconto = (percentual/100) * valorTotal;
            System.out.println("Desconto aplicado: R$ " + desconto);
        }
    }

    // Getters e Setters
    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public boolean isPossuiCupom() {
        return possuiCupom;
    }

    public void setPossuiCupom(boolean possuiCupom) {
        this.possuiCupom = possuiCupom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
} 