package com.diagnostico.interfaces;

import com.diagnostico.entities.Exame;
import java.util.List;

public interface IExameRepository {
    void criar(Exame exame);
    void remover(Integer id);
    List<Exame> listar();
    void alterar(Exame exame);
    Exame buscarPorId(Integer id);
} 