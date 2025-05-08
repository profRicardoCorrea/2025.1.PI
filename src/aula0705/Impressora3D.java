package aula0705;

public class Impressora3D {
    private String marca;
    private String modelo;
    private double areaImpressao; // em cm³
    private boolean emOperacao;
    private double temperaturaExtrusor;
    private double nivelFilamento;
    private String tipoFilamento; // PLA, ABS, etc
    private double velocidadeImpressao;
    private String statusImpressao;
    private double progressoAtual;

    public Impressora3D() {
        this.emOperacao = false;
        this.temperaturaExtrusor = 25.0;
        this.nivelFilamento = 100.0;
        this.statusImpressao = "Pronta";
        this.progressoAtual = 0.0;
    }

    public Impressora3D(String marca, String modelo, double areaImpressao) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.areaImpressao = areaImpressao;
    }

    // Métodos específicos
    public void iniciarImpressao(String arquivo) {
        if (!emOperacao && nivelFilamento > 10) {
            this.emOperacao = true;
            this.statusImpressao = "Imprimindo";
            System.out.println("Iniciando impressão do arquivo: " + arquivo);
        }
    }

    public void pausarImpressao() {
        if (emOperacao) {
            this.statusImpressao = "Pausada";
            System.out.println("Impressão pausada");
        }
    }

    public void trocarFilamento(String novoFilamento) {
        if (!emOperacao) {
            this.tipoFilamento = novoFilamento;
            this.nivelFilamento = 100.0;
            System.out.println("Filamento trocado para: " + novoFilamento);
        }
    }

    // Getters e Setters
    // ... (implementar todos os getters e setters para os atributos)
} 