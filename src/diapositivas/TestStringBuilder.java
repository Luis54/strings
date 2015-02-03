package diapositivas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStringBuilder {

	public static void main(String[] args) {
		//crear un stringbuilder a partir de string que leemos por Scanner
		//leemos hasta que introduzcamos quit
		Scanner in = new Scanner(System.in);
		StringBuilder sBuilder = new StringBuilder();
		//leer desde un scanner , primero crear una variable
		//que coja los datos,en este caso son de tipo String
		String aux= null;
		//en un bucle while(true) leer desde el Scanner
		System.out.println("Introduce las palabras, quit para salir:");
		while(true){
			aux = in.next();
			if(aux.equalsIgnoreCase("quit")) break ;
			if(Auxiliar.requisitos(aux)) sBuilder.append(aux+" ");
			//añadimos al stringbuilder aqui para no añadir quit
			
			
	
		}
		in.close();
		System.out.println("Cerrado el Scanner");
		System.out.println("Contenido StringBuilder: \n"+sBuilder);
		//le damos la vuelta al stringbuilder
		sBuilder.reverse(); //¿Es mutante el metodo
		System.out.println("Contenido StringBuilder: \n"+sBuilder);
		//es mutante, pero tengo el problema de un espacio en blanco inicial
		//buscamos metodo que lo elimine
		if(sBuilder.length()>0)sBuilder.deleteCharAt(0);
		System.out.println("Contenido StringBuilder: \n"+sBuilder);
		//convertimos el string builder a string
		String string = sBuilder.toString();
		//guardamos en un array de String usamos el delimitador
		String [] array = string.split(" ");
		//comprobamos el contenido del array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		//hay que convertir a arraylist
		List<String> lista1 = new ArrayList<String>();  
		for (int i = 0; i < array.length; i++) {
			lista1.add(array[i]);
			
		}
		//vemos su valor
		System.out.println(lista1);
		//existe un metodo que convierte los arrays en lista
		List<String> lista2 = Arrays.asList(array);
		System.out.println(lista2);

		
	}

	

}
