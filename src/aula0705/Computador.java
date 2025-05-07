package aula0705;

public class Computador {
    // Atributos
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String sistemaOperacional;
    private boolean ligado;
    private int temperaturaAtual;
    private boolean conectadoInternet;
    private int nivelBateria; // para notebooks

    // Construtores
    public Computador() {
        this.ligado = false;
        this.temperaturaAtual =0;
        this.conectadoInternet = false;
        this.nivelBateria = 50;
    }

    public Computador(String processador, int memoriaRAM, int armazenamento, String sistemaOperacional) {
        
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Métodos
    public void ligar() {
        if (!ligado && nivelBateria > 0) {
            this.ligado = true;
            this.temperaturaAtual += 10;
            System.out.println("Computador ligado");
        } else {
            System.out.println("Não foi possível ligar o computador");
        }
    }

    public void desligar() {
        if (ligado) {
            this.ligado = false;
            this.temperaturaAtual = 25;
            System.out.println("Computador desligado");
        }
    }

    public void conectarInternet() {
        if (ligado && !conectadoInternet) {
            this.conectadoInternet = true;
            System.out.println("Conectado à internet");
        }
    }

    public void executarPrograma(String programa) {
        if (ligado) {
            this.temperaturaAtual += 5;
            this.nivelBateria -= 5;
            System.out.println("Executando " + programa);
            verificarTemperatura();
            memoriaRAM-=10;
            
        }
    }

    private void verificarTemperatura() {
        if (temperaturaAtual > 80) {
            System.out.println("ATENÇÃO: Temperatura muito alta!");
        }
    }

    public void carregarBateria() {
        if (nivelBateria < 100) {
            this.nivelBateria = 100;
            System.out.println("Bateria carregada");
        }
    }

    public void exibirEspecificacoes() {
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
 // Getters e Setters (implementar conforme necessidade)
	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getTemperaturaAtual() {
		return temperaturaAtual;
	}

	public void setTemperaturaAtual(int temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}

	public boolean isConectadoInternet() {
		return conectadoInternet;
	}

	public void setConectadoInternet(boolean conectadoInternet) {
		this.conectadoInternet = conectadoInternet;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

    
    
} 