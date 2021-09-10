package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {
	
	private static int bruttolonn;
		
	public static void main(String[] args) {
		
		int trinn1 = 164100;
		int trinn2 = 260100;
		int trinn3 = 651250;
		int trinn4 = 1021550;
		
		double prosent1 = 1.7;
		double prosent2 = 4.0;
		double prosent3 = 13.2;
		double prosent4 = 16.2;

		String bruttolonnTxt = showInputDialog("Skriv inn bruttoinntekt i hele kroner: ");
		bruttolonn = Integer.parseInt(bruttolonnTxt);	
		
		String skatt = 0 + " %, som utgjør kr " + 0;
		
		if (bruttolonn > trinn1 && bruttolonn <= trinn2) {
			skatt = bruttolonn + " kr. Gir trinnskatt " + prosent1 + " %, som utgjør kr " + avrund(prosent1) + " kr";
		} else if (bruttolonn > trinn2 && bruttolonn <= trinn3) {
			skatt = bruttolonn + " kr. Gir trinnskatt " + prosent2 + " %, som utgjør kr " + avrund(prosent2) + " kr";
		} else if (bruttolonn > trinn3 && bruttolonn <= trinn4) {
			skatt = bruttolonn + " kr. Gir trinnskatt " + prosent3 + " %, som utgjør kr " + avrund(prosent3) + " kr";
		} else if (bruttolonn > trinn4) {
			skatt = bruttolonn + " kr. Gir trinnskatt " + prosent4 + " %, som utgjør kr " + avrund(prosent4) + " kr";
		} 
		
		showMessageDialog(null, skatt);	
		
		}
	
	private static double avrund(double p) {
		double hel = (int) p * bruttolonn + 0.5;
		return (int) hel / 100.0;
	}

}