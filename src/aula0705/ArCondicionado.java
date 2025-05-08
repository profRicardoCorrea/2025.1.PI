package aula0705;

public class ArCondicionado {
    private String marca;
    private String modelo;
    private boolean ligado;
    private int temperatura;
    private String modo; // resfriar, aquecer, ventilar, automatico
    private int velocidadeVentilacao; // 1-3
    private boolean swing;
    private boolean economicoAtivo;
    private int temporizador; // em minutos
    private boolean silencioso;

    public ArCondicionado() {
        this.ligado = false;
        this.temperatura = 23;
        this.modo = "resfriar";
        this.velocidadeVentilacao = 1;
        this.swing = false;
        this.economicoAtivo = false;
    }

    public ArCondicionado(String marca, String modelo) {
        this();
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos específicos
    public void ligar() {
        this.ligado = true;
        System.out.println("Ar condicionado ligado na temperatura " + temperatura + "°C");
    }

    public void ajustarTemperatura(int novaTemp) {
        if (ligado && novaTemp >= 16 && novaTemp <= 30) {
            this.temperatura = novaTemp;
            System.out.println("Temperatura ajustada para " + novaTemp + "°C");
        }
    }

    public void alterarModo(String novoModo) {
        if (ligado) {
            this.modo = novoModo;
            System.out.println("Modo alterado para: " + novoModo);
        }
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // ... implementar os demais getters e setters
} 