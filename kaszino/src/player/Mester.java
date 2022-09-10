package player;

public class Mester extends Jatekos {
	
	private int fokozat;
	
	public Mester(int fokozat) {
		this.fokozat = fokozat;
	}
	
	public void lep() {
		super.lep();
		System.out.println(toString());
		asztal.emel(asztal.getTet() * (fokozat / 100));
	}
	
	@Override
	public String toString() {
		return "Mester" + fokozat;
	}
	
}
