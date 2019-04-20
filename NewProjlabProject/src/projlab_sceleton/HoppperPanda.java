package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoppperPanda extends Panda {

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("Ez egy weakTile?");
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			BufferedReader br = new BufferedReader(isr);
			String answer = br.readLine();
			if (answer.equals("y")) {
				System.out.println("[hpTile is WeakTile]");
				this.tile = new WeakTile();
				this.tile.incraseCounter();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
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
