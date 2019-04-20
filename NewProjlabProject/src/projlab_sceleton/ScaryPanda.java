package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScaryPanda extends Panda {

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

	public Tile getTile() {
		return this.tile;
	}

}
