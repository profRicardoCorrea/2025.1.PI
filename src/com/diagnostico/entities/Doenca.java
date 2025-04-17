package com.diagnostico.entities;

import java.util.ArrayList;
import java.util.List;

public class Doenca {
    private Integer id;
    private String nome;
    private List<Sintoma> sintomasTipicos;

    public Doenca() {
        this.sintomasTipicos = new ArrayList<>();
    }

    public Doenca(Integer id, String nome) {
        this();
        this.id = id;
        this.nome = nome;
    }

    // Métodos sobrecarregados para adicionar sintomas
    public void adicionarSintoma(Sintoma sintoma) {
        this.sintomasTipicos.add(sintoma);
    }

    public void adicionarSintoma(String descricao, int severidade) {
        Sintoma sintoma = new Sintoma(null, descricao, severidade);
        this.sintomasTipicos.add(sintoma);
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

    public List<Sintoma> getSintomasTipicos() {
        return sintomasTipicos;
    }

    public void setSintomasTipicos(List<Sintoma> sintomasTipicos) {
        this.sintomasTipicos = sintomasTipicos;
    }
} 