package projlab_sceleton;

public class Wardrobe extends Element {

	private int personalNumber;

	public boolean collide(Orangutan o) {
		// System.out.println("Wardrobe.collide(Orangutan o) ");
		switch (Game.usecase) {
		case 4:
			System.out.println("w.collide(o) ");
			Wardrobe nextWardrobe4 = new Wardrobe();
			Tile tile4 = new Tile();
			nextWardrobe4.setTile(tile4);
			Tile tile41 = nextWardrobe4.getTile();
			o.move(tile41);
			return false;

		default:
			break;
		}
		return false;
	}

	public boolean collide(Panda p) {
		// System.out.println("Wardrobe.collide(Panda p) ");
		switch (Game.usecase) {
		case 5:
			System.out.println("w.collide(p) ");
			Wardrobe nextWardrobe5 = new Wardrobe();
			Tile tile5 = new Tile();
			nextWardrobe5.setTile(tile5);
			Tile tile51 = nextWardrobe5.getTile();
			p.move(tile51);
			return false;

		default:
			break;
		}
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("Wardrobe.reaction(InputEffect i, Tile t) ");
	}

	public Tile getTile() {
		System.out.println("Wardrobe.getTile() ");
		return this.tile;
	}

}
