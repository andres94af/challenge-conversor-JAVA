package ar.com.conversor.medidas;

import javax.swing.JOptionPane;

public class ConversionMedida {

	public void metroAMilla(double valor) {
		double cotizacion = valor * 0.00730499;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"$"+valor+" equivalen a: U$D"+cotizacion, "Valor convertido", JOptionPane.INFORMATION_MESSAGE);
	}
}