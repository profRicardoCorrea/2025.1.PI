package aula0705;

public class Animal {
	private String raca;
	protected String especie;
	
	public Animal() {}
	
	public Animal(String raca) {
		this.raca=raca;
	}
	public Animal(String raca, String especie) {
		this.raca=raca;
		this.especie=especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
