package projlab_sceleton;

public class LazyPanda extends Panda {

	private boolean isResting;
	private int paralyzedCounter;

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
		this.setIsResting(true);
		this.setParalyzedCounter();
		t.remove(this);
		t.setElement(this);
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

	public void setParalyzedCounter() {
	}


	public void setIsResting(boolean b) { 
		isResting = b;
	}

	public void decraseCounter() {
	}

}
