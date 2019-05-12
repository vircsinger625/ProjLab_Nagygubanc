package projlab_sceleton;

import java.awt.image.TileObserver;
import java.util.Random;

public class Panda extends Animal implements Steppable {

	protected boolean isCaptured;
	protected Orangutan orangutan;

	public Orangutan getOrangutan() {		
		return orangutan;
	}

	public void setOrangutan(Orangutan orangutan) { //orángután beállítása
		this.orangutan = orangutan;
	}

	//isCaptured paraméter beállítása és lekérdezése
	public boolean isCaptured() {
		return isCaptured;
	}

	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public boolean collide(Orangutan o) {  //panda és orángután ütközését hajtja végre
		orangutan = o;
		setCaptured(true);
		o.addCapturedPandas(this);
		Tile orangutantile = o.getTile();
		tile.remove(this);
		orangutantile.setElement(this);
		return true;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void move(int x, int y) {			//ez a fügvény mozgatja a pandát adott x és y koordinátára
		Tile t = Game.floor.getTile(x, y);
		
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
	}

	public void die() {		//ha egy panda meghal ez a fügvény hívódik meg.
		tile.remove(this);
		Game.floor.removeElement(this);
		
	}

	public void move(Tile t) {		//ez a fügvény mozgatja a pandát adott csempére
		if (t != null) {
			
		
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
		}
	}

	public void step() {			//lépteti a pandát
		if (isCaptured == false) {
			
		
		Random r = new Random();
		int rand = r.nextInt(this.tile.getNeighbours());
		int id= this.tile.getNeighbourById(rand);
		Tile t = Game.floor.getTileById(id);
		move(t);
		}
	}
	
	public void setIsResting(boolean b) {
		
	}

	public void setParalyzedCounter(int paralyzedCounter) {
		
	}

}
