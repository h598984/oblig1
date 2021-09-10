package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {
	
	public static void main(String[] args) {
		
		int antall = 10;
		
		for (int i = 1; i <= antall; i++) {
			String poengTxt = showInputDialog("Skriv inn poengsum i hele tall, 0-100");
			int poeng = parseInt(poengTxt);
			
			
			int a = 100;
			int b = 89; 
			int c = 79; 
			int d = 59; 
			int e = 49; 
			int f = 39; 
			int under = 0; 
			
			String resultat;
					
			if (poeng > b && poeng <= a) {
				resultat = "A";
			} else if (poeng > c && poeng <= b) {
				resultat = "B";			
			} else if (poeng > d && poeng <= c) {
				resultat = "C";
			} else if (poeng > e && poeng <= d) {
				resultat = "D";
			} else if (poeng > f && poeng <= e) {
				resultat = "E";
			} else if (poeng >= under && poeng <= f) {
				resultat = "F";
			} else { 
				resultat = "Feil. Skriv inn tall på nytt, må være et helt tall fra og med 0, til og med 100";
				antall++;
			}
			
			showMessageDialog(null, resultat);
		
		}
	}
}