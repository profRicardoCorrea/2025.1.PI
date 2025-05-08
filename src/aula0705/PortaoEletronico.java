package aula0705;

public class PortaoEletronico {
    private boolean aberto;
    private boolean emMovimento;
    private String status; // aberto, fechado, abrindo, fechando
    private boolean travado;
    private boolean temEnergia;
    private boolean modoManual;
    private int velocidade; // 1-5
    private boolean temSensor;
    private String ultimoComando;
    private boolean manutencaoNecessaria;

    public PortaoEletronico() {
        this.aberto = false;
        this.emMovimento = false;
        this.status = "fechado";
        this.travado = true;
        this.temEnergia = true;
        this.velocidade = 3;
    }

    public PortaoEletronico(boolean temSensor, int velocidade) {
        this();
        this.temSensor = temSensor;
        this.velocidade = velocidade;
    }

    // Métodos específicos
    public void abrir() {
        if (!aberto && temEnergia && !manutencaoNecessaria) {
            this.emMovimento = true;
            this.status = "abrindo";
            this.travado = false;
            System.out.println("Portão abrindo...");
            
            // Simulação do fim do movimento
            this.aberto = true;
            this.emMovimento = false;
            this.status = "aberto";
        }
    }

    public void fechar() {
        if (aberto && temEnergia && !manutencaoNecessaria) {
            this.emMovimento = true;
            this.status = "fechando";
            System.out.println("Portão fechando...");
            
            // Simulação do fim do movimento
            this.aberto = false;
            this.emMovimento = false;
            this.status = "fechado";
            this.travado = true;
        }
    }

    public void pararEmergencia() {
        if (emMovimento) {
            this.emMovimento = false;
            this.status = "parado";
            System.out.println("Parada de emergência acionada!");
        }
    }

    // Getters e Setters
    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    // ... implementar os demais getters e setters
} 