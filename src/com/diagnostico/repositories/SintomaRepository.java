package com.diagnostico.repositories;

import com.diagnostico.entities.Sintoma;
import com.diagnostico.interfaces.ISintomaRepository;
import java.util.ArrayList;
import java.util.List;

public class SintomaRepository implements ISintomaRepository {
    private List<Sintoma> sintomas;
    private static int proximoId = 1;

    public SintomaRepository() {
        this.sintomas = new ArrayList<>();
    }

    @Override
    public void criar(Sintoma sintoma) {
        sintoma.setId(proximoId++);
        sintomas.add(sintoma);
    }

    @Override
    public void remover(Integer id) {
        sintomas.removeIf(s -> s.getId().equals(id));
    }

    @Override
    public List<Sintoma> listar() {
        return new ArrayList<>(sintomas);
    }

    @Override
    public void alterar(Sintoma sintoma) {
        for (int i = 0; i < sintomas.size(); i++) {
            if (sintomas.get(i).getId().equals(sintoma.getId())) {
                sintomas.set(i, sintoma);
                break;
            }
        }
    }

    @Override
    public Sintoma buscarPorId(Integer id) {
        return sintomas.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
} 