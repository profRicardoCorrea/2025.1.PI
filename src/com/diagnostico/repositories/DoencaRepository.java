package com.diagnostico.repositories;

import com.diagnostico.entities.Doenca;
import com.diagnostico.interfaces.IDoencaRepository;
import java.util.ArrayList;
import java.util.List;

public class DoencaRepository implements IDoencaRepository {
    private List<Doenca> doencas;
    private static int proximoId = 1;

    public DoencaRepository() {
        this.doencas = new ArrayList<>();
    }

    @Override
    public void criar(Doenca doenca) {
        doenca.setId(proximoId++);
        doencas.add(doenca);
    }

    @Override
    public void remover(Integer id) {
        doencas.removeIf(d -> d.getId().equals(id));
    }

    @Override
    public List<Doenca> listar() {
        return new ArrayList<>(doencas);
    }

    @Override
    public void alterar(Doenca doenca) {
        for (int i = 0; i < doencas.size(); i++) {
            if (doencas.get(i).getId().equals(doenca.getId())) {
                doencas.set(i, doenca);
                break;
            }
        }
    }

    @Override
    public Doenca buscarPorId(Integer id) {
        return doencas.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
} 