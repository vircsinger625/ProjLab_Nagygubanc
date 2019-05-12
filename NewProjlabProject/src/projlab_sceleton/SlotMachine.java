package projlab_sceleton;

public class SlotMachine extends Element implements Steppable {

	private int jingleCounter;

	public boolean collide(Orangutan o) { // Az orangutan nem tud ralepni 
		return false;
	}

	public boolean collide(Panda p) { //a panda se
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void step() {
		incraseJingleCounter(); //Mindig noveli a szamlalo erteket
		if (jingleCounter == 5) { // Ha a szamlalo 5, akkor csilingelo jelzest ad ki
			Tile tmp;
			Element e;
			for (int i = tile.getX()-1; i <= tile.getX()+1; i++) { //A mellette levo csempeknek
				for (int j = tile.getY()-1; j <= tile.getY()+1; j++) {
					tmp = Game.floor.getTile( i, j);
					e = tmp.getElement();
					e.reaction(InputEffect.jingleMessage, tile); // Kiadja a jelzest
					
				}
				
			}
			
		}
	}

	public void incraseJingleCounter() { //Noveli a szamlalo erteket 1-gyel 
		jingleCounter++;
	}

	public int getJingleCounter() { //Visszaadja a szamlalo aktualis erteket
		return jingleCounter;
	}

	public void setJingleCounter(int jingleCounter) { //Szamlalo ertekenek beallítasa
		this.jingleCounter = jingleCounter;
	}

}
