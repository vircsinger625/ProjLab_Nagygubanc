package projlab_sceleton;

//dolgokat szimbolizalo osztaly
public class Element {

	//az adott dolognak a csempeje
	protected Tile tile;
	protected int id = -1; //identifikalasra hasznalt valtozo

	
	//lekerdezo es beallito fuggvenyek
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	//orokles miatt nem implementalt fuggvenyek
	
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
