package projlab_sceleton;

import java.util.Random;

public class LazyPanda extends Panda {

	private boolean isResting = false;
	private int paralyzedCounter = 0;


	public void reaction(InputEffect i, Tile t) {
		
		if (i == InputEffect.sleepMessage) {
			setIsResting(true);
			setParalyzedCounter(5);
			if (isCaptured == true) {
				orangutan.removeCapturedPandas(this);
			}
			tile.remove(this);
			t.setElement(this);
			
		}
	}

	public void step() {
		Random r = new Random();
		if (isCaptured == false) {
			if (isResting == false) {
				int rand = r.nextInt(this.tile.getNeighbours());
				Tile t = Game.floor.getTileById(rand);
				move(t);
				
			}else {
				decraseCounter();
				if (paralyzedCounter == 0) {
					setIsResting(false);
				}
			}
			
		}
	}

	public Tile getTile() {
		return this.tile;
	}


	public void setIsResting(boolean b) { 
		isResting = b;
	}

	public void decraseCounter() {
		paralyzedCounter--;
	}

	public int getParalyzedCounter() {
		return paralyzedCounter;
	}

	public void setParalyzedCounter(int paralyzedCounter) {
		this.paralyzedCounter = paralyzedCounter;
	}

}
