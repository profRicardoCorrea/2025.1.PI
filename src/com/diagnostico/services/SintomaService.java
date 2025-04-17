package com.diagnostico.services;

import com.diagnostico.entities.Sintoma;
import com.diagnostico.interfaces.ISintomaRepository;
import com.diagnostico.interfaces.ISintomaService;
import java.util.List;

public class SintomaService implements ISintomaService {
    private final ISintomaRepository repository;

    public SintomaService(ISintomaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarSintoma(Sintoma sintoma) {
        if (sintoma.getDescricao() == null || sintoma.getDescricao().trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição do sintoma é obrigatória");
        }
        if (sintoma.getSeveridade() < 1 || sintoma.getSeveridade() > 5) {
            throw new IllegalArgumentException("Severidade deve estar entre 1 e 5");
        }
        repository.criar(sintoma);
    }

    @Override
    public void removerSintoma(Integer id) {
        Sintoma sintoma = repository.buscarPorId(id);
        if (sintoma == null) {
            throw new IllegalArgumentException("Sintoma não encontrado");
        }
        repository.remover(id);
    }

    @Override
    public List<Sintoma> listarSintomas() {
        return repository.listar();
    }

    @Override
    public void alterarSintoma(Sintoma sintoma) {
        if (sintoma.getId() == null) {
            throw new IllegalArgumentException("ID do sintoma é obrigatório para alteração");
        }
        if (repository.buscarPorId(sintoma.getId()) == null) {
            throw new IllegalArgumentException("Sintoma não encontrado");
        }
        repository.alterar(sintoma);
    }

    @Override
    public Sintoma buscarSintomaPorId(Integer id) {
        Sintoma sintoma = repository.buscarPorId(id);
        if (sintoma == null) {
            throw new IllegalArgumentException("Sintoma não encontrado");
        }
        return sintoma;
    }
} 