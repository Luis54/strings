package diapositivas;

public class Auxiliar {
	public static boolean requisitos(String s){
		//boolean aux = false;
		return minimoLongitudOcho(s) && letraMayuscula(s) && letraMinuscula(s) 
				&& tieneDigito(s) && tieneDigitoOLetra(s);
		
		//return aux;	
	}
	private static boolean minimoLongitudOcho(String s){
		return s.length() >= 7 ;
	}
	
	private static boolean letraMayuscula(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
		if (Character.isUpperCase(s.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;	
}
	private static boolean letraMinuscula(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
		if (Character.isLowerCase(s.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;
}
	private static boolean tieneDigito(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
		if (Character.isDigit(s.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;
}
	private static boolean tieneDigitoOLetra(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
		if (!Character.isLetterOrDigit(s.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;
}
}	
	/*boolean mayusculas = false;
	boolean minusculas = false;
	boolean digito = false;
	boolean condicion = true;
	for (int i = 0; i < aux.length(); i++) {
		char palabra = aux.charAt(i);
		if(Character.isUpperCase(palabra)) mayusculas = true;
		if(Character.isLowerCase(palabra)) minusculas = true;
		if(Character.isDigit(palabra)) digito = true;
		
	}
	condicion = mayusculas && minusculas && digito;	
		return condicion;
	}*/
 
	
