package com.diagnostico.entities;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private Integer id;
    private String nome;
    private int idade;
    private List<Diagnostico> diagnosticos;

    public Paciente() {
        this.diagnosticos = new ArrayList<>();
    }

    public Paciente(Integer id, String nome, int idade) {
        this();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }
} 