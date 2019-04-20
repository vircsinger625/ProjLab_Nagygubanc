package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Orangutan extends Animal implements Steppable {

	private boolean hasCapturedPanda = false;
	public List<Panda> capturedPandas = new ArrayList<Panda>(); 

	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		
		p.setCaptured(true);
		addCapturedPandas(p);
		Tile pandaTile = p.getTile();
		tile.remove(this);
		pandaTile.setElement(this);
		
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void move(int x, int y) {
		
		Tile t = Game.floor.getTile(x, y);
		
		boolean canStepIn = t.stepIn(this);
		if (canStepIn) {
			this.tile.remove(this);
			t.setElement(this);
			
			if(hasCapturedPanda == true) {
				Tile tile1 = null;
				Tile tile2 = null;
				Tile tmp;
				Panda p;
				for (int i = 0; i < capturedPandas.size(); i++) {
					if(i==0) {
						p = capturedPandas.get(i);
						tile2 = p.getTile();
						p.move(tile);
					}else {
						if (i%2 == 0) {
							tmp = tile2;
							p = capturedPandas.get(i);
							tile2 = p.getTile();
							p.move(tmp);
						}else {
							tmp = tile1;
							p = capturedPandas.get(i);
							tile1 = p.getTile();
							p.move(tmp);
								
						}
						}
					}
			}
		}
	}

	public void die() {
		tile.remove(this);
		Game.floor.removeElement(this);
	}

	public void move(Tile t) {
		
		boolean canStepIn = t.stepIn(this);
		if (canStepIn) {
			this.tile.remove(this);
			t.setElement(this);
			if(hasCapturedPanda == true) {
				Tile tile1 = null;
				Tile tile2 = null;
				Tile tmp;
				Panda p;
				for (int i = 0; i < capturedPandas.size(); i++) {
					if(i==0) {
						p = capturedPandas.get(i);
						tile2 = p.getTile();
						p.move(tile);
					}else {
						if (i%2 == 0) {
							tmp = tile2;
							p = capturedPandas.get(i);
							tile2 = p.getTile();
							p.move(tmp);
						}else {
							tmp = tile1;
							p = capturedPandas.get(i);
							tile1 = p.getTile();
							p.move(tmp);
								
						}
						}
					}
			}
		}
		
	}

	public void step() {
	}

	public void addCapturedPandas(Panda p) {
		capturedPandas.add(0, p);
	}

	public void removeCapturedPandas(Panda p) {
		int pos = capturedPandas.indexOf(p);
		for (int i = 0; i < capturedPandas.size(); i++) {
			if (i >= pos) {
				capturedPandas.get(i).setCaptured(false);
				capturedPandas.remove(i);
				
			}
		}
	}

	public boolean isHasCapturedPanda() {
		return hasCapturedPanda;
	}

	public void setHasCapturedPanda(boolean hasCapturedPanda) {
		this.hasCapturedPanda = hasCapturedPanda;
	}

}
