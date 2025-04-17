package com.diagnostico.services;

import com.diagnostico.entities.Paciente;
import com.diagnostico.interfaces.IPacienteRepository;
import com.diagnostico.interfaces.IPacienteService;
import java.util.List;

public class PacienteService implements IPacienteService {
    private final IPacienteRepository repository;

    public PacienteService(IPacienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarPaciente(Paciente paciente) {
        if (paciente.getNome() == null || paciente.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do paciente é obrigatório");
        }
        if (paciente.getIdade() < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        repository.criar(paciente);
    }

    @Override
    public void removerPaciente(Integer id) {
        Paciente paciente = repository.buscarPorId(id);
        if (paciente == null) {
            throw new IllegalArgumentException("Paciente não encontrado");
        }
        repository.remover(id);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return repository.listar();
    }

    @Override
    public void alterarPaciente(Paciente paciente) {
        if (paciente.getId() == null) {
            throw new IllegalArgumentException("ID do paciente é obrigatório para alteração");
        }
        if (repository.buscarPorId(paciente.getId()) == null) {
            throw new IllegalArgumentException("Paciente não encontrado");
        }
        repository.alterar(paciente);
    }

    @Override
    public Paciente buscarPacientePorId(Integer id) {
        Paciente paciente = repository.buscarPorId(id);
        if (paciente == null) {
            throw new IllegalArgumentException("Paciente não encontrado");
        }
        return paciente;
    }
} 