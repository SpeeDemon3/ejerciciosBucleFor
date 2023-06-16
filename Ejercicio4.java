package ejerciciosBucleFor;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio4 {

	/*
	 * EJERCICIO 4
	 * Escribir el factorial del numero 15
	 */
	
	public static void main(String[] args) {

		int factorial= 1;
		
		for (int i = 15; i > 0; i--) {
			
			factorial *= i;
			
		}
		
		System.out.println(factorial);

		
	}

}
