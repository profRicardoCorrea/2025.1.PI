package aula0705;

import java.util.Date;

public class RoboCirurgico {
    private String modelo;
    private String identificacao;
    private boolean emOperacao;
    private String statusOperacional;
    private double precisaoMovimento; // em milímetros
    private String especialidade; // neurologia, cardiologia, etc
    private boolean esterilizado;
    private String cirurgiaoResponsavel;
    private double horasDeUso;
    private Date ultimaManutencao;

    public RoboCirurgico() {
        this.emOperacao = false;
        this.statusOperacional = "Em espera";
        this.esterilizado = false;
        this.precisaoMovimento = 0.1; // 0.1mm de precisão
    }

    public RoboCirurgico(String modelo, String identificacao, String especialidade) {
        this();
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.especialidade = especialidade;
    }

    // Métodos específicos
    public void iniciarOperacao(String cirurgiao) {
        if (!emOperacao && esterilizado) {
            this.emOperacao = true;
            this.cirurgiaoResponsavel = cirurgiao;
            this.statusOperacional = "Em operação";
            System.out.println("Iniciando operação com Dr(a). " + cirurgiao);
        }
    }

    public void finalizarOperacao() {
        if (emOperacao) {
            this.emOperacao = false;
            this.esterilizado = false;
            this.statusOperacional = "Operação finalizada";
            System.out.println("Operação finalizada");
        }
    }

    public void esterilizar() {
        if (!emOperacao) {
            this.esterilizado = true;
            System.out.println("Robô esterilizado");
        }
    }

    // Getters e Setters
    // ... (implementar todos os getters e setters para os atributos)
} 