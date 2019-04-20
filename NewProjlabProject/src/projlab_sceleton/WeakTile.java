package projlab_sceleton;

public class WeakTile extends Tile {

	private int stepInCounter = 0;

	public boolean stepIn(Animal a) {
		return true;
	}

	public void incraseCounter() {
		stepInCounter++;
	}

	public int getStepInCounter() {
		return stepInCounter;
	}

	public void setStepInCounter(int count) {
		stepInCounter = count;
	}
	
	public void setElement(Element e) {
		element = e;
		incraseCounter();
		if(stepInCounter >20) {
			element.die();
		}
	}

}
