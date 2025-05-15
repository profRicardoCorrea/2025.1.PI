package aula1405_apostas;

public class Aposta {
	private Evento evento;
	private Apostador apostador;
	private String data_aposta;
	private float valor;
	private String situcao;
	private String metodo_pagamento;
	
	
	public Aposta() {
		super();
	}
	
	
	public Aposta(Evento evento, Apostador apostador, String data_aposta, float valor, String situcao,
			String metodo_pagamento) {
		super();
		this.evento = evento;
		this.apostador = apostador;
		this.data_aposta = data_aposta;
		this.valor = valor;
		this.situcao = situcao;
		this.metodo_pagamento = metodo_pagamento;
	}


	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Apostador getApostador() {
		return apostador;
	}
	public void setApostador(Apostador apostador) {
		this.apostador = apostador;
	}
	public String getData_aposta() {
		return data_aposta;
	}
	public void setData_aposta(String data_aposta) {
		this.data_aposta = data_aposta;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getSitucao() {
		return situcao;
	}
	public void setSitucao(String situcao) {
		this.situcao = situcao;
	}
	public String getMetodo_pagamento() {
		return metodo_pagamento;
	}
	public void setMetodo_pagamento(String metodo_pagamento) {
		this.metodo_pagamento = metodo_pagamento;
	}
	

}
