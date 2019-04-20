package projlab_sceleton;

public class SlotMachine extends Element implements Steppable {

	private int jingleCounter;

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

	public void incraseJingleCounter() {
	}

}
