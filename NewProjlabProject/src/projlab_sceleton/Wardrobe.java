package projlab_sceleton;

public class Wardrobe extends Element {

	private int personalNumber;

	public boolean collide(Orangutan o) {
		
		o.getTile().remove(o) ; 
		o.setTile( Game.floor.getNextWardrobe(this).getTile() );
		Game.floor.getNextWardrobe(this).getTile().setElement(o);
				
		return false;
	}

	public boolean collide(Panda p) {
	
		p.getTile().remove(p) ; 
		p.setTile( Game.floor.getNextWardrobe(this).getTile() );
		Game.floor.getNextWardrobe(this).getTile().setElement(p);
		//p.move(Game.floor.getNextWardrobe(this));
		
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
