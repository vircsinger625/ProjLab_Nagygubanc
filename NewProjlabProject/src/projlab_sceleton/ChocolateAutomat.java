package projlab_sceleton;

//Csokiautomatat reprezentalo osztaly
//implementalja a steppeblet mert orajelre uzenetet kuld ki
//element leszarmazottja
public class ChocolateAutomat extends Element implements Steppable {

	//sipolasok szamat tarolja
	private int whistleCounter = 0;

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
	//szomszedos mezokek ertesiti
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

	//sipolaspok szamat noveli
	public void incraseWhistleCounter() {
		whistleCounter++;
	}

	//sipolasok szamat kerdezi le
	public int getWhistleCounter() {
		return whistleCounter;
	}

	//sipolasok szamat allitja be
	public void setWhistleCounter(int whistleCounter) {
		this.whistleCounter = whistleCounter;
	}

}
