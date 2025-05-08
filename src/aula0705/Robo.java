package aula0705;

public class Robo {
    private String nome;
    private String modelo;
    private String funcao; // assistente, industrial, etc
    private double nivelBateria;
    private boolean ligado;
    private String statusOperacional;
    private double temperatura;
    private boolean emMovimento;
    private String localizacaoAtual;
    private int nivelInteligencia; // 1-10

    public Robo() {
        this.ligado = false;
        this.nivelBateria = 100.0;
        this.temperatura = 25.0;
        this.emMovimento = false;
        this.statusOperacional = "Em espera";
    }

    public Robo(String nome, String modelo, String funcao) {
        this();
        this.nome = nome;
        this.modelo = modelo;
        this.funcao = funcao;
    }

    // Métodos específicos
    public void ligar() {
        if (!ligado && nivelBateria > 0) {
            this.ligado = true;
            this.statusOperacional = "Operacional";
            System.out.println(nome + " iniciando sistemas...");
        }
    }

    public void desligar() {
        if (ligado) {
            this.ligado = false;
            this.statusOperacional = "Desligado";
            System.out.println(nome + " encerrando sistemas...");
        }
    }

    public void executarTarefa(String tarefa) {
        if (ligado) {
            System.out.println("Executando tarefa: " + tarefa);
            this.nivelBateria -= 10;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getStatusOperacional() {
        return statusOperacional;
    }

    public void setStatusOperacional(String statusOperacional) {
        this.statusOperacional = statusOperacional;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }

    public void setEmMovimento(boolean emMovimento) {
        this.emMovimento = emMovimento;
    }

    public String getLocalizacaoAtual() {
        return localizacaoAtual;
    }

    public void setLocalizacaoAtual(String localizacaoAtual) {
        this.localizacaoAtual = localizacaoAtual;
    }

    public int getNivelInteligencia() {
        return nivelInteligencia;
    }

    public void setNivelInteligencia(int nivelInteligencia) {
        if (nivelInteligencia >= 1 && nivelInteligencia <= 10) {
            this.nivelInteligencia = nivelInteligencia;
        }
    }
} 