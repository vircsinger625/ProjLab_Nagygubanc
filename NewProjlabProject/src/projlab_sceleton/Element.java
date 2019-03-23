package projlab_sceleton;

public class Element {

	protected Tile tile;

	public boolean collide(Orangutan o) {
		switch (Game.usecase) {
		case 9:
			System.out.println("Element.collide(Orangutan o) ");
			// az orángután csak bejáratra, kijáratra, szekrényre tud lépni
			if (o.getTile().getElement() == new Entrance() || /* 5.3.10 OrangutanExit */
					o.getTile().getElement() == new Wardrobe() || /* 5.3.9 OrangutanCollideWithThing */
					o.getTile().getElement() == new Exit()) {
				return true;
			}
		case 10:
			System.out.println("Element.collide(Orangutan o) ");
			// az orángután csak bejáratra, kijáratra, szekrényre tud lépni
			if (o.getTile().getElement() == new Entrance() || /* 5.3.10 OrangutanExit */
					o.getTile().getElement() == new Wardrobe() || /* 5.3.9 OrangutanCollideWithThing */
					o.getTile().getElement() == new Exit()) {
				return true;
			}
		}
		return false; /** ????? **/
	}

	public boolean collide(Panda p) {
		System.out.println("Element.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("Element.reaction(InputEffect i, Tile t) ");
	}

	public Tile getTile() {
		System.out.println("getTile()");
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}
}
