package com.diagnostico.interfaces;

import com.diagnostico.entities.Paciente;
import java.util.List;

public interface IPacienteRepository {
    void criar(Paciente paciente);
    void remover(Integer id);
    List<Paciente> listar();
    void alterar(Paciente paciente);
    Paciente buscarPorId(Integer id);
} 