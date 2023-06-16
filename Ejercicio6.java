package ejerciciosBucleFor;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio6 {

	/*
	 * EJERCICIO 6
	 * Hallar los números impares menores de 30 y que aparezcan en orden descendente
	 */
	
	public static void main(String[] args) {
		// Utilizo un bucle for para recorrer el bucle de forma descendente empezando desde el final
		for (int i = 30; i > 0; i--) {
			// Si modulo 2 no es igual a 0
			if (i % 2 != 0) {
				// Imprimo el valor de los impares
				System.out.println(i);
			}
			
		}
		
	}

}
