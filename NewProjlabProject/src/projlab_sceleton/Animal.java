package projlab_sceleton;


//allatot reprezentalo osztaly, element leszarmazottja
public class Animal extends Element {

	//elozo csempe eltarolasa
	private Tile previousTile = null;
	
	
	//elozo csempe lekerdezese
	public Tile getPreviousTile() {
		return previousTile;
	}
	
	//elozo csemoe beallitasa
	public void setPreviousTile(Tile previousTile) {
		this.previousTile = previousTile;
	}

	
	//innentol kezdve a fuggvenyek az oroklodesek miatt kellenek,
	//nincsenek implementalva ebben az osztalyban
	
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

	}

	public void move(Tile t) {
	}
}
