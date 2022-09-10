package player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Human extends Jatekos {
	public Human() {
		
	}
	
	public void lep() {
		super.lep();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double input = 0;
		try {
			input = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		asztal.emel(input);
	}

	@Override
	public String toString() {
		return null;
	}
}
