package player;

public class Nyuszi extends Jatekos {
	
	private String szin;
	
	public Nyuszi(String szin) {
		this.szin = szin;
	}
	
	public void lep() {
		super.lep();
		System.out.println(toString());
		if (asztal.getTet() < 50) {
			asztal.emel(5);
		}
		else {
			System.out.println("Húha");
		}
		
	}
	
	@Override
	public String toString() {
		return szin;
	}
}
