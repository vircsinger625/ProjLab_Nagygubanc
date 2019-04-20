package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Orangutan extends Animal implements Steppable {

	private boolean hasCapturedPanda;
	public List<Panda> capturedPandas = new ArrayList<Panda>(); 

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void move(int x, int y) {
		
		Tile t = new Tile();
		boolean canStepIn = t.stepIn(this);
		if (canStepIn) {
			this.tile.remove(this);
			t.setElement(this);
			
			/*if (hasCapturedPandas) {
				
			}*/
		}
	}

	public void die() {
	}

	public void move(Tile t) {
		
		boolean canStepIn = t.stepIn(this);
		if (canStepIn) {
			this.tile.remove(this);
			t.setElement(this);
			
			/*if (hasCapturedPandas) {
				
			}*/
		}
		
	}

	public void step() {
	}

	public void addCapturedPandas(Panda p) {
		capturedPandas.add(p);
	}

	public void removeCapturedPandas(Panda p) {
		capturedPandas.remove(p);
	}

	public boolean isHasCapturedPanda() {
		return hasCapturedPanda;
	}

	public void setHasCapturedPanda(boolean hasCapturedPanda) {
		this.hasCapturedPanda = hasCapturedPanda;
	}

}
