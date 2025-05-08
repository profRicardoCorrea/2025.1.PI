package aula0705;

public class Aviao {
    private String modelo;
    private String fabricante;
    private int capacidadePassageiros;
    private double altitudeMaxima;
    private double velocidadeAtual;
    private boolean emVoo;
    private double nivelCombustivel;
    private String statusVoo;
    private boolean pilotoAutomatico;
    private double autonomia; // em km

    public Aviao() {
        this.emVoo = false;
        this.velocidadeAtual = 0.0;
        this.nivelCombustivel = 100.0;
        this.pilotoAutomatico = false;
        this.statusVoo = "Em solo";
    }

    public Aviao(String modelo, String fabricante, int capacidadePassageiros) {
        this();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    // Métodos específicos
    public void decolar() {
        if (!emVoo && nivelCombustivel > 20) {
            this.emVoo = true;
            this.statusVoo = "Decolando";
            System.out.println("Avião decolando...");
        }
    }

    public void pousar() {
        if (emVoo) {
            this.emVoo = false;
            this.velocidadeAtual = 0.0;
            this.statusVoo = "Pousando";
            System.out.println("Avião pousando...");
        }
    }

    public void ativarPilotoAutomatico() {
        if (emVoo && !pilotoAutomatico) {
            this.pilotoAutomatico = true;
            System.out.println("Piloto automático ativado");
        }
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public String getStatusVoo() {
        return statusVoo;
    }

    public void setStatusVoo(String statusVoo) {
        this.statusVoo = statusVoo;
    }

    public boolean isPilotoAutomatico() {
        return pilotoAutomatico;
    }

    public void setPilotoAutomatico(boolean pilotoAutomatico) {
        this.pilotoAutomatico = pilotoAutomatico;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
} 