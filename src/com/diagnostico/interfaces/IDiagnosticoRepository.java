package com.diagnostico.interfaces;

import com.diagnostico.entities.Diagnostico;
import java.util.List;

public interface IDiagnosticoRepository {
    void criar(Diagnostico diagnostico);
    void remover(Integer id);
    List<Diagnostico> listar();
    void alterar(Diagnostico diagnostico);
    Diagnostico buscarPorId(Integer id);
    List<Diagnostico> buscarPorPacienteId(Integer pacienteId);
} 