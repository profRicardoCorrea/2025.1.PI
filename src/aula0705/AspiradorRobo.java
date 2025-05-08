package aula0705;

public class AspiradorRobo {
    private String marca;
    private String modelo;
    private boolean ligado;
    private double nivelBateria;
    private String modoLimpeza; // normal, turbo, silencioso
    private boolean emOperacao;
    private double capacidadeReservatorio;
    private double nivelReservatorio;
    private String localizacaoAtual;
    private boolean retornandoBase;

    public AspiradorRobo() {
        this.ligado = false;
        this.nivelBateria = 100.0;
        this.emOperacao = false;
        this.nivelReservatorio = 0.0;
        this.modoLimpeza = "normal";
    }

    public AspiradorRobo(String marca, String modelo, double capacidadeReservatorio) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeReservatorio = capacidadeReservatorio;
    }

    // Métodos específicos
    public void iniciarLimpeza() {
        if (!emOperacao && nivelBateria > 20 && nivelReservatorio < capacidadeReservatorio) {
            this.emOperacao = true;
            this.ligado = true;
            System.out.println("Iniciando limpeza no modo " + modoLimpeza);
        }
    }

    public void retornarBase() {
        if (emOperacao) {
            this.retornandoBase = true;
            System.out.println("Retornando à base de carregamento");
        }
    }

    public void esvaziarReservatorio() {
        if (!emOperacao) {
            this.nivelReservatorio = 0.0;
            System.out.println("Reservatório esvaziado");
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