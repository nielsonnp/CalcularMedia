package media;

import java.util.*;

//Exemplo de média com 2 notas

public class CalcularMedia {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
	float nota1;
	float nota2;
	
	System.out.println("Digite a primeira nota : ");
	nota1 = entrada.nextFloat();
	
	System.out.println("Digite a segunda nota : ");
	nota2 = entrada.nextFloat();
	
	float media = (nota1 + nota2) / 2;
	System.out.println("Media = " + media);
	
	if (media >=9.0) {
        System.out.println("Excelente");
    } else if (media >= 8.0){
        System.out.println("Otimo");
    } else if (media >= 7.0){
        System.out.println("Bom");
    } else {
        System.out.println("Recuperacao"); 
    }
  			
	}

}
