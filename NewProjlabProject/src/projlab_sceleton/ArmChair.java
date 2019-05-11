package projlab_sceleton;

public class ArmChair extends Element implements Steppable{

	public boolean collide(Orangutan o) {
		return false;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

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
