package ejerciciosBucleFor;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio9 {

	/*
	 * EJERCICIO 9
	 * 
	 * Hallar la lista de los números primos hasta el 100
	 */
	
	public static void main(String[] args) {
		// Con un bucle fo recorro los numeros del 1 al 100
		for (int i = 1; i <= 100; i++) {
			
				// Si el valor de i modulo 0 es igual a 0 Y el valor i modulo i es igual a 0  
				if (i % 1 == 0 && i % i == 0) {
					// Imprimo el valor de i
					System.out.println(i);
					
			}
			
		}
		
	}

}
