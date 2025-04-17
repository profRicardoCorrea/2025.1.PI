package com.diagnostico.interfaces;

import com.diagnostico.entities.Paciente;
import java.util.List;

public interface IPacienteService {
    void cadastrarPaciente(Paciente paciente);
    void removerPaciente(Integer id);
    List<Paciente> listarPacientes();
    void alterarPaciente(Paciente paciente);
    Paciente buscarPacientePorId(Integer id);
} 