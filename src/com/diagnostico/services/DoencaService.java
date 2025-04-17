package com.diagnostico.services;

import com.diagnostico.entities.Doenca;
import com.diagnostico.interfaces.IDoencaRepository;
import com.diagnostico.interfaces.IDoencaService;
import java.util.List;

public class DoencaService implements IDoencaService {
    private final IDoencaRepository repository;

    public DoencaService(IDoencaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarDoenca(Doenca doenca) {
        if (doenca.getNome() == null || doenca.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da doença é obrigatório");
        }
        if (doenca.getSintomasTipicos() == null || doenca.getSintomasTipicos().isEmpty()) {
            throw new IllegalArgumentException("Doença deve ter pelo menos um sintoma típico");
        }
        repository.criar(doenca);
    }

    @Override
    public void removerDoenca(Integer id) {
        Doenca doenca = repository.buscarPorId(id);
        if (doenca == null) {
            throw new IllegalArgumentException("Doença não encontrada");
        }
        repository.remover(id);
    }

    @Override
    public List<Doenca> listarDoencas() {
        return repository.listar();
    }

    @Override
    public void alterarDoenca(Doenca doenca) {
        if (doenca.getId() == null) {
            throw new IllegalArgumentException("ID da doença é obrigatório para alteração");
        }
        if (repository.buscarPorId(doenca.getId()) == null) {
            throw new IllegalArgumentException("Doença não encontrada");
        }
        repository.alterar(doenca);
    }

    @Override
    public Doenca buscarDoencaPorId(Integer id) {
        Doenca doenca = repository.buscarPorId(id);
        if (doenca == null) {
            throw new IllegalArgumentException("Doença não encontrada");
        }
        return doenca;
    }
} 