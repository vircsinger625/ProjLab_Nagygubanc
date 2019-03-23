package projlab_sceleton;

public class Animal extends Element {

	private Tile previousTile;

	public boolean collide(Orangutan o) {
		System.out.println("Animal.collide(Orangutan o) ");
		return true;
	}

	public boolean collide(Panda p) {
		System.out.println("Animal.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("Animal.reaction(InputEffect i, Tile t) ");
	}

	public void move(Direction d) {
		System.out.println("Animal.move(Direction d) ");
	}

	public void die() {
		System.out.println("Animal.die() ");
	}

	public void move(Tile t) {
		System.out.println("Animal.move(Tile t) ");
	}
}
