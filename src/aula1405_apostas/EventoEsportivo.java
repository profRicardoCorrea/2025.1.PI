package aula1405_apostas;

public class EventoEsportivo extends Evento {
	private int qtd_pontos_gols;
	private int qtd_faltas;
	private int qtd_penalidades;
	private int qtd_escanteios;
	
	public EventoEsportivo(String nome, String categoria) {
		super(nome, categoria);
	}
	public EventoEsportivo(int qtd_pontos_gols, int qtd_faltas, int qtd_penalidades, int qtd_escanteios) {
		super();
		this.qtd_pontos_gols = qtd_pontos_gols;
		this.qtd_faltas = qtd_faltas;
		this.qtd_penalidades = qtd_penalidades;
		this.qtd_escanteios = qtd_escanteios;
	}
	public int getQtd_pontos_gols() {
		return qtd_pontos_gols;
	}
	public void setQtd_pontos_gols(int qtd_pontos_gols) {
		this.qtd_pontos_gols = qtd_pontos_gols;
	}
	public int getQtd_faltas() {
		return qtd_faltas;
	}
	public void setQtd_faltas(int qtd_faltas) {
		this.qtd_faltas = qtd_faltas;
	}
	public int getQtd_penalidades() {
		return qtd_penalidades;
	}
	public void setQtd_penalidades(int qtd_penalidades) {
		this.qtd_penalidades = qtd_penalidades;
	}
	public int getQtd_escanteios() {
		return qtd_escanteios;
	}
	public void setQtd_escanteios(int qtd_escanteios) {
		this.qtd_escanteios = qtd_escanteios;
	}
	@Override
	void fecharEvento() {
		 this.setSituacao("FECHADO");
		
	}
	
	
	
	
	

}
