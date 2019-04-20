package projlab_sceleton;

public class Element {

	protected Tile tile;

	public boolean collide(Orangutan o) {
		if (o.getTile().getElement() == new Entrance() || /* 5.3.10 OrangutanExit */
				o.getTile().getElement() == new Wardrobe() || /* 5.3.9 OrangutanCollideWithThing */
				o.getTile().getElement() == new Exit()) {
			return true;
		}
		else {
			return false; 
		}
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}
}
