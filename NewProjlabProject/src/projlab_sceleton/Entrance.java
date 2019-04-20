package projlab_sceleton;

public class Entrance extends Element {
	
	public Entrance(Tile t) {
		tile =  t;
	}

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

}
