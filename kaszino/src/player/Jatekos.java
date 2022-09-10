package player;

import table.Asztal;

abstract public class Jatekos {
	
	
	protected Asztal asztal;
	
	
	public Jatekos() {
		
	}
	
	
	public void lep() {
		System.out.println("Kor: " + asztal.getKor() + " Tet: " + asztal.getTet());
	}
	
	public void setAsztal(Asztal asztal) {
		this.asztal = asztal;	
	}
	
	abstract public String toString();
	
	public void finalize() {
		System.out.println(System.identityHashCode(this));
		System.out.println(toString());
	}
}
