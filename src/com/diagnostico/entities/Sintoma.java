package com.diagnostico.entities;

public class Sintoma {
    private Integer id;
    private String descricao;
    private int severidade; // 1-5

    public Sintoma() {
    }

    public Sintoma(Integer id, String descricao, int severidade) {
        this.id = id;
        this.descricao = descricao;
        this.severidade = severidade;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeveridade() {
        return severidade;
    }

    public void setSeveridade(int severidade) {
        if (severidade < 1 || severidade > 5) {
            throw new IllegalArgumentException("Severidade deve estar entre 1 e 5");
        }
        this.severidade = severidade;
    }
} 