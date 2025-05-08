package aula0705;

import java.util.ArrayList;
import java.util.List;

public class SistemaIrrigacao {
    private boolean ativado;
    private List<String> zonasIrrigacao;
    private double nivelReservatorio;
    private boolean bombaLigada;
    private String programacao; // manual, automatico
    private int tempoIrrigacao; // em minutos
    private double pressaoAgua;
    private boolean sensorChuva;
    private List<String> historicoIrrigacao;
    private boolean manutencaoNecessaria;

    public SistemaIrrigacao() {
        this.ativado = false;
        this.zonasIrrigacao = new ArrayList<>();
        this.historicoIrrigacao = new ArrayList<>();
        this.nivelReservatorio = 100.0;
        this.programacao = "manual";
        this.bombaLigada = false;
    }

    public SistemaIrrigacao(boolean sensorChuva, String programacao) {
        this();
        this.sensorChuva = sensorChuva;
        this.programacao = programacao;
    }

    // Métodos específicos
    public void iniciarIrrigacao(String zona) {
        if (ativado && nivelReservatorio > 10 && !sensorChuva) {
            this.bombaLigada = true;
            historicoIrrigacao.add("Irrigação iniciada na zona: " + zona);
            System.out.println("Irrigando zona: " + zona);
        }
    }

    public void pararIrrigacao() {
        if (bombaLigada) {
            this.bombaLigada = false;
            System.out.println("Irrigação interrompida");
        }
    }

    public void verificarSensorChuva() {
        if (sensorChuva && bombaLigada) {
            pararIrrigacao();
            System.out.println("Irrigação interrompida: chuva detectada");
        }
    }

    // Getters e Setters
    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }

    // ... implementar os demais getters e setters
} 