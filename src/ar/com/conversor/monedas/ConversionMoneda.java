package ar.com.conversor.monedas;

import javax.swing.JOptionPane;

public class ConversionMoneda {

	public void pARaDolar(double valor) {
		double cotizacion = valor * 0.00730499;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"$"+valor+" equivalen a: U$D"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void pARaEuro(double valor) {
		double cotizacion = valor * 0.0073590735;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"$"+valor+" equivalen a: €"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void pARaLibra(double valor) {
		double cotizacion = valor * 0.0062016523;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"$"+valor+" equivalen a: £"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void pARaYen(double valor) {
		double cotizacion = valor * 1.0002996 ;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"$"+valor+" equivalen a: ¥"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void pARaWon(double valor) {
		double cotizacion = valor * 9.788061;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"$"+valor+" equivalen a: ₩"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void dolarAPAr(double valor) {
		double cotizacion = valor * 137.15335;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"U$D"+valor+" equivalen a: $"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void euroAPAr(double valor) {
		double cotizacion = valor * 136.04444;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"€"+valor+" equivalen a: $"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void libraAPAr(double valor) {
		double cotizacion = valor * 161.42513;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"£"+valor+" equivalen a: $"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void yenAPAr(double valor) {
		double cotizacion = valor * 1.0003142;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"¥"+valor+" equivalen a: $"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
	
	public void wonAPAr(double valor) {
		double cotizacion = valor * 0.10217064;
		cotizacion = (double)Math.round(cotizacion *100d)/100;
		JOptionPane.showMessageDialog(null,"₩"+valor+" equivalen a: $"+cotizacion, "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);
	}//ok
}
