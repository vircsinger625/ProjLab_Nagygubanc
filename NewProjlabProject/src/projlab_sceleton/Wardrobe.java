package projlab_sceleton;

public class Wardrobe extends Element {

	private int personalNumber;

	public boolean collide(Orangutan o) {
		Wardrobe w2 =Game.floor.getNextWardrobe(this);
		o.move(w2.getTile());
		
		return false;
	}

	public boolean collide(Panda p) {
	
		Wardrobe w2 =Game.floor.getNextWardrobe(this);
		p.move(w2.getTile());
		
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public Tile getTile() {
		return this.tile;
	}

	public int getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(int personalNumber) {
		this.personalNumber = personalNumber;
	}

}
