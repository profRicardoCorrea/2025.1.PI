package aula0705;

public class MaquinaDeExercicios {
    private String tipo; // esteira, bicicleta, elíptico
    private String marca;
    private String modelo;
    private boolean ligada;
    private double velocidadeAtual;
    private int nivelResistencia;
    private double distanciaPercorrida;
    private int caloriasQueimadas;
    private String programaAtual;
    private int tempoDeUso; // em minutos

    public MaquinaDeExercicios() {
        this.ligada = false;
        this.velocidadeAtual = 0.0;
        this.nivelResistencia = 1;
        this.distanciaPercorrida = 0.0;
        this.caloriasQueimadas = 0;
    }

    public MaquinaDeExercicios(String tipo, String marca, String modelo) {
        this();
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos específicos
    public void ligar() {
        this.ligada = true;
        System.out.println("Máquina ligada");
    }

    public void iniciarExercicio(String programa) {
        if (ligada) {
            this.programaAtual = programa;
            this.velocidadeAtual = 2.0;
            System.out.println("Iniciando programa: " + programa);
        }
    }

    public void ajustarResistencia(int nivel) {
        if (ligada && nivel >= 1 && nivel <= 20) {
            this.nivelResistencia = nivel;
            System.out.println("Resistência ajustada para nível " + nivel);
        }
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // ... implementar os demais getters e setters
} 