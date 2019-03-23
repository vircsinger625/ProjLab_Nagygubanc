package projlab_sceleton;

public class WeakTile extends Tile {

	private int stepInCounter;

	public boolean stepIn(Animal a) {
		System.out.println("WeakTile.stepIn(Animal a) ");
		return true;
	}

	public void incraseCounter() {// System.out.println("WeakTile.incraseCounter() ");

		switch (Game.usecase) {

		case 13:
			stepInCounter++;
			System.out.println("hpTile.increaseCounter()");
		default:
			break;
		}

	}

	public int getStepInCounter() {
		return stepInCounter;
	}

	public void setStepInCounter(int count) {
		stepInCounter = count;
	}

}
