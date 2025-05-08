package aula0705;

public class Geladeira {
    private String marca;
    private String modelo;
    private int capacidadeLitros;
    private boolean ligada;
    private double temperaturaAtual;
    private double temperaturaMinima;
    private boolean temFreezer;
    private boolean portaAberta;
    private int nivelEnergia; // A, B, C, etc
    private boolean modoEconomico;

    public Geladeira() {
        this.ligada = false;
        this.temperaturaAtual = 25.0;
        this.temperaturaMinima = 2.0;
        this.portaAberta = false;
        this.modoEconomico = false;
    }

    public Geladeira(String marca, String modelo, int capacidadeLitros, boolean temFreezer) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeLitros = capacidadeLitros;
        this.temFreezer = temFreezer;
    }

    // Métodos específicos
    public void ligar() {
        if (!ligada) {
            this.ligada = true;
            System.out.println("Geladeira ligada");
        }
    }

    public void desligar() {
        if (ligada) {
            this.ligada = false;
            System.out.println("Geladeira desligada");
        }
    }

    public void ajustarTemperatura(double temperatura) {
        if (ligada && temperatura >= temperaturaMinima) {
            this.temperaturaAtual = temperatura;
            System.out.println("Temperatura ajustada para " + temperatura + "°C");
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

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public boolean isTemFreezer() {
        return temFreezer;
    }

    public void setTemFreezer(boolean temFreezer) {
        this.temFreezer = temFreezer;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public boolean isModoEconomico() {
        return modoEconomico;
    }

    public void setModoEconomico(boolean modoEconomico) {
        this.modoEconomico = modoEconomico;
    }
} 