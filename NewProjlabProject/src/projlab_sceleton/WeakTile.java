package projlab_sceleton;

public class WeakTile extends Tile {

	private int stepInCounter;

	public boolean stepIn(Animal a) {
		return true;
	}

	public void incraseCounter() {
	}

	public int getStepInCounter() {
		return stepInCounter;
	}

	public void setStepInCounter(int count) {
		stepInCounter = count;
	}

}
