package projlab_sceleton;

public class WeakTile extends Tile {

	private int stepInCounter = 0;

	public boolean stepIn(Animal a) {
		return true;
	}
	
	public boolean stepIn(Orangutan o) {
		if (element == null) {
			return true;
		}else {
			return element.collide(o);
		}
	}
	
	public boolean stepIn(Panda p) {
		if (element == null) {
			return true;
		}else {
			return element.collide(p);
		}
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
		e.setTile(this);
		incraseCounter();
		if(stepInCounter >20) {
			element.die();
		}
	}

}
