package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Orangutan extends Animal implements Steppable {

	private boolean hasCapturedPanda = false;
	public List<Panda> capturedPandas = new ArrayList<Panda>();

	public boolean collide(Orangutan o) {		// panda �s or�ngut�n �tk�z�s�t hajtja v�gre
		if (o.isHasCapturedPanda() == false) {
			return false;
		} else {
			Tile otile = o.getTile();
			Tile owntile = tile;
			tile.remove(this);
			otile.remove(o);
			otile.setElement(this);
			owntile.setElement(o);
			o.setCapturedPandas(capturedPandas);
			capturedPandas = null;
			return true;
		}
	}

	public boolean collide(Panda p) {		// or�ngut�n �s panda �tk�z�s�t hajtja v�gre

		p.setCaptured(true);
		addCapturedPandas(p);
		Tile pandaTile = p.getTile();
		tile.remove(this);
		pandaTile.setElement(this);

		return true;
	}

	public void reaction(InputEffect i, Tile t) {
	}

	public void move(int x, int y) {		//mozgatja az or�ngut�nt

		Tile t = Game.floor.getTile(x, y);

		if ((this.tile.isNeighbour(t.getId()) == true) && t != null) {
			
		if (t.getId() == 41) {
			int pandasnumber = this.capturedPandas.size();
			
			Game.infoBox("üzenet", "ezis", pandasnumber);
			System.exit(0);
		}
		boolean canStepIn = t.stepIn(this);				
		if (canStepIn) {					//ha az or�ngut�n r� tud l�pni a csemp�re akkor hajt�dik v�gre a felt�tel k�dja
			Tile prevtile = tile;
			this.tile.remove(this);
			t.setElement(this);

			if (hasCapturedPanda == true) {		//ha van az or�ngut�nnak elfogott pand�ja akkor hajt�dik v�gre a felt�tel k�dja
				Tile tile1 = null;
				Tile tile2 = null;
				Tile tmp;
				Panda p;
				for (int i = 0; i < capturedPandas.size(); i++) {
					if (i == 0) {
						p = capturedPandas.get(i);
						tile1 = p.getTile();
						p.move(prevtile);
					} else {
						if (i % 2 == 0) {
							tmp = tile2;
							p = capturedPandas.get(i);
							tile2 = p.getTile();
							p.move(tmp);
						} else {
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
	}

	public void die() {			//egy or�ngut�n hl�lakor h�v�dik meg
		tile.remove(this);
		Game.floor.removeElement(this);
	}

	public void move(Tile t) {		//egy adott csemp�re mozd�tja az or�ngut�nt

		boolean canStepIn = t.stepIn(this);
		if (canStepIn) {
			this.tile.remove(this);
			t.setElement(this);
			if (hasCapturedPanda == true) {
				Tile tile1 = null;
				Tile tile2 = null;
				Tile tmp;
				Panda p;
				for (int i = 0; i < capturedPandas.size(); i++) {
					if (i == 0) {
						p = capturedPandas.get(i);
						tile2 = p.getTile();
						p.move(tile);
					} else {
						if (i % 2 == 0) {
							tmp = tile2;
							p = capturedPandas.get(i);
							tile2 = p.getTile();
							p.move(tmp);
						} else {
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

	public void step() {			//l�pteti az or�ngut�nt
		Random r = new Random();
		int rand = r.nextInt(this.tile.getNeighbours());
		int id= this.tile.getNeighbourById(rand);
		Tile t = Game.floor.getTileById(id);
		move(t);
	}

	public void addCapturedPandas(Panda p) {		//az or�ngut�nhoz egy adott elkapott pand�t ad
		capturedPandas.add(0, p);
		setHasCapturedPanda(true);
	}

	public void removeCapturedPandas(Panda p) {		//egy adott elfogott pand�t elvesz azor�ngut�nt�l
		int pos = capturedPandas.indexOf(p);
		for (int i = 0; i < capturedPandas.size(); i++) {
			if (i >= pos) {
				capturedPandas.get(i).setCaptured(false);
				capturedPandas.remove(i);

			}
		}
	}
	
	public void killCapturedPandas() {		//az ot�ngut�n elfogott pand�it meg�li
		for (int i = 0; i < capturedPandas.size(); i++) {
				capturedPandas.get(i).setCaptured(false);
				capturedPandas.remove(i);
				capturedPandas.get(i).die();

		}
	}
	
	// getter �s setter f�ggv�nyek
	public boolean isHasCapturedPanda() {		
		return hasCapturedPanda;
	}

	public void setHasCapturedPanda(boolean hasCapturedPanda) {
		this.hasCapturedPanda = hasCapturedPanda;
	}

	public List<Panda> getCapturedPandas() {
		return capturedPandas;
	}

	public void setCapturedPandas(List<Panda> capturedPandas) {
		this.capturedPandas = capturedPandas;
	}

}
