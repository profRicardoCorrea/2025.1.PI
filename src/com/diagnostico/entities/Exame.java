package com.diagnostico.entities;

public class Exame {
    private Integer id;
    private String tipo;
    private String resultado;

    public Exame() {
    }

    public Exame(Integer id, String tipo, String resultado) {
        this.id = id;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
} 