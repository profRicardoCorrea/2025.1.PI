package aula0705;

public class Casa {
    private String endereco;
    private int numeroQuartos;
    private int numeroBanheiros;
    private double areaTotal;
    private boolean temGaragem;
    private String cor;
    private int numeroAndares;
    private boolean temQuintal;
    private double valorImovel;
    private String proprietario;

    public Casa() {
        this.numeroQuartos = 1;
        this.numeroBanheiros = 1;
        this.numeroAndares = 1;
        this.temGaragem = false;
        this.temQuintal = false;
    }

    public Casa(String endereco, int numeroQuartos, double areaTotal, String proprietario) {
        this();
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.areaTotal = areaTotal;
        this.proprietario = proprietario;
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public boolean isTemGaragem() {
        return temGaragem;
    }

    public void setTemGaragem(boolean temGaragem) {
        this.temGaragem = temGaragem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public void setNumeroAndares(int numeroAndares) {
        this.numeroAndares = numeroAndares;
    }

    public boolean isTemQuintal() {
        return temQuintal;
    }

    public void setTemQuintal(boolean temQuintal) {
        this.temQuintal = temQuintal;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
} 