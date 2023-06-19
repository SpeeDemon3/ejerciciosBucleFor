package ejerciciosBucleFor;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio8 {

	/*
	 * EJERCICIO 8
	 * 
	 * Con los 20 primeros números decir con cada uno por cual es divisible: ejemplo: 1 –> es divisible por 1
	 * 2 –> es divisible por 1 es divisible por 2 …
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Utilizando 2 bucles for anidados voy obteniendo los numeros a dividir
		for (int i = 0; i <= 20; i++) {
			
			for (int j = 1; j <= 20; j++) {
				// Si el valor de i dividido entre el valor de j deja como resto 0
				if (i % j == 0) {
					// Imprimo por consola
					System.out.println(i + " es divisible por " + j);
				} 
				
			}
			
		}
		
	}
}
