package projlab_sceleton;

public class WeakTile extends Tile {

	private int stepInCounter;

	public boolean stepIn(Animal a) {
		System.out.println("WeakTile.stepIn(Animal a) ");
		return true;
	}

	public void incraseCounter() {
		System.out.println("WeakTile.incraseCounter() ");
		stepInCounter++;
	}

}
