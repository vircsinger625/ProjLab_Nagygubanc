package projlab_sceleton;

public class ChocolateAutomat extends Element implements Steppable {

	private int whistleCounter = 0;

	public boolean collide(Orangutan o) {
		return false;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void step() {
		incraseWhistleCounter();
		
		if (whistleCounter == 5) {
			Tile tmp;
			Element e;
			for (int i = tile.getX()-1; i <= tile.getX()+1; i++) {
				for (int j = tile.getY()-1; j <= tile.getY()+1; j++) {
					tmp = Game.floor.getTile( i, j);
					e = tmp.getElement();
					e.reaction(InputEffect.whistleMessage, tile);
					
				}
				
			}
			
		}
	}

	public void incraseWhistleCounter() {
		whistleCounter++;
	}

	public int getWhistleCounter() {
		return whistleCounter;
	}

	public void setWhistleCounter(int whistleCounter) {
		this.whistleCounter = whistleCounter;
	}

}
