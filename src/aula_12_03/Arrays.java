package aula_12_03;

public class Arrays {
	public static void main(String[] args) {
		//["JOAO","PEDRO","LUIZ","MONICA","SUZI"]
		String n1="JOAO";
		String n2="PEDRO";
		String n3="LUIZ";
		String n4="MONICA";
		String n5="SUZI";
		
		String[] nomes_pessoas1=new  String[50];
		int[] idade_pessoas1=new  int[50];
		float [] notas_pessoas1=new float[50];
		//[0,1,2,3,4]
		/*nomes_pessoas1[0]="JOAO";
		nomes_pessoas1[1]="PEDRO";
		nomes_pessoas1[2]="LUIZ";
		nomes_pessoas1[3]="MONICA";
		nomes_pessoas1[4]="SUZI";*/
		/*System.out.println("NOME:"+nomes_pessoas1[0]);
		System.out.println("NOME:"+nomes_pessoas1[1]);
		System.out.println("NOME:"+nomes_pessoas1[2]);
		System.out.println("NOME:"+nomes_pessoas1[3]);
		System.out.println("NOME:"+nomes_pessoas1[4]);*/
		
		System.out.println("TAM nomes_pessoas1:"+nomes_pessoas1.length);
		for(int indice=0;indice<nomes_pessoas1.length;indice++) { 
			nomes_pessoas1[indice]="JOAO "+indice;
			idade_pessoas1[indice]=indice+10;
			notas_pessoas1[indice]=(indice*10)/5;
		}
			 
		
		//System.out.println("TAM nomes_pessoas1:"+nomes_pessoas1.length);
		for(int indice=0;indice<nomes_pessoas1.length;indice++) {		
			 
			System.out.println("nomes_pessoas1["+indice+"] NOME:"
			+nomes_pessoas1[indice]+" IDADE:"+idade_pessoas1[indice]
					+"NOTA:"+notas_pessoas1[indice]);
		} 
		
		 
		//String[] nomes_pessoas2={"JOAO","PEDRO","LUIZ","MONICA","SUZI"};
		
		
	}

}
