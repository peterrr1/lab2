package main;


import player.Human;
import player.Kezdo;
import player.Mester;
import player.Nyuszi;
import player.Robot;
import table.Asztal;

public class Main {

	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		Human h = new Human();

		Asztal a = new Asztal();

		a.addJatekos(r1);
		a.addJatekos(h);

		
		a.ujJatek();
		
		
		r1.lep();
		h.lep();
		a.kor();
		
		a = null;
		h = null;
		r1 = null;
		
		System.gc();
		
	}

}
