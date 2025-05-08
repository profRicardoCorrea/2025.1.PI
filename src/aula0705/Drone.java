package aula0705;

public class Drone {
    private String marca;
    private String modelo;
    private double altitudeMaxima;
    private double velocidadeMaxima;
    private int autonomiaBateria; // em minutos
    private boolean temCamera;
    private double peso;
    private boolean emVoo;
    private int nivelBateria;
    private double altitudeAtual;

    public Drone() {
        this.emVoo = false;
        this.nivelBateria = 100;
        this.altitudeAtual = 0.0;
        this.temCamera = false;
    }

    public Drone(String marca, String modelo, double altitudeMaxima, int autonomiaBateria) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.altitudeMaxima = altitudeMaxima;
        this.autonomiaBateria = autonomiaBateria;
    }

    // Métodos específicos
    public void decolar() {
        if (!emVoo && nivelBateria > 20) {
            this.emVoo = true;
            this.altitudeAtual = 5.0;
            System.out.println("Drone decolando...");
        }
    }

    public void pousar() {
        if (emVoo) {
            this.emVoo = false;
            this.altitudeAtual = 0.0;
            System.out.println("Drone pousando...");
        }
    }

    public void tirarFoto() {
        if (temCamera && emVoo) {
            System.out.println("Foto capturada!");
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

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public boolean isTemCamera() {
        return temCamera;
    }

    public void setTemCamera(boolean temCamera) {
        this.temCamera = temCamera;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public double getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(double altitudeAtual) {
        this.altitudeAtual = altitudeAtual;
    }
} 