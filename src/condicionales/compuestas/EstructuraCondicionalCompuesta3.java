package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar un mensaje indicando si el n�mero tiene uno o
 *  dos d�gitos. (Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)
 *
 */


public class EstructuraCondicionalCompuesta3 {
	// PROPIEDADES DE LA CLASE.
	private String num;
	private int num1;
	
	
	// METODO QUE PERMITE INGRESAR Y MOSTRAR VALORES POR VENTANA DE DIALOGO.
	public void getOperacion() {
		// VALIDAMOS VENTANA DE DIALOGO.
		num = JOptionPane.showInputDialog("Ingrese un numero de uno o dos digitos");
		num1 = Integer.parseInt(num);
		
		// VALIDAMOS.
		if(num1 < 10) {
			System.out.println("Tiene un digito");
		} else {
			System.out.println("Tiene dos digito");
		}
	}

}
