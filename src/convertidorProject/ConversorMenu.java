package convertidorProject;

import javax.swing.JOptionPane;

public class ConversorMenu {
	
	public void mostrarMenu() {
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión:", "Menú",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {
						"Conversor de Moneda",
	                    "Conversor de Temperatura"
				},"Conversor de Moneda")).toString();		
		        
	}

}
