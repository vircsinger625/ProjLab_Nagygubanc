package projlab_sceleton;

public class Element {

	protected Tile tile;
	protected int id = -1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean collide(Orangutan o) {
		return false;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}
	public void die() {
		
	}
}
