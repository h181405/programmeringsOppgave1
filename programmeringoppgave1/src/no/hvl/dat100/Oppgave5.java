package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
		int poeng;
		char karakter = 'n';
		boolean valid;
		for(int i = 0; i < 10; i++) {
			do {
				poeng = Integer.parseInt(showInputDialog("skriv inn poengsum"));
				valid = true;
				if(poeng <= 39 && poeng >= 0) {
					karakter = 'F';
				} else if(poeng <= 49 && poeng >= 40) {
					karakter = 'E';
				} else if(poeng <= 59 && poeng >= 50) {
					karakter = 'D';
				} else if(poeng <= 79 && poeng >= 60) {
					karakter = 'C';
				} else if(poeng <= 89 && poeng >= 80) {
					karakter = 'B';
				} else if(poeng <=100 && poeng >= 90) {
					karakter = 'A';
				} else {
					valid = false;
				}
				if(valid) {
					showMessageDialog(null,"Karakter: " + karakter);
				} else {
					showMessageDialog(null,"Poengsum ulovlig, vennligst skriv inn et tall fra 0 til 100!");
				}
			} while (!valid);
		}
	}

}
