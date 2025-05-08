package aula0705;

public class Cafeteira {
    private String marca;
    private String modelo;
    private boolean ligada;
    private int nivelAgua; // em ml
    private int nivelCafe; // em gramas
    private String tipoCafe; // em grãos, moído, cápsula
    private boolean filtroLimpo;
    private String modoPreparo; // expresso, coado, etc
    private int temperatura;
    private int xicarasProntas;

    public Cafeteira() {
        this.ligada = false;
        this.nivelAgua = 0;
        this.nivelCafe = 0;
        this.filtroLimpo = true;
        this.temperatura = 0;
    }

    public Cafeteira(String marca, String modelo, String tipoCafe) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCafe = tipoCafe;
    }

    // Métodos específicos
    public void ligar() {
        if (!ligada && nivelAgua > 0) {
            this.ligada = true;
            this.temperatura = 90;
            System.out.println("Cafeteira ligada e aquecendo");
        }
    }

    public void prepararCafe() {
        if (ligada && nivelAgua >= 100 && nivelCafe >= 10 && filtroLimpo) {
            this.nivelAgua -= 100;
            this.nivelCafe -= 10;
            this.xicarasProntas++;
            System.out.println("Preparando café " + modoPreparo);
        }
    }

    public void limparFiltro() {
        this.filtroLimpo = true;
        System.out.println("Filtro limpo");
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