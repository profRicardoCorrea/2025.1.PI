package aula0705;

public class Cachorro {
    // Atributos
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private boolean fome;
    private boolean dormindo;
    private String humor; // feliz, triste, bravo

    // Construtores
    public Cachorro() {
        this.fome = false;
        this.dormindo = false;
        this.humor = "feliz";
    }

    public Cachorro(String nome, String raca, int idade) {
        this();
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Métodos
    public void latir() {
        if (!dormindo) {
            System.out.println(nome + ": Au au!");
        }
    }

    public void comer(double quantidade) {
        if (fome) {
            this.peso += quantidade * 0.1;
            this.fome = false;
            this.humor = "feliz";
            System.out.println(nome + " comeu e está satisfeito");
        } else {
            System.out.println(nome + " não está com fome");
        }
    }

    public void dormir() {
        this.dormindo = true;
        System.out.println(nome + " está dormindo... ZzZzZ");
    }

    public void acordar() {
        this.dormindo = false;
        this.fome = true;
        System.out.println(nome + " acordou");
    }

    public void brincar() {
        if (!dormindo) {
            this.humor = "feliz";
            this.fome = true;
            System.out.println(nome + " está brincando alegremente");
        }
    }

    // Getters e Setters (implementar conforme necessidade)
} 