package aula0705;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "1990-04-20");
        pessoa.setCpf("123.456.789-00");
        pessoa.setProfissao("Programador");

        System.out.println(pessoa.registrarCertidaoNascimento());
        pessoa.andar();
        pessoa.sentar();
        pessoa.adoecer();
        pessoa.curar();
        pessoa.envelhecer();
        System.out.println(pessoa.pegarEmprestimo());
        System.out.println(pessoa.gerarCertidaoObito());

        // Testando Carro
        Carro carro = new Carro("Toyota", "Corolla", 2023, "Prata");
        carro.ligar();
        carro.acelerar(60);
        carro.frear(30);
        carro.desligar();

        // Testando Cachorro
        Cachorro cachorro = new Cachorro("Rex", "Labrador", 3);
        cachorro.latir();
        cachorro.brincar();
        cachorro.comer(0.5);
        cachorro.dormir();

        // Testando ContaBancaria
        ContaBancaria conta = new ContaBancaria("1234-5", "João Silva", "Corrente");
        conta.depositar(1000);
        conta.sacar(500);
        conta.verificarSaldo();

        // Testando Livro
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789", 1000);
        livro.emprestar();
        livro.ler(100);
        livro.exibirInformacoes();

        // Testando Computador
        Computador computador = new Computador("Intel i7", 16, 512, "Windows 11");
        computador.ligar();
        computador.conectarInternet();
        computador.executarPrograma("Chrome");
        computador.exibirEspecificacoes();
    }
} 