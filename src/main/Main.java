package main;

import java.util.Scanner;

public class Main {

	/*
	 * Pide un carácter y una cadena al usuario.
	 * Mediante el método veces() devuelve cuantas veces aparece este carácter en la cadena.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("* Escribe una cadena:");
		String cadena = in.nextLine();
		System.out.println("* Escribe el carácter del que quieras buscar la cantidad dentro de la cadena:");
		char c = in.next().charAt(0);
		System.out.println("-> El carácter '" + c + "' aparece " + veces(c, cadena) + " veces.");
	}
	
	/*
	 * veces(char, String) -> int
	 * 
	 * Retorna cuantas veces aparece el carácter en la cadena pasados por argumentos
	 */
	static int veces(char c, String cadena) {
		int cs = 0, lastPos = cadena.indexOf(c);
		
		while (lastPos != -1) {
			lastPos = cadena.indexOf(c, lastPos+1);
			cs++;
		}
		
		return cs;
	}

}
