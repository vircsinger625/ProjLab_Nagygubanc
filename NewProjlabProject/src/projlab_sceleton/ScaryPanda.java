package projlab_sceleton;

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
		System.out.println("ScaryPanda.reaction(InputEffect i, Tile t) ");
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
