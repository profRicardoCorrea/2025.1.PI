package com.diagnostico.interfaces;

import com.diagnostico.entities.Doenca;
import java.util.List;

public interface IDoencaService {
    void cadastrarDoenca(Doenca doenca);
    void removerDoenca(Integer id);
    List<Doenca> listarDoencas();
    void alterarDoenca(Doenca doenca);
    Doenca buscarDoencaPorId(Integer id);
} 