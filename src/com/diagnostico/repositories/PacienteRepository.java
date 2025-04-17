package com.diagnostico.repositories;

import com.diagnostico.entities.Paciente;
import com.diagnostico.interfaces.IPacienteRepository;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository implements IPacienteRepository {
    private List<Paciente> pacientes;
    private static int proximoId = 1;

    public PacienteRepository() {
        this.pacientes = new ArrayList<>();
    }

    @Override
    public void criar(Paciente paciente) {
        paciente.setId(proximoId++);
        pacientes.add(paciente);
    }

    @Override
    public void remover(Integer id) {
        pacientes.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public List<Paciente> listar() {
        return new ArrayList<>(pacientes);
    }

    @Override
    public void alterar(Paciente paciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId().equals(paciente.getId())) {
                pacientes.set(i, paciente);
                break;
            }
        }
    }

    @Override
    public Paciente buscarPorId(Integer id) {
        return pacientes.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
} 