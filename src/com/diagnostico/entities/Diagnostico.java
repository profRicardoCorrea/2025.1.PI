package com.diagnostico.entities;

import java.util.ArrayList;
import java.util.List;

public class Diagnostico extends RegistroMedico {
    private Paciente paciente;
    private List<Sintoma> sintomas;
    private List<Exame> exames;
    private Doenca doencaSugerida;

    public Diagnostico() {
        super();
        this.sintomas = new ArrayList<>();
        this.exames = new ArrayList<>();
    }

    public Diagnostico(Integer id, Paciente paciente, Doenca doencaSugerida) {
        super(id);
        this.paciente = paciente;
        this.doencaSugerida = doencaSugerida;
        this.sintomas = new ArrayList<>();
        this.exames = new ArrayList<>();
    }

    @Override
    public boolean validarDados() {
        return paciente != null && !sintomas.isEmpty();
    }

    // Métodos sobrecarregados para adicionar sintomas
    public void adicionarSintoma(Sintoma sintoma) {
        this.sintomas.add(sintoma);
    }

    public void adicionarSintoma(String descricao, int severidade) {
        Sintoma sintoma = new Sintoma(null, descricao, severidade);
        this.sintomas.add(sintoma);
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public Doenca getDoencaSugerida() {
        return doencaSugerida;
    }

    public void setDoencaSugerida(Doenca doencaSugerida) {
        this.doencaSugerida = doencaSugerida;
    }
} 