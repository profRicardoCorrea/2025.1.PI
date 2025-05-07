package aula0705;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;
    private boolean ligado;
    private double combustivel;
    private double consumoMedio; // km/l

    // Construtores
    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0.0;
        this.combustivel = 50.0;
        this.consumoMedio = 10.0;
    }

    public Carro(String marca, String modelo, int ano, String cor) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        
    }

    // Métodos
    public void ligar() {
        if (!ligado && combustivel > 0) {
            this.ligado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("Não foi possível ligar o carro");
        }
    }

    public void desligar() {
        if (ligado && velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Pare o carro antes de desligar");
        }
    }

    public void acelerar(double incremento) {
        if (ligado && combustivel > 0) {
            this.velocidadeAtual += incremento;
            this.combustivel -= (incremento/100); // Consumo simulado
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void frear(double decremento) {
        if (velocidadeAtual > 0) {
            this.velocidadeAtual = Math.max(0, velocidadeAtual - decremento);
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void abastecer(double litros) {
        this.combustivel += litros;
        System.out.println("Abastecido com " + litros + " litros");
    }
    // Getters e Setters (implementar conforme necessidade)
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public double getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

   
    
    
} 