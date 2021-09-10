package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {
	
	public static void main(String[] args) {
		
		String nTxt = showInputDialog("Skriv inn et helt tall fra 1-12");
		int n = parseInt(nTxt);
		
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		} 
		
		showMessageDialog(null, n + "! = " + sum);

	}		
}		