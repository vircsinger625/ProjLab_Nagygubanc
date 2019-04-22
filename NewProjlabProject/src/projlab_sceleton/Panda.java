package projlab_sceleton;

import java.awt.image.TileObserver;
import java.util.Random;

public class Panda extends Animal implements Steppable {

	protected boolean isCaptured;
	protected Orangutan orangutan;

	public boolean isCaptured() {
		return isCaptured;
	}

	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public boolean collide(Orangutan o) {
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
		boolean canStepin = t.stepIn(this);
		if (canStepin) {
			this.tile.remove(this);
			t.setElement(this);
		}
	}

	public void step() {
		Random r = new Random();
		if (isCaptured == false) {
			int x = r.nextInt((tile.getX()+1)-(tile.getX()-1))+(tile.getX()-1);
			int y = r.nextInt((tile.getY()+1)-(tile.getY()-1))+(tile.getY()-1);
			move(x,y);
			
		}
	}
	
	public void setIsResting(boolean b) {
		
	}

	public void setParalyzedCounter(int paralyzedCounter) {
		
	}

}
