package aula_12_03;

import java.util.Scanner;

public class ArrayDinamico {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas para armazenar:");
		int qtd_pessoas= scanner.nextInt();
		
		String[] nomes_pessoas1=new  String[qtd_pessoas];
		int[] idade_pessoas1=new  int[qtd_pessoas];
		float [] notas_pessoas1=new float[qtd_pessoas];
		 
		
		 
		
		System.out.println("TAM nomes_pessoas1:"+nomes_pessoas1.length);
		for(int indice=0;indice<nomes_pessoas1.length;indice++) { 
			System.out.print("Digite o nome da pessoa("+indice+"):");			 
			nomes_pessoas1[indice]= scanner.next();
			System.out.print("Digite o idade da pessoa("+indice+"):");
			idade_pessoas1[indice]= scanner.nextInt();
			System.out.print("Digite a nota da pessoa("+indice+"):");
			notas_pessoas1[indice]=scanner.nextFloat();
		}
			 
		
		//System.out.println("TAM nomes_pessoas1:"+nomes_pessoas1.length);
		for(int indice=0;indice<nomes_pessoas1.length;indice++) {		
			 
			System.out.println("nomes_pessoas1["+indice+"] NOME:"
			+nomes_pessoas1[indice]+" IDADE:"+idade_pessoas1[indice]
					+" NOTA:"+notas_pessoas1[indice]);
		} 
		
		 
		//String[] nomes_pessoas2={"JOAO","PEDRO","LUIZ","MONICA","SUZI"};
		
		
	}
}
