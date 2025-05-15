package aula1405_localiza;

public abstract class Veiculo {
	private String modelo;
	private String placa;
	private String categoria;
	
	
	public Veiculo(String modelo, String placa, String categoria) {
		 
		this.modelo = modelo;
		this.placa = placa;
		this.categoria = categoria;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	abstract public int calcularKM(int gasolinaLitros);
	
	
	
}
