package projlab_sceleton;

public class SlotMachine extends Element implements Steppable {

	private int jingleCounter;

	public boolean collide(Orangutan o) {
		return false;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void step() {
		incraseJingleCounter();
		if (jingleCounter == 5) {
			Tile tmp;
			Element e;
			for (int i = tile.getX()-1; i <= tile.getX()+1; i++) {
				for (int j = tile.getY()-1; j <= tile.getY()+1; j++) {
					tmp = Game.floor.getTile( i, j);
					e = tmp.getElement();
					e.reaction(InputEffect.jingleMessage, tile);
					
				}
				
			}
			
		}
	}

	public void incraseJingleCounter() {
		jingleCounter++;
	}

	public int getJingleCounter() {
		return jingleCounter;
	}

	public void setJingleCounter(int jingleCounter) {
		this.jingleCounter = jingleCounter;
	}

}
