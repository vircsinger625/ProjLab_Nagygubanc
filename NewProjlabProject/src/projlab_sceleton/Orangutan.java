package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Orangutan extends Animal implements Steppable {

	private boolean hasCapturedPanda;
	public List<Panda> capturedPandas = new ArrayList<Panda>(); /* T�MB */

	public boolean collide(Orangutan o) {
		System.out.println("Orangutan.collide(Orangutan o) ");
		return true;
	}

	public boolean collide(Panda p) {
		System.out.println("Orangutan.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("Orangutan.reaction(InputEffect i, Tile t) ");
	}

	public void move(Direction d) {
		System.out.println("Orangutan.move(Direction d) ");
	}

	public void die() {
		System.out.println("Orangutan.die() ");
	}

	public void move(Tile t) {
		// System.out.println("Orangutan.move(Tile t) ");
		/* 5.3.9 OrangutanCollideWithThing */
		/* 5.3.10 OrangutanExit */
		// t.stepIn(this); //a Tile-ban vizsg�ljuk, hogy oda tud e l�pni az or�ngut�n.
		switch (Game.usecase) {
		case 1:
			System.out.println("o.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			break;
		case 2:
			System.out.println("o.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			t.incraseCounter();

			System.out.println("Elt�rik a csempe?");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String answer;
			try {
				answer = br.readLine();
				if (answer.equals("y")) {
					this.die();
					break;
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("o.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			this.die();
			break;
		case 4:
			System.out.println("o.move(tile)");
			break;
		case 8:
			System.out.println("Orangutan.move(Tile t) ");
			t.stepIn(this); // a Tile-ban vizsg�ljuk, hogy oda tud e l�pni az or�ngut�n.
			break;

		case 9:/* 5.3.9 OrangutanCollideWithThing */
			System.out.println("Orangutan.move(Tile t) ");
			t.stepIn(this); // a Tile-ban vizsg�ljuk, hogy oda tud e l�pni az or�ngut�n.
			break;

		case 10:/* 5.3.10 OrangutanExit */
			System.out.println("Orangutan.move(Tile t) ");
			Tile temp2 = new Tile();
			temp2 = this.getTile();
			this.getTile().remove(this);
			Tile entranceTile = new Tile();
			entranceTile.setElement(this);
			Tile temp = new Tile();
			temp = capturedPandas.get(0).getTile();
			capturedPandas.get(0).move(temp2);
			temp2 = capturedPandas.get(1).getTile();
			capturedPandas.get(1).move(temp);
			temp = capturedPandas.get(2).getTile();
			capturedPandas.get(2).move(temp2);
			// t.stepIn(this); // a Tile-ban vizsg�ljuk, hogy oda tud e l�pni az or�ngut�n.

			break;

		default:
			break;
		}
	}

	public void step() {
		System.out.println("Orangutan.step() ");
	}

	public void addCapturedPandas(Panda p) {

		switch (Game.usecase) {
		case 8:
			System.out.println("o.addCapturedPandas(p)");
			capturedPandas.add(p);
			break;
		case 10:
			// System.out.println("Orangutan.addCapturedPandas(Panda p) ");
			capturedPandas.add(p); // panda az or�ngut�n ker�lt a sorba
			break;
		default:
			break;
		}
	}

	public void removeCapturedPandas(Panda p) {/* System.out.println("Orangutan.removeCapturedPandas(Panda p) "); */
		switch (Game.usecase) {
		case 7:
			System.out.println("o.removeCapturedPandas(p)");
			break;

		case 10:
			System.out.println("o.removeCapturedPandas(p)");
			capturedPandas.remove(p);
			break;
		case 11:
			System.out.println("o.removeCapturedPandas(sp)");
			break;
		default:
			break;
		}
		return;
	}

}
