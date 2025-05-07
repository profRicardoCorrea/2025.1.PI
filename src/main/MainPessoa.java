package main;
import aula2304.Pessoa;
public class MainPessoa {
 public static void main(String[] args) {
	Pessoa p1=new Pessoa();
	System.out.println("Nome:"+p1.getNomeCompleto());
	p1.setNomeCompleto("Fulano");
	p1.setCpf("989383");
	p1.setIdade(123);
	
}
}
