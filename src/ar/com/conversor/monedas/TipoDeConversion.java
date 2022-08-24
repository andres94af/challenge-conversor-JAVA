package ar.com.conversor.monedas;

import javax.swing.JOptionPane;

public class TipoDeConversion {
	
	OpcionesDeConversion conversion = new OpcionesDeConversion();
	
	public void ConvertirMoneda(double valor) {
		String opciones = JOptionPane.showInputDialog(null, "Seleccione que tipo de conversion va a hacer", "Opciones de conversion", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Peso Argentino a Dolar Estadounidense", "Peso Argentino a Euro", "Peso Argentino a Libra", "Peso Argentino a Yen", "Peso Argentino a Won Sul-Cor"}
					,"Seleccionar").toString();
		
		switch (opciones) {
		case "Peso Argentino a Dolar Estadounidense":
			conversion.pARaDolar(valor);
			break;
		}
	}
}
