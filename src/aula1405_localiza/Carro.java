package aula1405_localiza;

import java.util.Arrays;

public class Carro extends Veiculo{
	 
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	private int ano;
	private int anoCompra;
	private int anoVenda;
	private int numAvarias;
	private String statusLocacao;//DISPONIVEL, INDISPONIVEL_ADM, INDISPONIVEL_LOCADO, INDISPONIVEL_MANUTENCAO_CURTA, INDISPONIVEL_MANUTENCAO_AVARIA
	private float diaria;
	private int[] codigo_cliente;
	
	public Carro(String modelo, String placa, String categoria) {
		super( modelo,  placa,  categoria);
	}
	

	public Carro(String modelo, String placa, String categoria, boolean arCondicionado, boolean direcaoHidraulica,
			int ano, int anoCompra, int anoVenda, int numAvarias, String statusLocacao, float diaria) {
		super( modelo,  placa,  categoria);
		 
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.ano = ano;
		this.anoCompra = anoCompra;
		this.anoVenda = anoVenda;
		this.numAvarias = numAvarias;
		this.statusLocacao = statusLocacao;
		this.diaria = diaria;
	}
	public Carro(String modelo, String placa, String categoria, boolean arCondicionado, boolean direcaoHidraulica,
	  String statusLocacao, float diaria) {
		super( modelo,  placa,  categoria);
		 
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.ano = ano;
		this.anoCompra = anoCompra;
		this.anoVenda = anoVenda;
		this.numAvarias = numAvarias;
		this.statusLocacao = statusLocacao;
		this.diaria = diaria;
	} 

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAnoCompra() {
		return anoCompra;
	}

	public void setAnoCompra(int anoCompra) {
		this.anoCompra = anoCompra;
	}

	public int getAnoVenda() {
		return anoVenda;
	}

	public void setAnoVenda(int anoVenda) {
		this.anoVenda = anoVenda;
	}

	public int getNumAvarias() {
		return numAvarias;
	}

	public void setNumAvarias(int numAvarias) {
		this.numAvarias = numAvarias;
	}

	public String getStatusLocacao() {
		return statusLocacao;
	}

	public void setStatusLocacao(String statusLocacao) {
		this.statusLocacao = statusLocacao;
	}

	public float getDiaria() {
		return diaria;
	}

	public void setDiaria(float diaria) {
		this.diaria = diaria;
	}


	@Override
	public int calcularKM(int gasolinaLitros) {		
		return gasolinaLitros*5;
	}


	@Override
	public String toString() {
		return "Carro [arCondicionado=" + arCondicionado + ", direcaoHidraulica=" + direcaoHidraulica + ", ano=" + ano
				+ ", anoCompra=" + anoCompra + ", anoVenda=" + anoVenda + ", numAvarias=" + numAvarias
				+ ", statusLocacao=" + statusLocacao + ", diaria=" + diaria + ", codigo_cliente="
				+ Arrays.toString(codigo_cliente) + "]";
	}
	
	
	
	
	
	

}
  
