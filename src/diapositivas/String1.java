package diapositivas;

public class String1 {
	public static void main(String[] args) {
	
	String string1 = "Hola Mundo";
	String string2 = "Hola Mundo";
	String string3 = new String ("Hola Mundo");
	String string4 = new String(new char[]{'H','o','l','a',' ','M','u','n','d','o'});
	//usamos el comparador == compara que se encuntre en al poscion de memoria
	System.out.println(string1 == string2);
	System.out.println(string1 == string3);
	System.out.println(string1 == string4);
	System.out.println(string3 == string4);
	//usamos el metodo equals compara la cadena
	System.out.println(string1.equals(string2));
	System.out.println(string1.equals(string3));
	System.out.println(string1.equals(string4));
	System.out.println(string3.equals(string4));
	//usamos el metodo compareTo te pone en entero las diferencia unicode
	System.out.println(string1.compareTo(string2));
	System.out.println(string1.compareTo(string3));
	System.out.println(string1.compareTo(string4));
	System.out.println(string3.compareTo(string4));
	System.out.println(string1.compareTo(string2.toUpperCase()));
	System.out.println(string2);//¿se convierte string2 a mayuscula?
	string2.toUpperCase(); //no es un metodo mutante
	System.out.println(string2);
	String auxiliar = string2.toUpperCase();
	System.out.println(auxiliar);
	System.out.println(string1.startsWith("Hola "));//compara desde el empieze del string
	System.out.println(string1.endsWith("Mundo ".trim()));//trim quita espacio
	//probamos los metodos length,concat y chart
	System.out.println(string1.length()); //tamosño 10, desde 0 a 9
	System.out.println(string1.concat(" ").concat(string4));
	//otra forma
	System.out.println(string1+" "+string4);
	for (int i = 0; i < string1.length(); i++) {
		System.out.print(string1.charAt(i)+" ");//recorre las posicines del String
		
	}
	System.out.println();
	for (int i = string1.length()-1; i >=0; i--) {
		System.out.print(string1.charAt(i)+" ");
		
		
	}System.out.println();
	for (int i = 0; i < string1.length(); i++) {
		if(string1.charAt(i) == ' ')
			System.out.println(string1.substring(i+1));
		}
	
	System.out.println();
	//metodos replace
	System.out.println(string1.replace('o', 'O'));//cambia las 2 o en 2 O mayusculas
	//comprobamos si el metodo replace es mutante
	System.out.println(string1);
	System.out.println(string1.replace("Hola", "Hello"));
	System.out.println(string1.replaceAll("[aeiou]", "*"));//remplazamos las vocales por asterisco
	System.out.println(string1.replaceFirst("[aeiou]", "*"));
	//probamos el metodo split
	String[] array = string1.split(" ");//sepramos espacio en blanco
	for (int i = 0; i < array.length; i++) {
		System.out.println(i+") "+array[i]);
	}
	//separamos por vocales
	array = string1.split("[aeiou]");
	for (int i = 0; i < array.length; i++) {
		System.out.println(i+") "+array[i]);
	}
	
	}
	
	
}
