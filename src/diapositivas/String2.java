package diapositivas;

import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		String linea = sc.nextLine();
		System.out.println("La frase tiene algun numero: "+linea.matches(".*[0-9]+.*"));
		String[] array = linea.split(" ");
		int numeros = 0 ;
		for (int i = 0; i < array.length; i++) {
			if(array[i].matches(".*[0-9]+.*"))
			numeros++;
			
		}System.out.println("Cuantas palabras tiene numeros: "+numeros);
		int digitos = 0;
		for (int i = 0; i < linea.length(); i++) {
			if(Character.isDigit(linea.charAt(i)))
			digitos++;
		}System.out.println("Cuantos numeros hay en esa frase: "+digitos);
		
		int palabras = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].matches("^[aeiouAEIOU].*"))
			palabras++;	
		}System.out.println("Palabras que empiezan vocales: "+palabras);
		sc.close();
	}		
}
