package aula0705;

public class DroneDeEntrega {
    private String identificacao;
    private double capacidadeCarga; // em kg
    private double autonomia; // em minutos
    private boolean emMissao;
    private String statusEntrega;
    private double nivelBateria;
    private String localizacaoAtual;
    private double velocidade;
    private String destinoAtual;
    private double altitudeAtual;

    public DroneDeEntrega() {
        this.emMissao = false;
        this.nivelBateria = 100.0;
        this.statusEntrega = "Disponível";
        this.velocidade = 0.0;
        this.altitudeAtual = 0.0;
    }

    public DroneDeEntrega(String identificacao, double capacidadeCarga, double autonomia) {
        this();
        this.identificacao = identificacao;
        this.capacidadeCarga = capacidadeCarga;
        this.autonomia = autonomia;
    }

    // Métodos específicos
    public void iniciarEntrega(String destino) {
        if (!emMissao && nivelBateria > 20) {
            this.emMissao = true;
            this.destinoAtual = destino;
            this.statusEntrega = "Em rota";
            System.out.println("Iniciando entrega para: " + destino);
        }
    }

    public void finalizarEntrega() {
        if (emMissao) {
            this.emMissao = false;
            this.statusEntrega = "Disponível";
            this.destinoAtual = null;
            System.out.println("Entrega finalizada");
        }
    }

    public void recarregar() {
        if (!emMissao && nivelBateria < 100) {
            this.nivelBateria = 100;
            System.out.println("Bateria recarregada");
        }
    }

    // Getters e Setters
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isEmMissao() {
        return emMissao;
    }

    public void setEmMissao(boolean emMissao) {
        this.emMissao = emMissao;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public String getLocalizacaoAtual() {
        return localizacaoAtual;
    }

    public void setLocalizacaoAtual(String localizacaoAtual) {
        this.localizacaoAtual = localizacaoAtual;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getDestinoAtual() {
        return destinoAtual;
    }

    public void setDestinoAtual(String destinoAtual) {
        this.destinoAtual = destinoAtual;
    }

    public double getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(double altitudeAtual) {
        this.altitudeAtual = altitudeAtual;
    }
} 