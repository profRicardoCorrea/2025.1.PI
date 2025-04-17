package com.diagnostico.interfaces;

import com.diagnostico.entities.Doenca;
import java.util.List;

public interface IDoencaRepository {
    void criar(Doenca doenca);
    void remover(Integer id);
    List<Doenca> listar();
    void alterar(Doenca doenca);
    Doenca buscarPorId(Integer id);
} 