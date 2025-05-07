package aula0705;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Pessoa {
    // Atributos - estrutura basica da classe entidade
	final float pi=3.14f;
    private String nome;
    public Date dataNascimento;
    protected int idade;
    private String cpf;
    private String profissao;
    private float velocidade;
    private boolean estarSaudavel;
    private float barraVida; 

    // Construtores - estrutura basica da classe entidade
    
    public Pessoa() {
        this.barraVida = 100.0f;
        this.estarSaudavel = true;
        this.velocidade = 0.0f;
    }

    public Pessoa(String nome, String dataNascimento) {
        this();
        this.nome = nome;
        setDataNascimento(dataNascimento);
        calcularIdade();
    }
    public Pessoa(String nome, int idade) {
        this();
        this.nome = nome;
        this.idade=idade;
    }


    // Métodos adicionais
    public void curar() {
        if (!this.estarSaudavel) {
            this.estarSaudavel = true;
            this.barraVida = Math.min(100.0f, this.barraVida + 20.0f);
            System.out.println(nome + " foi curado(a). Barra de vida: " + barraVida);
        }
    }

    public void adoecer() {
        if (this.estarSaudavel) {
            this.estarSaudavel = false;
            this.barraVida = Math.max(0.0f, this.barraVida - 15.0f);
            System.out.println(nome + " adoeceu. Barra de vida: " + barraVida);
        }
    }

    public void andar() {
        this.velocidade = 5.0f;
        System.out.println(nome + " está andando com velocidade " + velocidade + " km/h");
    }

    public void sentar() {
        this.velocidade = 0.0f;
        System.out.println(nome + " sentou-se");
    }

    public String registrarCertidaoNascimento() {
        if (nome == null || dataNascimento == null) {
            return "Erro: Nome e data de nascimento são obrigatórios";
        }
        return "CERTIDÃO DE NASCIMENTO\n" +
               "Nome: " + nome + "\n" +
               "Data de Nascimento: " + formatarData(dataNascimento);
    }

    public void envelhecer() {
        if (dataNascimento != null) {
            calcularIdade();
            this.barraVida = Math.max(0.0f, this.barraVida - 5.0f);
            System.out.println(nome + " envelheceu. Nova idade: " + idade + ", Barra de vida: " + barraVida);
        }
    }

    public void calcularIdade() {
        if (dataNascimento != null) {
            Calendar hoje = Calendar.getInstance();
            Calendar nascimento = Calendar.getInstance();
            nascimento.setTime(dataNascimento);
            
            this.idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
            
            if (hoje.get(Calendar.MONTH) < nascimento.get(Calendar.MONTH) ||
                (hoje.get(Calendar.MONTH) == nascimento.get(Calendar.MONTH) &&
                 hoje.get(Calendar.DAY_OF_MONTH) < nascimento.get(Calendar.DAY_OF_MONTH))) {
                this.idade--;
            }
        }
    }

    public String pegarEmprestimo() {
        if (nome == null || dataNascimento == null || cpf == null) {
            return "Erro: Nome, data de nascimento e CPF são obrigatórios";
        }
        if (idade < 18) {
            return "Erro: Pessoa menor de idade não pode pegar empréstimo";
        }
        return "EMPRÉSTIMO APROVADO\n" +
               "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Nascimento: " + formatarData(dataNascimento);
    }

    public String gerarCertidaoObito() {
        if (nome == null || dataNascimento == null || cpf == null || profissao == null) {
            return "Erro: Dados incompletos para gerar certidão de óbito";
        }
        return "CERTIDÃO DE ÓBITO\n" +
               "Nome: " + nome + "\n" +
               "Profissão: " + profissao + "\n" +
               "Data de Nascimento: " + formatarData(dataNascimento) + "\n" +
               "CPF: " + cpf;
    }

    // Métodos auxiliares
    private void setDataNascimento(String data) {
        try {
            SimpleDateFormat formatoBr = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoIso = new SimpleDateFormat("yyyy-MM-dd");
            
            try {
                this.dataNascimento = formatoBr.parse(data);
            } catch (ParseException e) {
                this.dataNascimento = formatoIso.parse(data);
            }
        } catch (ParseException e) {
            System.out.println("Erro ao converter data. Use formato dd/MM/yyyy ou yyyy-MM-dd");
        }
    }

    private String formatarData(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

    // Getters e Setters - estrutura basica da classe entidade
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        calcularIdade();
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public boolean isEstarSaudavel() {
        return estarSaudavel;
    }

    public float getBarraVida() {
        return barraVida;
    }
} 