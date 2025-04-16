package com.exemplo.anatomia;

/**
 * Classe que representa o corpo humano e seus principais órgãos e sistemas
 */
public class CorpoHumanoSimples {
    // Sistema Circulatório
    private Coracao coracao;
    private boolean sangueCirculando;
    private int pressaoArterial;
    
    // Sistema Respiratório
    private Pulmao pulmoes;
    private boolean respirando;
    private int frequenciaRespiratoria;
    
    // Sistema Digestivo
    private Estomago estomago;
    private Figado figado;
    private boolean digerindo;
    
    // Sistema Nervoso
    private Cerebro cerebro;
    private boolean consciente;
    private int nivelDeDor;
    
    // Classes internas para representar os órgãos
    public class Coracao {
        private int batimentosPorMinuto;
        private boolean bombeando;
        
        public Coracao() {
            this.batimentosPorMinuto = 70;
            this.bombeando = true;
        }
    }
    
    public class Pulmao {
        private int capacidadePulmonar;
        private boolean expandido;
        
        public Pulmao() {
            this.capacidadePulmonar = 100;
            this.expandido = true;
        }
    }
    
    public class Estomago {
        private boolean cheio;
        private int nivelAcido;
        
        public Estomago() {
            this.cheio = false;
            this.nivelAcido = 50;
        }
    }
    
    public class Figado {
        private boolean funcionando;
        private int nivelToxinas;
        
        public Figado() {
            this.funcionando = true;
            this.nivelToxinas = 0;
        }
    }
    
    public class Cerebro {
        private boolean ativo;
        private int nivelConsciencia;
        
        public Cerebro() {
            this.ativo = true;
            this.nivelConsciencia = 100;
        }
    }
    
    // Construtor
    public CorpoHumanoSimples() {
        this.coracao = new Coracao();
        this.pulmoes = new Pulmao();
        this.estomago = new Estomago();
        this.figado = new Figado();
        this.cerebro = new Cerebro();
        
        this.sangueCirculando = true;
        this.pressaoArterial = 120;
        this.respirando = true;
        this.frequenciaRespiratoria = 16;
        this.digerindo = false;
        this.consciente = true;
        this.nivelDeDor = 0;
    }
    
    // Métodos para simular funções vitais
    public void respirar() {
        if (this.respirando) {
            System.out.println("Respirando normalmente. Frequência: " + 
                             this.frequenciaRespiratoria + " respirações por minuto");
        }
    }
    
    public void bombearSangue() {
        if (this.sangueCirculando) {
            System.out.println("Coração batendo. Pressão arterial: " + 
                             this.pressaoArterial + "mmHg");
        }
    }
    
    public void digerir(String alimento) {
        this.digerindo = true;
        System.out.println("Digerindo: " + alimento);
    }
    
    public void pensar(String pensamento) {
        if (this.consciente) {
            System.out.println("Pensando em: " + pensamento);
        }
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        CorpoHumanoSimples corpo = new CorpoHumanoSimples();
        
        System.out.println("=== Simulação do Corpo Humano ===");
        corpo.respirar();
        corpo.bombearSangue();
        corpo.digerir("Maçã");
        corpo.pensar("Programação Java");
    }
} 