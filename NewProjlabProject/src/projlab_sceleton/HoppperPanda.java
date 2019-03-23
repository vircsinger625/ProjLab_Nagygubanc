package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoppperPanda extends Panda {

	public boolean collide(Orangutan o) {
		System.out.println("HopperPanda.collide(Orangutan o) ");
		return true;
	}

	public boolean collide(Panda p) {
		System.out.println("HopperPanda.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {// System.out.println("HopperPanda.reaction(InputEffect i, Tile t) ");
		switch (Game.usecase) {
		case 13:
			System.out.println("hp.reaction(whistleMessage, hpTile)");
			System.out.println("Ez egy weakTile?");
			InputStreamReader isr = new InputStreamReader(System.in);
			try {
				BufferedReader br = new BufferedReader(isr);
				String answer = br.readLine();
				if (answer.equals("y")) {
					System.out.println("hpTile Is WeakTile");
					this.tile = new WeakTile();
					this.tile.incraseCounter();

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void move(Direction d) {
		System.out.println("HopperPanda.move(Direction d) ");
	}

	public void die() {
		System.out.println("HopperPanda.die() ");
	}

	public void move(Tile t) {
		System.out.println("HopperPanda.move(Tile t) ");
	}

	public void step() {
		System.out.println("HopperPanda.step() ");
	}

	public Tile getTile() {// System.out.println("HopperPanda.getTile() ");
		return this.tile;
	}

}
