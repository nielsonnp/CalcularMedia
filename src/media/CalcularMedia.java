package media;

import java.util.*;

//Exemplo de média com 2 notas

public class CalcularMedia {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
	double nota1;
	double nota2;
	
	System.out.println("Digite a primeira nota : ");
	nota1 = entrada.nota1();
	
	System.out.println("Digite a segunda nota : ");
	nota2 = entrada.nota2();
	
	double media = (nota1 + nota2) / 2;
	System.out.println(media);
	
		

	}

}
