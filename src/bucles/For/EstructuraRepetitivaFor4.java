package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que lea 10 n�meros enteros y luego muestre cu�ntos valores ingresados fueron m�ltiplos de 3
 *  y cu�ntos de 5. Debemos tener en cuenta que hay n�meros que son m�ltiplos de 3 y de 5 a la vez.
 *
 */

public class EstructuraRepetitivaFor4 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int valor, miltiplo3, multiplo5;
	
	
	
	// METODO QUE PERMITE CARGAR VENTANA DE DIALOGO E IMPRIMIR LOS VALORES.
	public void getCreateAll() {
		// INICLIZAMOS.
		miltiplo3 = 0;
		multiplo5 = 0;
		
		// VALIDAMOS.
		for(int i=1; i<=5; i++) {
			text1 = JOptionPane.showInputDialog("Ingrese valor");
			valor = Integer.parseInt(text1);
			// VALIDAMOS.
			if(valor%3 == 0) {
				miltiplo3++;
			} 
				if(valor%5 == 0) {
					multiplo5++;
				}
			
			
			// IMPRIMIMOS
			System.out.println("Cantidad de valores ingresados m�ltiplos de 3 : " +miltiplo3);
		    System.out.println("Cantidad de valores ingresados m�ltiplos de 5 : " +multiplo5);
		  
		}
		
		
	}
	
	

}
