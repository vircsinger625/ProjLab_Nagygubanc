package projlab_sceleton;

public class Tile {

	private int numberOfSides;
	private Element element;

	public void setElement(Element e) {
		switch (Game.usecase) {
		case 1:
			System.out.println("nextTile.setElement(o)");
			break;
		case 2:
			System.out.println("nextTile.setElement(o)");
			break;
		case 3:
			System.out.println("nextTile.setElement(o)");
			break;
		case 6:
			System.out.println("nextTile.setElement(p)");
			break;
		case 7:
			System.out.println("nextTile.setElement(p)");
			break;
		case 9:
			// System.out.println("nextTile.setElement(p)");
			// element = e; // ez m�r a logik�t val�s�tja meg, megcsin�lja a fgvt.
			break;
		case 10:
			// System.out.println("nextTile.setElement(p)");
			// element = e;
			break;
		case 12:
			System.out.println("acTile.setElement(lp)");
		default:
			break;
		}

	}

	public boolean stepIn(Animal a) {
		switch (Game.usecase) {
		case 9: /* 5.3.9 OrangutanCollideWithThing */
			System.out.println("Tile.stepIn(Animal a) ");
			ArmChair ac = new ArmChair();
			this.setElement(ac);
			ac.collide((Orangutan) a);
			break;

		case 10: /* 5.3.10 OrangutanExit */
			System.out.println("Tile.stepIn(Animal a) ");
			if (this.getElement() == null) { // Ha nincs rajta semmi, akkor sim�n bele tud l�pni
				this.setElement(a);
				return true;
			} else {
				this.getElement().collide((Orangutan) a); // this.getElement() az Exit
			}
			break;
		default:
			break;
		}
		return false; /* ??? */
	}

	public void remove(Element e) {
		switch (Game.usecase) {
		case 1:
			System.out.println("tile.remove(o)");
			break;
		case 2:
			System.out.println("tile.remove(o)");
			break;
		case 3:
			System.out.println("tile.remove(o)");
			break;
		case 6:
			System.out.println("tile.remove(p)");
			break;
		case 7:
			System.out.println("tile.remove(p)");
			break;
		case 12:
			System.out.println("tile.remove(lp)");
			break;
		default:
			break;
		}

	}

	public void incraseCounter() {
		
	}

	public Element getElement() {
		System.out.println("Tile.getElement() ");
		return element;
	}
}
