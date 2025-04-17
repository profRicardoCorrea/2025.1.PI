package com.diagnostico.repositories;

import com.diagnostico.entities.Diagnostico;
import com.diagnostico.interfaces.IDiagnosticoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DiagnosticoRepository implements IDiagnosticoRepository {
    private List<Diagnostico> diagnosticos;
    private static int proximoId = 1;

    public DiagnosticoRepository() {
        this.diagnosticos = new ArrayList<>();
    }

    @Override
    public void criar(Diagnostico diagnostico) {
        diagnostico.setId(proximoId++);
        diagnosticos.add(diagnostico);
    }

    @Override
    public void remover(Integer id) {
        diagnosticos.removeIf(d -> d.getId().equals(id));
    }

    @Override
    public List<Diagnostico> listar() {
        return new ArrayList<>(diagnosticos);
    }

    @Override
    public void alterar(Diagnostico diagnostico) {
        for (int i = 0; i < diagnosticos.size(); i++) {
            if (diagnosticos.get(i).getId().equals(diagnostico.getId())) {
                diagnosticos.set(i, diagnostico);
                break;
            }
        }
    }

    @Override
    public Diagnostico buscarPorId(Integer id) {
        return diagnosticos.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Diagnostico> buscarPorPacienteId(Integer pacienteId) {
        return diagnosticos.stream()
                .filter(d -> d.getPaciente().getId().equals(pacienteId))
                .collect(Collectors.toList());
    }
} 