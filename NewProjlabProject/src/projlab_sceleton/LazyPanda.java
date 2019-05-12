package projlab_sceleton;

import java.util.Random;

public class LazyPanda extends Panda {

	private boolean isResting = false;		
	private int paralyzedCounter = 0;


	public void reaction(InputEffect i, Tile t) {		//a lazyPanda reakci�j�t val�s�tja meg a sleepMessage eset�n, azaz mikor elhalad egy fotel mellett
		
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

	public void step() {			//a f�ggv�ny l�pteti a pand�t
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


	public void setIsResting(boolean b) { //isResting param�ter be�ll�t�sa
		isResting = b;
	}

	public void decraseCounter() {		//cs�kkenti a fotelben tart�zkod� id� sz�m�t
		paralyzedCounter--;
	}

	public int getParalyzedCounter() {		//lek�ri a fotelben tart�zkod�si id� sz�m�t
		return paralyzedCounter;
	}

	public void setParalyzedCounter(int paralyzedCounter) {		//be�ll�tjaa fotelben tart�zkod�si id� sz�m�t
		this.paralyzedCounter = paralyzedCounter;
	}

}
