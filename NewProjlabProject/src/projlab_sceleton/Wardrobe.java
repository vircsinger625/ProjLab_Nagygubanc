package projlab_sceleton;

public class Wardrobe extends Element {

	private int personalNumber;

	public boolean collide(Orangutan o) {
		Wardrobe nextWardrobe = new Wardrobe();
		Tile tile1 = new Tile();
		nextWardrobe.setTile(tile1);
		Tile tile2 = nextWardrobe.getTile();
		o.move(tile2);
		return false;
	}

	public boolean collide(Panda p) {
		Wardrobe nextWardrobe = new Wardrobe();
		Tile tile1 = new Tile();
		nextWardrobe.setTile(tile1);
		Tile tile2 = nextWardrobe.getTile();
		p.move(tile2);
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public Tile getTile() {
		return this.tile;
	}

}
