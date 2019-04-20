package projlab_sceleton;

public class Animal extends Element {

	private Tile previousTile = null;
	
	

	public Tile getPreviousTile() {
		return previousTile;
	}

	public void setPreviousTile(Tile previousTile) {
		this.previousTile = previousTile;
	}

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void move(int x, int y) {
	}

	public void die() {
		tile.remove(this);
		Game.floor.removeElement(this);
	}

	public void move(Tile t) {
	}
}
