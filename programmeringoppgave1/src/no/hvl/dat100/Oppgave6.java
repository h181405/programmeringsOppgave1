package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {
	
	public static void main(String[] arg) {
	
		int n = Integer.parseInt(showInputDialog("skriv in et tall"));
		int answer = 1;
		
		for(;n>1;n--) {
			
			answer *= n;
			
		}
		
		showMessageDialog(null, "The answer is " + answer);
	}
}
