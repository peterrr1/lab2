package player;



public class Robot extends Jatekos {
	
	private int id;
	private static int objectCount = 0;
	
	
	public Robot() {
		
		objectCount++;
		this.id = objectCount;
	}
	
	public void lep() {
		super.lep();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Robot"+this.id;
	}
}
