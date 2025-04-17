package com.diagnostico.interfaces;

import com.diagnostico.entities.Exame;
import java.util.List;

public interface IExameService {
    void cadastrarExame(Exame exame);
    void removerExame(Integer id);
    List<Exame> listarExames();
    void alterarExame(Exame exame);
    Exame buscarExamePorId(Integer id);
} 