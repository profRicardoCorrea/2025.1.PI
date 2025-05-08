package aula0705;

public class MicroondasDigital {
    private String marca;
    private String modelo;
    private boolean ligado;
    private int potencia; // em watts
    private int tempoRestante; // em segundos
    private boolean portaAberta;
    private boolean pratoGirando;
    private String programaAtual;
    private boolean luzInterna;
    private double capacidadeLitros;

    public MicroondasDigital() {
        this.ligado = false;
        this.portaAberta = false;
        this.pratoGirando = false;
        this.luzInterna = false;
        this.potencia = 10; // nível 1 de 10
    }

    public MicroondasDigital(String marca, String modelo, double capacidadeLitros) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeLitros = capacidadeLitros;
    }

    // Métodos específicos
    public void aquecer(int tempo) {
        if (!portaAberta && !ligado) {
            this.ligado = true;
            this.pratoGirando = true;
            this.luzInterna = true;
            this.tempoRestante = tempo;
            System.out.println("Aquecendo por " + tempo + " segundos na potência " + potencia);
        }
    }

    public void abrirPorta() {
        if (ligado) {
            pausar();
        }
        this.portaAberta = true;
        this.luzInterna = true;
        System.out.println("Porta aberta");
    }

    public void pausar() {
        if (ligado) {
            this.ligado = false;
            this.pratoGirando = false;
            System.out.println("Operação pausada");
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