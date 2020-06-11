package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de 
 * un tri�ngulo. El programa deber� informar:
 * 
   a) De cada tri�ngulo la medida de su base, su altura y su superficie.
   b) La cantidad de tri�ngulos cuya superficie es mayor a 12.
 *
 */

public class EstructuraRepetitivaFor6 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int n, base, altura, superficie, cantidad;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DOALOGO PARA ENTRADA DE DATOS E IMPRIME LOS RESULTADOS.
	public void getCreateVentana() {
		// INICILIZAMOS.
		cantidad = 0;
		
		text1 = JOptionPane.showInputDialog("Cuantos tri�ngulos procesara");
		n = Integer.parseInt(text1);
		
		// VALIDAMOS  \.
		for(int i=0; i<=n; i++) {
			text2 = JOptionPane.showInputDialog("Ingrese el valor de la base :");
			base = Integer.parseInt(text2);
			
			text3 = JOptionPane.showInputDialog("Ingrese el valor de la altura : ");
			altura = Integer.parseInt(text3);
			
			// VALIDAMOS.
			superficie = base * altura / 2;
			System.out.println("La superficie es : " +superficie);
			if(superficie > 12) {
				cantidad = cantidad + 1;
			}
					
		}
			// IMPRIMOS.
		    System.out.print("La cantidad de tri�ngulos con superficie superior a 12 son : " +cantidad);	
	}
		
}
