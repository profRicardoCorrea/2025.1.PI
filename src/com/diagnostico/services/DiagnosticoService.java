package com.diagnostico.services;

import com.diagnostico.entities.Diagnostico;
import com.diagnostico.interfaces.IDiagnosticoRepository;
import com.diagnostico.interfaces.IDiagnosticoService;
import java.util.List;

public class DiagnosticoService implements IDiagnosticoService {
    private final IDiagnosticoRepository repository;

    public DiagnosticoService(IDiagnosticoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarDiagnostico(Diagnostico diagnostico) {
        if (diagnostico.getPaciente() == null) {
            throw new IllegalArgumentException("Paciente é obrigatório");
        }
        if (diagnostico.getSintomas() == null || diagnostico.getSintomas().isEmpty()) {
            throw new IllegalArgumentException("Diagnóstico deve ter pelo menos um sintoma");
        }
        if (!diagnostico.validarDados()) {
            throw new IllegalArgumentException("Dados do diagnóstico inválidos");
        }
        repository.criar(diagnostico);
    }

    @Override
    public void removerDiagnostico(Integer id) {
        Diagnostico diagnostico = repository.buscarPorId(id);
        if (diagnostico == null) {
            throw new IllegalArgumentException("Diagnóstico não encontrado");
        }
        repository.remover(id);
    }

    @Override
    public List<Diagnostico> listarDiagnosticos() {
        return repository.listar();
    }

    @Override
    public void alterarDiagnostico(Diagnostico diagnostico) {
        if (diagnostico.getId() == null) {
            throw new IllegalArgumentException("ID do diagnóstico é obrigatório para alteração");
        }
        if (repository.buscarPorId(diagnostico.getId()) == null) {
            throw new IllegalArgumentException("Diagnóstico não encontrado");
        }
        if (!diagnostico.validarDados()) {
            throw new IllegalArgumentException("Dados do diagnóstico inválidos");
        }
        repository.alterar(diagnostico);
    }

    @Override
    public Diagnostico buscarDiagnosticoPorId(Integer id) {
        Diagnostico diagnostico = repository.buscarPorId(id);
        if (diagnostico == null) {
            throw new IllegalArgumentException("Diagnóstico não encontrado");
        }
        return diagnostico;
    }

    @Override
    public List<Diagnostico> buscarDiagnosticosPorPaciente(Integer pacienteId) {
        return repository.buscarPorPacienteId(pacienteId);
    }
} 