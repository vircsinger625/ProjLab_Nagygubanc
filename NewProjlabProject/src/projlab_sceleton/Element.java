package projlab_sceleton;

public class Element {

	protected Tile tile;
	
	public boolean collide(Orangutan o) {System.out.println("Element.collide(Orangutan o) "); return true;}
	
	public boolean collide(Panda p) {System.out.println("Element.collide(Panda p) "); return true;}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Element.reaction(InputEffect i, Tile t) ");}

	public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}
}
