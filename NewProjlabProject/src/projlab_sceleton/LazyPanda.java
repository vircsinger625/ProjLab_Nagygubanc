package projlab_sceleton;

import java.util.Random;

public class LazyPanda extends Panda {

	private boolean isResting = false;		
	private int paralyzedCounter = 0;


	public void reaction(InputEffect i, Tile t) {		//a lazyPanda reakcióját valósítja meg a sleepMessage esetén, azaz mikor elhalad egy fotel mellett
		
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

	public void step() {			//a függvény lépteti a pandát
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


	public void setIsResting(boolean b) { //isResting paraméter beállítása
		isResting = b;
	}

	public void decraseCounter() {		//csökkenti a fotelben tartózkodó idõ számát
		paralyzedCounter--;
	}

	public int getParalyzedCounter() {		//lekéri a fotelben tartózkodási idõ számát
		return paralyzedCounter;
	}

	public void setParalyzedCounter(int paralyzedCounter) {		//beállítjaa fotelben tartózkodási idõ számát
		this.paralyzedCounter = paralyzedCounter;
	}

}
