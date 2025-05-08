package aula0705;

public class MaquinaDeLavar {
    private String marca;
    private String modelo;
    private int capacidadeKg;
    private boolean ligada;
    private String programaAtual;
    private int tempoRestante;
    private boolean portaAberta;
    private double nivelAgua;
    private int temperatura;
    private String statusOperacao;

    public MaquinaDeLavar() {
        this.ligada = false;
        this.portaAberta = false;
        this.nivelAgua = 0.0;
        this.temperatura = 25;
        this.statusOperacao = "Desligada";
    }

    public MaquinaDeLavar(String marca, String modelo, int capacidadeKg) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeKg = capacidadeKg;
    }

    // Métodos específicos
    public void ligar() {
        if (!portaAberta) {
            this.ligada = true;
            this.statusOperacao = "Pronta";
            System.out.println("Máquina ligada");
        }
    }

    public void desligar() {
        if (ligada && !statusOperacao.equals("Lavando")) {
            this.ligada = false;
            this.statusOperacao = "Desligada";
            System.out.println("Máquina desligada");
        }
    }

    public void iniciarPrograma(String programa, int tempo) {
        if (ligada && !portaAberta && nivelAgua > 0) {
            this.programaAtual = programa;
            this.tempoRestante = tempo;
            this.statusOperacao = "Lavando";
            System.out.println("Iniciando programa: " + programa);
        }
    }

    public void abrirPorta() {
        if (!this.statusOperacao.equals("Lavando")) {
            this.portaAberta = true;
            System.out.println("Porta aberta");
        }
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(int capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public String getProgramaAtual() {
        return programaAtual;
    }

    public void setProgramaAtual(String programaAtual) {
        this.programaAtual = programaAtual;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getStatusOperacao() {
        return statusOperacao;
    }

    public void setStatusOperacao(String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }
} 