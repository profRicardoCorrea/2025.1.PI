package aula0705;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadePessoas;
    private int pessoasPresentes;
    private boolean portaAberta;
    private boolean emMovimento;
    private boolean emManutencao;
    private double cargaMaxima;
    private double cargaAtual;
    private String identificacao;

    public Elevador() {
        this.andarAtual = 0;
        this.portaAberta = true;
        this.emMovimento = false;
        this.emManutencao = false;
        this.pessoasPresentes = 0;
    }

    public Elevador(int totalAndares, int capacidadePessoas, double cargaMaxima) {
        this();
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.cargaMaxima = cargaMaxima;
    }

    // Métodos específicos
    public void subir() {
        if (!emManutencao && !portaAberta && andarAtual < totalAndares) {
            this.emMovimento = true;
            this.andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual);
            this.emMovimento = false;
        }
    }

    public void descer() {
        if (!emManutencao && !portaAberta && andarAtual > 0) {
            this.emMovimento = true;
            this.andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual);
            this.emMovimento = false;
        }
    }

    public void abrirPorta() {
        if (!emMovimento) {
            this.portaAberta = true;
            System.out.println("Porta aberta");
        }
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta fechada");
    }

    // Getters e Setters
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }

    public void setEmMovimento(boolean emMovimento) {
        this.emMovimento = emMovimento;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
} 