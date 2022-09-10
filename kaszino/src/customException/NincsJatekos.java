package customException;

public class NincsJatekos extends Exception {
	

	private static final long serialVersionUID = 1L;

	public NincsJatekos(String hiba) {
		super(hiba);
	}
}
