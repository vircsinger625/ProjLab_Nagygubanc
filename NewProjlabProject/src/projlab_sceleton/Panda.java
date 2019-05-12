package projlab_sceleton;

import java.awt.image.TileObserver;
import java.util.Random;

public class Panda extends Animal implements Steppable {

	protected boolean isCaptured;
	protected Orangutan orangutan;

	public Orangutan getOrangutan() {
		return orangutan;
	}

	public void setOrangutan(Orangutan orangutan) {
		this.orangutan = orangutan;
	}

	public boolean isCaptured() {
		return isCaptured;
	}

	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public boolean collide(Orangutan o) {
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

	public void move(int x, int y) {
		Tile t = Game.floor.getTile(x, y);
		
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
	}

	public void die() {
		tile.remove(this);
		Game.floor.removeElement(this);
		
	}

	public void move(Tile t) {
		if (t != null) {
			
		
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
		}
	}

	public void step() {
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
