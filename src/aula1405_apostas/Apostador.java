package aula1405_apostas;

public class Apostador extends Pessoa{
	private int codigo;
	private float montante_apostas_gastos;
	private float montante_apostas_investido;
	private Aposta[] paostas_realizadas;
	private String data_cadastro;
	private String status_apostador;
	private float risco;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getMontante_apostas_gastos() {
		return montante_apostas_gastos;
	}
	public void setMontante_apostas_gastos(float montante_apostas_gastos) {
		this.montante_apostas_gastos = montante_apostas_gastos;
	}
	public float getMontante_apostas_investido() {
		return montante_apostas_investido;
	}
	public void setMontante_apostas_investido(float montante_apostas_investido) {
		this.montante_apostas_investido = montante_apostas_investido;
	}
	public Aposta[] getPaostas_realizadas() {
		return paostas_realizadas;
	}
	public void setPaostas_realizadas(Aposta[] paostas_realizadas) {
		this.paostas_realizadas = paostas_realizadas;
	}
	public String getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public String getStatus_apostador() {
		return status_apostador;
	}
	public void setStatus_apostador(String status_apostador) {
		this.status_apostador = status_apostador;
	}
	public float getRisco() {
		return risco;
	}
	public void setRisco(float risco) {
		this.risco = risco;
	}
	
	
	
	
	

}
