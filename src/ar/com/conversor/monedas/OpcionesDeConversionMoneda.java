package ar.com.conversor.monedas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionMoneda {
	
	ConversionMoneda conversion = new ConversionMoneda();
	
	public void ConvertirMoneda(double valor) {
		String opciones = JOptionPane.showInputDialog(null, "Seleccione que tipo de conversion va a hacer", "Opciones de conversion",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Peso Argentino a Dolar Estadounidense", "Peso Argentino a Euro", "Peso Argentino a Libra","Peso Argentino a Yen",
				"Peso Argentino a Won Sul-Cor", "Dolar Estadounidense a Peso Argentino","Euro a Peso Argentino", "Libra a Peso Argentino",
				"Yen a Peso Argentino", "Won Sul-Cor a Peso Argentino"},"Seleccionar").toString();
		switch (opciones) {
		case "Peso Argentino a Dolar Estadounidense":
			conversion.pARaDolar(valor);
			break;
		case "Peso Argentino a Euro":
			conversion.pARaEuro(valor);
			break;
		case  "Peso Argentino a Libra":
			conversion.pARaLibra(valor);
			break;
		case "Peso Argentino a Yen":
			conversion.pARaYen(valor);
			break;
		case "Peso Argentino a Won Sul-Cor":
			conversion.pARaWon(valor);
			break;
		case "Dolar Estadounidense a Peso Argentino":
			conversion.dolarAPAr(valor);
			break;
		case "Euro a Peso Argentino":
			conversion.euroAPAr(valor);
			break;
		case "Libra a Peso Argentino":
			conversion.libraAPAr(valor);
			break;
		case "Yen a Peso Argentino":
			conversion.yenAPAr(valor);
			break;
		case "Won Sul-Cor a Peso Argentino":
			conversion.wonAPAr(valor);
			break;
		}
	}
}
