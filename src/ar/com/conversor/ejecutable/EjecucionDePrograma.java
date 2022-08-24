package ar.com.conversor.ejecutable;

import javax.swing.*;

import ar.com.conversor.medidas.OpcionesDeConversionMedida;
import ar.com.conversor.monedas.OpcionesDeConversionMoneda;

public class EjecucionDePrograma {
	
	public static void main(String[] args) {
		
		Respuesta rta = new Respuesta();
		boolean respuesta = true;
		
		while(respuesta){
			String opciones = JOptionPane.showInputDialog(null, "Seleccione que desea convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Convertir monedas", "Convertir medidas"},"Seleccionar").toString();
			double valor = 0;
			
			try {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
				switch (opciones) {
				case "Convertir monedas":
					OpcionesDeConversionMoneda convMoneda = new OpcionesDeConversionMoneda();
					convMoneda.ConvertirMoneda(valor);
					break;
				case "Convertir medidas":
					OpcionesDeConversionMedida convMedida = new OpcionesDeConversionMedida();
					convMedida.ConvertirMedida(valor);
					break;
				}
			}catch(NumberFormatException err) {
				JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros","Error", JOptionPane.ERROR_MESSAGE);
			}
			
			respuesta = rta.rtaFin();
		}
	}

}
