package aula0705;

public class CachorroEntidade  extends Animal{
    // Atributos
    private String nome;
   
    private int idade;
    private double peso;
    private boolean fome;
    private boolean dormindo;
    private String humor; // feliz, triste, bravo

    // Construtores
    
    public CachorroEntidade() {}
    
    public CachorroEntidade(String raca) {
    	super(raca);
        this.fome = false;
        this.dormindo = false;
        this.humor = "feliz";
        this.setRaca("pincher");
    }

    public CachorroEntidade(String nome, String raca, int idade, String especie) {
    	
        this.nome = nome;
       
        this.idade = idade;
    }
    // Getters e Setters (implementar conforme necessidade)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return this.getRaca();
	}

	public void setRaca(String raca) {
		this.setRaca(raca);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isFome() {
		return fome;
	}

	public void setFome(boolean fome) {
		this.fome = fome;
	}

	public boolean isDormindo() {
		return dormindo;
	}

	public void setDormindo(boolean dormindo) {
		this.dormindo = dormindo;
	}

	public String getHumor() {
		return humor;
	}

	public void setHumor(String humor) {
		this.humor = humor;
	}
    
} 