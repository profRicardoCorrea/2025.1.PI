package com.diagnostico.entities;

import java.time.LocalDateTime;

/**
 * Classe abstrata base para registros médicos
 */
public abstract class RegistroMedico {
    protected Integer id;
    protected LocalDateTime dataRegistro;

    public RegistroMedico() {
        this.dataRegistro = LocalDateTime.now();
    }

    public RegistroMedico(Integer id) {
        this();
        this.id = id;
    }

    public abstract boolean validarDados();

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
} 