package aula0705;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int aro;
    private int numeroMarchas;
    private String cor;
    private boolean temFreioADisco;
    private String tipo; // mountain bike, speed, etc
    private double velocidadeAtual;
    private boolean temBagageiro;
    private String material; // alumínio, carbono, etc

    public Bicicleta() {
        this.numeroMarchas = 1;
        this.velocidadeAtual = 0.0;
        this.temFreioADisco = false;
        this.temBagageiro = false;
    }

    public Bicicleta(String marca, String modelo, int aro, String tipo) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.aro = aro;
        this.tipo = tipo;
    }

    // Métodos específicos
    public void pedalar() {
        this.velocidadeAtual += 5;
        System.out.println("Pedalando... Velocidade: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual > 0) {
            this.velocidadeAtual = Math.max(0, velocidadeAtual - 5);
            System.out.println("Freando... Velocidade: " + velocidadeAtual + " km/h");
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

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTemFreioADisco() {
        return temFreioADisco;
    }

    public void setTemFreioADisco(boolean temFreioADisco) {
        this.temFreioADisco = temFreioADisco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
} 