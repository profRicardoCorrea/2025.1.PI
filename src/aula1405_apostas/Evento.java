package aula1405_apostas;
//ENVENTO ESPORTIVO - TELEVISIVO - EVENTOHISTORICO
public abstract class Evento {
	private String nome;
	private String categoria;
	private String dataHoraInicio;
	private String dataHoraFim;
	private String dataHoraInicioAposta;
	private String dataHoraFimAposta;
	private int qtd_apostadores;
	private float montante_apostado;
	private String situacao;//Aberto Fechado
	
	
	public Evento() {	}
	
	
	public Evento(String nome, String categoria) {
	 
		this.nome = nome;
		this.categoria = categoria;
	}


	public Evento(String nome, String categoria, String dataHoraInicio, String dataHoraFim, String dataHoraInicioAposta,
			String dataHoraFimAposta, int qtd_apostadores, float montante_apostado) {
		 
		this.nome = nome;
		this.categoria = categoria;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.dataHoraInicioAposta = dataHoraInicioAposta;
		this.dataHoraFimAposta = dataHoraFimAposta;
		this.qtd_apostadores = qtd_apostadores;
		this.montante_apostado = montante_apostado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(String dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public String getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(String dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public String getDataHoraInicioAposta() {
		return dataHoraInicioAposta;
	}
	public void setDataHoraInicioAposta(String dataHoraInicioAposta) {
		this.dataHoraInicioAposta = dataHoraInicioAposta;
	}
	public String getDataHoraFimAposta() {
		return dataHoraFimAposta;
	}
	public void setDataHoraFimAposta(String dataHoraFimAposta) {
		this.dataHoraFimAposta = dataHoraFimAposta;
	}
	public int getQtd_apostadores() {
		return qtd_apostadores;
	}
	public void setQtd_apostadores(int qtd_apostadores) {
		this.qtd_apostadores = qtd_apostadores;
	}
	public float getMontante_apostado() {
		return montante_apostado;
	}
	public void setMontante_apostado(float montante_apostado) {
		this.montante_apostado = montante_apostado;
	}
	
	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	abstract void fecharEvento();
	
	
	
	

}
