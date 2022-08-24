package ar.com.conversor.ejecutable;

import javax.swing.JOptionPane;

public class Respuesta {
	
	public boolean rtaFin() {
		int rta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?", "OPCIONES si o no", JOptionPane.YES_NO_OPTION);
		if(JOptionPane.OK_OPTION == rta){
			return true;
		}else {
			JOptionPane.showMessageDialog(null,"El programa finalizo!", "Finalizar", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
	}
}
