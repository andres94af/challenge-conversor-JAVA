package ar.com.conversor.medidas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionMedida {
	
	ConversionMedida conversion = new ConversionMedida();
	
	public void ConvertirMedida(double valor) {
		String opciones = JOptionPane.showInputDialog(null, "Seleccione que tipo de conversion va a hacer", "Opciones de conversion",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Metro -> Milla"},"Seleccionar").toString();
		switch (opciones) {
		case "Metro -> Milla":
			conversion.metroAMilla(valor);
			break;
		}
	}
}
