package ar.com.conversor.medidas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionMedida {
	
	ConversionMedida conversion = new ConversionMedida();
	
	public void ConvertirMedida(double valor) {
		String opciones = JOptionPane.showInputDialog(null, "Seleccione el factor de conversion", "Opciones de conversion",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Metro a Centimetro", "Metro a Kilometro", "Kilometro a Milla", "Metro a Pies"},"Seleccionar").toString();
		switch (opciones) {
		case "Metro a Centimetro":
			conversion.metroACentimetro(valor);
			break;
		case "Metro a Kilometro":
			conversion.metroAKilometro(valor);
			break;
		case "Kilometro a Milla":
			conversion.kilometroAMilla(valor);
			break;
		case  "Metro a Pies":
			conversion.metroAPies(valor);
			break;
		}
	}
}
