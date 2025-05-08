package aula0705;

public class SistemaVentilacao {
    private boolean ligado;
    private int velocidade; // 1-5
    private String modo; // automatico, manual
    private double temperatura;
    private int umidade;
    private boolean filtroLimpo;
    private String direcaoVento; // fixo, oscilante
    private boolean modoEconomico;
    private int temporizador;
    private boolean silencioso;

    public SistemaVentilacao() {
        this.ligado = false;
        this.velocidade = 1;
        this.modo = "manual";
        this.temperatura = 25.0;
        this.umidade = 50;
        this.filtroLimpo = true;
    }

    public SistemaVentilacao(String modo, boolean modoEconomico) {
        this();
        this.modo = modo;
        this.modoEconomico = modoEconomico;
    }

    // Métodos específicos
    public void ligar() {
        if (!ligado && filtroLimpo) {
            this.ligado = true;
            System.out.println("Sistema de ventilação ligado");
        }
    }

    public void ajustarVelocidade(int novaVelocidade) {
        if (ligado && novaVelocidade >= 1 && novaVelocidade <= 5) {
            this.velocidade = novaVelocidade;
            System.out.println("Velocidade ajustada para: " + novaVelocidade);
        }
    }

    public void alternarDirecao() {
        if (ligado) {
            this.direcaoVento = this.direcaoVento.equals("fixo") ? "oscilante" : "fixo";
            System.out.println("Direção do vento: " + direcaoVento);
        }
    }

    // Getters e Setters
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // ... implementar os demais getters e setters
} 