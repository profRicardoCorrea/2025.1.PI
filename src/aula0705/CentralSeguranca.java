package aula0705;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class CentralSeguranca {
    private boolean ativa;
    private List<String> camerasAtivas;
    private List<String> sensoresMovimento;
    private List<String> alertas;
    private String nivelSeguranca; // baixo, medio, alto
    private boolean sireneAtiva;
    private Date ultimoEvento;
    private boolean conectadaInternet;
    private String modoOperacao; // normal, ferias, noturno
    private List<String> usuariosAutorizados;

    public CentralSeguranca() {
        this.ativa = false;
        this.camerasAtivas = new ArrayList<>();
        this.sensoresMovimento = new ArrayList<>();
        this.alertas = new ArrayList<>();
        this.usuariosAutorizados = new ArrayList<>();
        this.nivelSeguranca = "medio";
        this.conectadaInternet = true;
    }

    public CentralSeguranca(String nivelSeguranca, String modoOperacao) {
        this();
        this.nivelSeguranca = nivelSeguranca;
        this.modoOperacao = modoOperacao;
    }

    // Métodos específicos
    public void ativarSeguranca() {
        if (!ativa) {
            this.ativa = true;
            this.ultimoEvento = new Date();
            System.out.println("Sistema de segurança ativado: " + modoOperacao);
        }
    }

    public void registrarAlerta(String local, String tipo) {
        if (ativa) {
            String alerta = new Date() + " - " + local + ": " + tipo;
            this.alertas.add(alerta);
            System.out.println("ALERTA: " + alerta);
            
            if (nivelSeguranca.equals("alto")) {
                this.sireneAtiva = true;
            }
        }
    }

    public void adicionarUsuario(String usuario) {
        if (!usuariosAutorizados.contains(usuario)) {
            usuariosAutorizados.add(usuario);
            System.out.println("Usuário autorizado: " + usuario);
        }
    }

    // Getters e Setters
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // ... implementar os demais getters e setters
} 