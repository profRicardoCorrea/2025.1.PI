package aula0705;

import java.util.ArrayList;
import java.util.List;

public class SmartTV {
    private String marca;
    private String modelo;
    private int polegadas;
    private boolean ligada;
    private int volume;
    private int canal;
    private boolean conectadaInternet;
    private String resolucao; // HD, Full HD, 4K
    private List<String> aplicativosInstalados;
    private String entradaAtual; // HDMI1, HDMI2, TV, etc

    public SmartTV() {
        this.ligada = false;
        this.volume = 20;
        this.canal = 1;
        this.conectadaInternet = false;
        this.aplicativosInstalados = new ArrayList<>();
    }

    public SmartTV(String marca, String modelo, int polegadas, String resolucao) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.polegadas = polegadas;
        this.resolucao = resolucao;
    }

    // Métodos específicos
    public void ligar() {
        this.ligada = true;
        System.out.println("TV ligada");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("TV desligada");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            this.volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            this.volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void mudarCanal(int canal) {
        if (ligada) {
            this.canal = canal;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void conectarWifi() {
        if (ligada && !conectadaInternet) {
            this.conectadaInternet = true;
            System.out.println("TV conectada à internet");
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

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isConectadaInternet() {
        return conectadaInternet;
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public List<String> getAplicativosInstalados() {
        return aplicativosInstalados;
    }

    public void setAplicativosInstalados(List<String> aplicativosInstalados) {
        this.aplicativosInstalados = aplicativosInstalados;
    }

    public String getEntradaAtual() {
        return entradaAtual;
    }

    public void setEntradaAtual(String entradaAtual) {
        this.entradaAtual = entradaAtual;
    }
} 