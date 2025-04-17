package com.diagnostico.services;

import com.diagnostico.entities.Exame;
import com.diagnostico.interfaces.IExameRepository;
import com.diagnostico.interfaces.IExameService;
import java.util.List;

public class ExameService implements IExameService {
    private final IExameRepository repository;

    public ExameService(IExameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarExame(Exame exame) {
        if (exame.getTipo() == null || exame.getTipo().trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo do exame é obrigatório");
        }
        if (exame.getResultado() == null || exame.getResultado().trim().isEmpty()) {
            throw new IllegalArgumentException("Resultado do exame é obrigatório");
        }
        repository.criar(exame);
    }

    @Override
    public void removerExame(Integer id) {
        Exame exame = repository.buscarPorId(id);
        if (exame == null) {
            throw new IllegalArgumentException("Exame não encontrado");
        }
        repository.remover(id);
    }

    @Override
    public List<Exame> listarExames() {
        return repository.listar();
    }

    @Override
    public void alterarExame(Exame exame) {
        if (exame.getId() == null) {
            throw new IllegalArgumentException("ID do exame é obrigatório para alteração");
        }
        if (repository.buscarPorId(exame.getId()) == null) {
            throw new IllegalArgumentException("Exame não encontrado");
        }
        repository.alterar(exame);
    }

    @Override
    public Exame buscarExamePorId(Integer id) {
        Exame exame = repository.buscarPorId(id);
        if (exame == null) {
            throw new IllegalArgumentException("Exame não encontrado");
        }
        return exame;
    }
} 