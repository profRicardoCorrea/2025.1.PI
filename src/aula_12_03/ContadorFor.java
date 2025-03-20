package aula_12_03;

public class ContadorFor {

	public static void main(String[] args) {
		/*int contador1=0;
		while(contador1>0) {
			System.out.println("ContadorWhile:"+contador1);
			contador1++;			 
		}*/
		
		for (int contador = 35; contador <= 75; contador+=2) {
			System.out.println("ContadorFor:"+contador);
		}
	}
}
