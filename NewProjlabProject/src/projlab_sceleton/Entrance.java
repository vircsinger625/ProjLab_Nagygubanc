package projlab_sceleton;

public class Entrance extends Element {

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

}
