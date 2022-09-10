package table;

import java.util.ArrayList;
import java.util.Random;

import customException.NincsJatekos;
import player.Jatekos;

public class Asztal {
	
	
	private ArrayList<Jatekos> arr;
	private double tet;
	private int kor;
	private double goal;
	
	
	
	
	public Asztal() {
		
		this.arr = new ArrayList<Jatekos>();
	}
	
	
	
	public void ujJatek() {
		Random random = new Random();
		this.tet = 0;
		this.kor = 0;
		this.goal = random.nextDouble() * 100;
	}
	
	public void addJatekos(Jatekos jatekos) {
		if (arr.size() > 10) {
			System.out.println("Az asztal tele van!");
		}
		else {
			arr.add(jatekos);
			jatekos.setAsztal(this);
		}
	}
	
	
	public int getKor() {
		return kor;
	}
	
	public void emel(double tet) {
		this.tet += tet;
	}
	
	public void kor() {
		try {
			if (arr.size() == 0) {
				throw new NincsJatekos("Az asztalnal  ul senki.");
			}
		} catch(NincsJatekos nj) {
			System.out.println("Az asztalnal nem ul senki!");
		}
		
		if (this.tet > this.goal) {
			System.out.println("jatek vege");
		}
		else {
			this.kor += 1;
			System.out.println("Jelenlegi tet: " + this.tet);
		}
	}
	
	public double getTet() {
		return tet;
	}
}
