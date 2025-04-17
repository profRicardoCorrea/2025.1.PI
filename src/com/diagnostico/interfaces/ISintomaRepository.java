package com.diagnostico.interfaces;

import com.diagnostico.entities.Sintoma;
import java.util.List;

public interface ISintomaRepository {
    void criar(Sintoma sintoma);
    void remover(Integer id);
    List<Sintoma> listar();
    void alterar(Sintoma sintoma);
    Sintoma buscarPorId(Integer id);
} 