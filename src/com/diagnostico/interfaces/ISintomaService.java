package com.diagnostico.interfaces;

import com.diagnostico.entities.Sintoma;
import java.util.List;

public interface ISintomaService {
    void cadastrarSintoma(Sintoma sintoma);
    void removerSintoma(Integer id);
    List<Sintoma> listarSintomas();
    void alterarSintoma(Sintoma sintoma);
    Sintoma buscarSintomaPorId(Integer id);
} 