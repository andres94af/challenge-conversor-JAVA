package ar.com.conversor.monedas;

import javax.swing.*;

public class EjecucionDePrograma {
	
	public static void main(String[] args) {
		
		TipoDeConversion conversion = new TipoDeConversion();
		
		while(true){
			String opciones = JOptionPane.showInputDialog(null, "Seleccione que desea convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Convertir monedas", "Convertir medidas"},"Seleccionar").toString();
			
			switch (opciones) {
			case "Convertir monedas":
				double numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a convertir"));
				conversion.ConvertirMoneda(numero);
				int rta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?", "OPCIONES si o no", JOptionPane.YES_NO_OPTION);
				if(JOptionPane.OK_OPTION == rta)
				{}else {
					JOptionPane.showMessageDialog(null,"El programa finalizo!", "Finalizar", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				break;
//			case "Convertir medidas":
//				System.out.println("selecciono medidas");
//				break;
			}
		}
	}

}
