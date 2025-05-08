package aula0705;

import java.util.Date;

public class ReservaDeHotel {
    private String numeroReserva;
    private String nomeHospede;
    private String tipoQuarto;
    private Date dataCheckIn;
    private Date dataCheckOut;
    private int numeroPessoas;
    private double valorDiaria;
    private boolean confirmada;
    private String formaPagamento;
    private String observacoes;

    public ReservaDeHotel() {
        this.confirmada = false;
    }

    public ReservaDeHotel(String numeroReserva, String nomeHospede, String tipoQuarto, Date dataCheckIn, Date dataCheckOut) {
        this();
        this.numeroReserva = numeroReserva;
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    // Métodos específicos
    public void confirmarReserva() {
        if (!confirmada) {
            this.confirmada = true;
            System.out.println("Reserva confirmada para " + nomeHospede);
        }
    }

    public void cancelarReserva() {
        if (confirmada) {
            this.confirmada = false;
            System.out.println("Reserva cancelada");
        }
    }

    public double calcularValorTotal() {
        // Cálculo simplificado, não considera a diferença real entre as datas
        long dias = (dataCheckOut.getTime() - dataCheckIn.getTime()) / (1000 * 60 * 60 * 24);
        return dias * valorDiaria;
    }

    // Getters e Setters
    public String getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(String numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
} 