package projlab_sceleton;

public class ArmChair extends Element {

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void step() {
	}

}
