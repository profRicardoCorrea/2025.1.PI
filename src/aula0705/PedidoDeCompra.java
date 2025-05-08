package aula0705;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoDeCompra {
    private String numeroPedido;
    private String cliente;
    private List<String> itens;
    private double valorTotal;
    private Date dataPedido;
    private String status; // Pendente, Aprovado, Em Separação, Enviado
    private String formaPagamento;
    private String enderecoEntrega;
    private double frete;
    private Date previsaoEntrega;

    public PedidoDeCompra() {
        this.itens = new ArrayList<>();
        this.dataPedido = new Date();
        this.status = "Pendente";
        this.valorTotal = 0.0;
    }

    public PedidoDeCompra(String numeroPedido, String cliente, String enderecoEntrega) {
        this();
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
    }

    // Métodos específicos
    public void adicionarItem(String item, double valor) {
        if ("Pendente".equals(status)) {
            itens.add(item);
            this.valorTotal += valor;
            System.out.println("Item adicionado: " + item);
        }
    }

    public void aprovarPedido() {
        if ("Pendente".equals(status)) {
            this.status = "Aprovado";
            System.out.println("Pedido aprovado");
        }
    }

    public void calcularFrete(String cep) {
        // Simulação de cálculo de frete
        this.frete = valorTotal * 0.1;
        System.out.println("Frete calculado: R$ " + frete);
    }

    // Getters e Setters
    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

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

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public Date getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(Date previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }
} 