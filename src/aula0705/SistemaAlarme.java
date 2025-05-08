package aula0705;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlarme {
    private boolean ativado;
    private List<String> sensoresAtivos;
    private String senhaDesativacao;
    private boolean sireneLigada;
    private boolean conectadoCentral;
    private List<String> zonasMonitoradas;
    private String ultimoDisparo;
    private boolean energiaBackup;
    private int tempoDisparo; // em segundos
    private boolean modoNoturno;

    public SistemaAlarme() {
        this.ativado = false;
        this.sensoresAtivos = new ArrayList<>();
        this.zonasMonitoradas = new ArrayList<>();
        this.sireneLigada = false;
        this.conectadoCentral = true;
        this.energiaBackup = true;
    }

    public SistemaAlarme(String senhaDesativacao) {
        this();
        this.senhaDesativacao = senhaDesativacao;
    }

    // Métodos específicos
    public void ativar() {
        if (!ativado && !sireneLigada) {
            this.ativado = true;
            System.out.println("Sistema de alarme ativado");
        }
    }

    public void desativar(String senha) {
        if (ativado && senha.equals(senhaDesativacao)) {
            this.ativado = false;
            this.sireneLigada = false;
            System.out.println("Sistema de alarme desativado");
        }
    }

    public void dispararAlarme(String zona) {
        if (ativado) {
            this.sireneLigada = true;
            this.ultimoDisparo = zona;
            System.out.println("ALARME: Detecção na zona " + zona);
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