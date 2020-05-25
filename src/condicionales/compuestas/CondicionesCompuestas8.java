package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * De un operario se conoce su sueldo y los a�os de antig�edad. Se pide confeccionar un programa que lea los datos de entrada e 
 * informe :
 * 
 *  a) Si el sueldo es inferior a 500 y su antig�edad es igual o superior a 10 a�os, otorgarle un aumento del 20 %, mostrar el sueldo 
 *  a pagar.
    b) Si el sueldo es inferior a 500 pero su antig�edad es menor a 10 a�os, otorgarle un aumento de 5 %.
    c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 *
 */

public class CondicionesCompuestas8 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int antiguedad;
	private float sueldo;
	
	
	// METODO QUE PERMITE CARGAR VALORES POR VENTANA DE DIALOGO.
	public void getVentana() {
		// VALIDAMOS.
		text1 = JOptionPane.showInputDialog("Ingrese sueldo");
		sueldo = Float.parseFloat(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese antiguedad");
		antiguedad = Integer.parseInt(text2);
	}
	
	
	/**
	 * METODO QUE PERMITE MOSTRAR EL SUELDO
	 * DE U  EMPLEADO MAS SU INCREMENTO POR ANTIGUEDAD.
	 * 
	 */
	public void getSueldoEmpleados() {
		// VALIDAMOS
		if(sueldo < 500 && antiguedad >= 10) {
			float aumento = sueldo * 0.20f;
			float sueldoTotal = sueldo + aumento;
			System.out.println("Sueldo a pagar :" +sueldoTotal);
		} else {
			if(sueldo < 500 && antiguedad < 10) {
				float aumento = sueldo * 0.5f;
				float sueldoTotal = sueldo + aumento;
				System.out.println("Sueldo a pagar :" +sueldoTotal);
			} else {
				System.out.println("Sueldo a pagar :  "+sueldo);
			}
		}
	}
	

}
