package aula0705;

public class Lampada {
    private String tipo; // LED, fluorescente, incandescente
    private int potencia; // em watts
    private boolean acesa;
    private String cor;
    private int vidaUtil; // em horas
    private int horasUso;
    private int intensidade; // 0-100%
    private boolean dimerizavel;
    private String temperatura; // quente, fria, neutra
    private double consumoEnergia;

    public Lampada() {
        this.acesa = false;
        this.intensidade = 100;
        this.horasUso = 0;
        this.dimerizavel = false;
    }

    public Lampada(String tipo, int potencia, String temperatura) {
        this();
        this.tipo = tipo;
        this.potencia = potencia;
        this.temperatura = temperatura;
        this.vidaUtil = tipo.equalsIgnoreCase("LED") ? 50000 : 10000;
    }

    // Métodos específicos
    public void acender() {
        if (!acesa) {
            this.acesa = true;
            System.out.println("Lâmpada acesa");
        }
    }

    public void apagar() {
        if (acesa) {
            this.acesa = false;
            System.out.println("Lâmpada apagada");
        }
    }

    public void ajustarIntensidade(int intensidade) {
        if (dimerizavel && intensidade >= 0 && intensidade <= 100) {
            this.intensidade = intensidade;
            System.out.println("Intensidade ajustada para " + intensidade + "%");
        }
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public boolean isDimerizavel() {
        return dimerizavel;
    }

    public void setDimerizavel(boolean dimerizavel) {
        this.dimerizavel = dimerizavel;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
} 