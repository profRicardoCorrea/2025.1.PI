package com.diagnostico.repositories;

import com.diagnostico.entities.Exame;
import com.diagnostico.interfaces.IExameRepository;
import java.util.ArrayList;
import java.util.List;

public class ExameRepository implements IExameRepository {
    private List<Exame> exames;
    private static int proximoId = 1;

    public ExameRepository() {
        this.exames = new ArrayList<>();
    }

    @Override
    public void criar(Exame exame) {
        exame.setId(proximoId++);
        exames.add(exame);
    }

    @Override
    public void remover(Integer id) {
        exames.removeIf(e -> e.getId().equals(id));
    }

    @Override
    public List<Exame> listar() {
        return new ArrayList<>(exames);
    }

    @Override
    public void alterar(Exame exame) {
        for (int i = 0; i < exames.size(); i++) {
            if (exames.get(i).getId().equals(exame.getId())) {
                exames.set(i, exame);
                break;
            }
        }
    }

    @Override
    public Exame buscarPorId(Integer id) {
        return exames.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
} 