package player;

public class Kezdo extends Jatekos {
	
	private String nev;
	
	public Kezdo(String nev) {
		this.nev = nev;
	}
	
	public void lep() {
		super.lep();
		System.out.println("Nev: " + toString());
		if (asztal.getKor() % 2 == 0) {
			asztal.emel(1);
		}
	}
	
	@Override
	public String toString() {
		return nev;
	}
}
