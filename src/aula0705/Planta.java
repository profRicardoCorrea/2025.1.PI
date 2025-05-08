package aula0705;

public class Planta {
    private String especie;
    private String nome;
    private double altura;
    private boolean precisaLuz;
    private int diasSemRegar;
    private String tipoSolo;
    private boolean interior; // planta de interior ou exterior
    private String estacao; // melhor estação para cultivo
    private boolean viva;
    private double nivelSaude; // 0-100%

    public Planta() {
        this.viva = true;
        this.nivelSaude = 100.0;
        this.diasSemRegar = 0;
        this.altura = 0.1; // 10cm inicial
    }

    public Planta(String especie, String nome, boolean precisaLuz, String tipoSolo) {
        this();
        this.especie = especie;
        this.nome = nome;
        this.precisaLuz = precisaLuz;
        this.tipoSolo = tipoSolo;
    }

    // Métodos específicos
    public void regar() {
        if (viva && diasSemRegar > 0) {
            this.diasSemRegar = 0;
            this.nivelSaude = Math.min(100, nivelSaude + 10);
            System.out.println("Planta regada");
        }
    }

    public void crescer() {
        if (viva && nivelSaude > 50) {
            this.altura += 0.05; // cresce 5cm
            System.out.println("A planta cresceu para " + altura + "m");
        }
    }

    public void podar() {
        if (viva && altura > 0.2) {
            this.altura *= 0.8; // reduz 20% da altura
            System.out.println("Planta podada");
        }
    }

    // Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isPrecisaLuz() {
        return precisaLuz;
    }

    public void setPrecisaLuz(boolean precisaLuz) {
        this.precisaLuz = precisaLuz;
    }

    public int getDiasSemRegar() {
        return diasSemRegar;
    }

    public void setDiasSemRegar(int diasSemRegar) {
        this.diasSemRegar = diasSemRegar;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    public double getNivelSaude() {
        return nivelSaude;
    }

    public void setNivelSaude(double nivelSaude) {
        this.nivelSaude = nivelSaude;
    }
} 