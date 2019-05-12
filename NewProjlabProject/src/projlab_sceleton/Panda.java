package projlab_sceleton;

import java.awt.image.TileObserver;
import java.util.Random;

public class Panda extends Animal implements Steppable {

	protected boolean isCaptured;
	protected Orangutan orangutan;

	public Orangutan getOrangutan() {		
		return orangutan;
	}

	public void setOrangutan(Orangutan orangutan) { //or�ngut�n be�ll�t�sa
		this.orangutan = orangutan;
	}

	//isCaptured param�ter be�ll�t�sa �s lek�rdez�se
	public boolean isCaptured() {
		return isCaptured;
	}

	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public boolean collide(Orangutan o) {  //panda �s or�ngut�n �tk�z�s�t hajtja v�gre
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

	public void move(int x, int y) {			//ez a f�gv�ny mozgatja a pand�t adott x �s y koordin�t�ra
		Tile t = Game.floor.getTile(x, y);
		
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
	}

	public void die() {		//ha egy panda meghal ez a f�gv�ny h�v�dik meg.
		tile.remove(this);
		Game.floor.removeElement(this);
		
	}

	public void move(Tile t) {		//ez a f�gv�ny mozgatja a pand�t adott csemp�re
		if (t != null) {
			
		
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
		}
	}

	public void step() {			//l�pteti a pand�t
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
