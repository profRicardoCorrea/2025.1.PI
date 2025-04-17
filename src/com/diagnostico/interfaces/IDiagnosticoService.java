package com.diagnostico.interfaces;

import com.diagnostico.entities.Diagnostico;
import java.util.List;

public interface IDiagnosticoService {
    void cadastrarDiagnostico(Diagnostico diagnostico);
    void removerDiagnostico(Integer id);
    List<Diagnostico> listarDiagnosticos();
    void alterarDiagnostico(Diagnostico diagnostico);
    Diagnostico buscarDiagnosticoPorId(Integer id);
    List<Diagnostico> buscarDiagnosticosPorPaciente(Integer pacienteId);
} 