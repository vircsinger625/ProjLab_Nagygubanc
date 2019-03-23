package projlab_sceleton;

public class LazyPanda extends Panda {

	private boolean isResting;
	private int paralyzedCounter;

	public boolean collide(Orangutan o) {
		System.out.println("LazyPanda.collide(Orangutan o) ");
		return true;
	}

	public boolean collide(Panda p) {
		System.out.println("LazyPanda.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {

		switch (Game.usecase) {
		case 12:
			System.out.println("lp.reaction(sleepMessage, acTile)");
			this.setIsResting(true);
			this.setParalyzedCounter();
			t.remove(this);
			t.setElement(this);
			//this.die();   Eszter valamiért megölte a fotelben alvó pandát :D
			break;

		default:

			break;
		}

		// System.out.println("LazyPanda.reaction(InputEffect i, Tile t) ");
	}

	public void move(Direction d) {
		System.out.println("LazyPanda.move(Direction d) ");
	}

	public void die() {
		System.out.println("LazyPanda.die() ");
	}

	public void move(Tile t) {
		System.out.println("LazyPanda.move(Tile t) ");
	}

	public void step() {
		System.out.println("LazyPanda.step() ");
	}

	public Tile getTile() {// System.out.println("LazyPanda.getTile() ");
		return this.tile;
	}

	public void setParalyzedCounter() {// System.out.println("LazyPanda.setParalyzedCounter() ");
		switch (Game.usecase) {
		case 12:
			System.out.println("lp.setParalyzedCounter()");
			break;

		default:
			break;
		}

	}

	public void setIsResting(boolean b) { // System.out.println("LazyPanda.setIsResting(boolean b) ");
		isResting = b;
		switch (Game.usecase) {
		case 12:
			System.out.println("lp.setIsResting(true)");
		}
	}

	public void decraseCounter() {
		System.out.println("LazyPanda.decraseCounter() ");
	}

}
