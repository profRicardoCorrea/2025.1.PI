package aula0705;

public class SmartPhone {
    private String marca;
    private String modelo;
    private double tamanhoTela;
    private int armazenamento;
    private int memoriaRAM;
    private boolean ligado;
    private int nivelBateria;
    private String sistemaOperacional;
    private boolean conectadoWifi;
    private boolean modo4G;

    public SmartPhone() {
        this.ligado = false;
        this.nivelBateria = 100;
        this.conectadoWifi = false;
        this.modo4G = false;
    }

    public SmartPhone(String marca, String modelo, String sistemaOperacional) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Métodos específicos
    public void ligar() {
        if (nivelBateria > 0) {
            this.ligado = true;
            System.out.println("Smartphone ligado");
        }
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Smartphone desligado");
    }

    public void conectarWifi() {
        if (ligado) {
            this.conectadoWifi = true;
            System.out.println("Conectado ao WiFi");
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

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean isConectadoWifi() {
        return conectadoWifi;
    }

    public void setConectadoWifi(boolean conectadoWifi) {
        this.conectadoWifi = conectadoWifi;
    }

    public boolean isModo4G() {
        return modo4G;
    }

    public void setModo4G(boolean modo4G) {
        this.modo4G = modo4G;
    }
} 