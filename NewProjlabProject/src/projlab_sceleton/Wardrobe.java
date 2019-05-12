package projlab_sceleton;

public class Wardrobe extends Element {

	private int personalNumber;

	public boolean collide(Orangutan o) { //Orangutan probal olyan csempere lepni, amin szekreny all
		
		o.getTile().remove(o) ; //Orangutan torlese a csemperol -> teleportalas kovetkezik 
		o.setTile( Game.floor.getNextWardrobe(this).getTile() ); //Megfelelo/soron kovetkezo szekrenybe teleportalas
		Game.floor.getNextWardrobe(this).getTile().setElement(o);
				
		return false;
	}

	public boolean collide(Panda p) { //Panda probal olyan csempere lepni, amin szekreny all
	
		p.getTile().remove(p) ; 
		p.setTile( Game.floor.getNextWardrobe(this).getTile() );
		Game.floor.getNextWardrobe(this).getTile().setElement(p);
		
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public Tile getTile() {
		return this.tile;
	}

	public int getPersonalNumber() { //A szekreny sajat azonositojanak lekerese
		return personalNumber;
	}

	public void setPersonalNumber(int personalNumber) { //A szekreny sajat azonositojanak  beallitasa
		this.personalNumber = personalNumber;
	}

}
