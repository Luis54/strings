package diapositivas;

public class Auxiliar {
	boolean mayusculas = false;
	boolean minusculas = false;
	boolean digito = false;
	boolean condicion = true;
	public boolean requisitos(String aux){
	for (int i = 0; i < aux.length(); i++) {
		char palabra = aux.charAt(i);
		if(Character.isUpperCase(palabra)) mayusculas = true;
		if(Character.isLowerCase(palabra)) minusculas = true;
		if(Character.isDigit(palabra)) digito = true;
		
	}
	condicion = mayusculas && minusculas && digito;	
		return condicion;
	}
 }
	
