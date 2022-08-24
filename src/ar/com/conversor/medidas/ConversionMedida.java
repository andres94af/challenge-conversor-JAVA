package ar.com.conversor.medidas;

import javax.swing.JOptionPane;

public class ConversionMedida {

	public void metroACentimetro(double valor) {
		double medida = valor * 100;
		medida = (double)Math.round(medida *100d)/100;
		JOptionPane.showMessageDialog(null,valor+" m equivalen a: "+ medida+" cm.","valor", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void metroAKilometro(double valor) {
		double medida = valor / 1000;
		medida = (double)Math.round(medida *100d)/100;
		JOptionPane.showMessageDialog(null,valor+" m equivalen a: "+ medida+" Km.","valor", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void kilometroAMilla(double valor) {
		double medida = valor * 1609;
		medida = (double)Math.round(medida *100d)/100;
		JOptionPane.showMessageDialog(null,valor+" km equivalen a: "+ medida+ " milla.","valor", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void metroAPies(double valor) {
		double medida = valor * 3.28084;
		medida = (double)Math.round(medida *100d)/100;
		JOptionPane.showMessageDialog(null,valor+" m equivale a: "+ medida+ " pies.","valor", JOptionPane.INFORMATION_MESSAGE);
	}
}
