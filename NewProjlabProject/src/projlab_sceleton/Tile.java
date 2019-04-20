package projlab_sceleton;

public class Tile {

	private int numberOfSides;
	private Element element;

	public void setElement(Element e) {
	}

	public boolean stepIn(Animal a) {
		if (this.getElement() == null) { // Ha nincs rajta semmi, akkor sim�n bele tud l�pni
			this.setElement(a);
			return true;
		}
		else {
			this.getElement().collide((Orangutan) a);
		}
		return false;
	}

	public void remove(Element e) {
	}

	public void incraseCounter() {
	}

	public Element getElement() {
		return element;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
}
