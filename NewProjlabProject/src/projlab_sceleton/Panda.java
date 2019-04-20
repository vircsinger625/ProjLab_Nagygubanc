package projlab_sceleton;

import java.awt.image.TileObserver;

public class Panda extends Animal implements Steppable {

	private boolean isCaptured;

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void move(int x, int y) {
	}

	public void die() {
	}

	public void move(Tile t) {
	}

	public void step() {
	}

	public void setIsCaptured(boolean b) {
	}

}
