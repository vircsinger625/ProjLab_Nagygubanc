package projlab_sceleton;

//Fotelt reprezentalo osztaly, implementalja a steppeble interfesz
//mert orajelre kuld ki uzenetet es element leszarmazottja
public class ArmChair extends Element implements Steppable{

	//kovetkezo harom fuggveny oroklodes miatt kell,
	//nincsenek az osztalyban implementalva
	
	public boolean collide(Orangutan o) {
		return false;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	//step fuggveny implementalasa
	//orajelre szomszedos csempekre sleepMessaget kuld ki
	public void step() {
		Tile tmp;
		Element e;
		for (int i = tile.getX()-1; i <= tile.getX()+1; i++) {
			for (int j = tile.getY()-1; j <= tile.getY()+1; j++) {
				tmp = Game.floor.getTile( i, j);
				e = tmp.getElement();
				e.reaction(InputEffect.sleepMessage, tile);
				
			}
			
		}
	}

}
