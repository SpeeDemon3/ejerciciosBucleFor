package ejerciciosBucleFor;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio7 {

	/*
	 * EJERCICIO 7
	 * Hallar todas las tablas de multiplicar con for anidados
	 */
	
	public static void main(String[] args) {

		int num = 100;
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num; j++) {
				
				int result = i * j;
				
				System.out.println(i + " * " + j + " = " +result);
				
			}
			
		}
		
	}

}
