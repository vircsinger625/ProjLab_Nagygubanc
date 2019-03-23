package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScaryPanda extends Panda {

	public boolean collide(Orangutan o) {
		System.out.println("ScaryPanda.collide(Orangutan o) ");
		return true;
	}

	public boolean collide(Panda p) {
		System.out.println("ScaryPanda.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {

		switch (Game.usecase) {

		case 11:
			System.out.println("sp.reaction(jingleMessage, smTile)");

			System.out.println("Ez egy capturedPanda?");
			InputStreamReader isr = new InputStreamReader(System.in);
			try {
				BufferedReader br = new BufferedReader(isr);
				String answer = br.readLine();
				if (answer.equals("y")) {

					System.out.println("[sp.isCaptured is true]");
					Game.floor.getOrangutan().removeCapturedPandas(this);

				}

			} catch (IOException e) {
				e.printStackTrace();
			}

			/*
			 * 
			 * isCaptured = true; if(isCaptured == true) {
			 * System.out.println("sp.isCaptured = true)");
			 * Game.floor.getOrangutan().removeCapturedPandas(this); }
			 */
			break;

		default:
			break;
		}

		// System.out.println("ScaryPanda.reaction(InputEffect i, Tile t) ");
	}

	public void move(Direction d) {
		System.out.println("ScaryPanda.move(Direction d) ");
	}

	public void die() {
		System.out.println("ScaryPanda.die() ");
	}

	public void move(Tile t) {
		System.out.println("ScaryPanda.move(Tile t) ");
	}

	public void step() {
		System.out.println("ScaryPanda.step() ");
	}

	public Tile getTile() {// System.out.println("ScaryPanda.getTile() ");
		return this.tile;
	}

}
