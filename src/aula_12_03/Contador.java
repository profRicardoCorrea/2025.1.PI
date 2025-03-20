package aula_12_03;

import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
	int contador=0;
	int x=3;
	int y=23;
		
	/*while(contador>0) {
		System.out.println("Contador:"+contador+"X:"+x+"Y:"+y);
		contador++;
		y+=1;
		x+=1;
		 
	}*/
	
	/*do {
		System.out.println("Contador:"+contador);
		//contador++;
	}while(contador>0);
	System.out.println("FIM");*/
	
	 
	
	/*int opcao=-1;
	Scanner scanner = new Scanner(System.in);

	//System.out.print("1º OPCOES: 1 - Cadastrar 2-Listar 0 - Sair");
	//opcao= scanner.nextInt();
	 
	while(opcao!=0) {
		switch(opcao) {
			case 1:
				System.out.println("***Cadastrar");
				break;
			case 2:
				System.out.println("***Listar");
				break;
			case 0:
				System.out.println("***SAIR");
				break;
			default:
				System.out.println("***OPCAO INVALIDA");
		}
		System.out.print("2º OPCOES: 1 - Cadastrar -Listar 0 - Sair");
		opcao= scanner.nextInt();
	}
	System.out.println("FIM");*/
	
	
	int opcao=0;
	Scanner scanner = new Scanner(System.in);

	//System.out.print("1º OPCOES: 1 - Cadastrar 2-Listar 0 - Sair");
	//opcao= scanner.nextInt();
	 
	do {
		System.out.print("OPCOES: 1 - Cadastrar -Listar 0 - Sair");
		opcao= scanner.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("***Cadastrar");
				break;
			case 2:
				System.out.println("***Listar");
				break;
			case 0:
				System.out.println("***SAIR");
				break;
			default:
				System.out.println("***OPCAO INVALIDA");
		}
		
	}while(opcao!=0);
	System.out.println("FIM");
}

}
