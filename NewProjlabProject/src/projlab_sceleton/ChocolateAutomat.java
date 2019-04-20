package projlab_sceleton;

public class ChocolateAutomat extends Element implements Steppable {

	private int whistleCounter;

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void step() {
	}

	public void incraseWhistleCounter() {
	}

}
