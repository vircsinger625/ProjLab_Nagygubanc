package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	private int score;
	private Tile tiles;
	private Orangutan orangutan1;
	private Orangutan orangutan2;
	
	

	private List<Panda> pandas = new ArrayList<Panda>();
	private List<Wardrobe> wardrobes = new ArrayList<Wardrobe>();
	private Tile enteranceTile; // nincs meg konkret ertéke

	public Tile getNextTile(Tile t, int x, int y) { //diretction --> x, y koordinatak
		return tiles;
	}

	public void removeElement(Element e) {
	}

	public void incraseScore() {
		score++;
	}

	public Wardrobe getNextWardrobe(Wardrobe w) {
		
		return wardrobes.get(w.getPersonalNumber() +1 );
	} 

	public Tile getEntranceTile() {
		return enteranceTile;
	}

	public void setEntranceTile(Tile et) {
		enteranceTile = et;
	}

	public Orangutan getOrangutan1() {
		return orangutan1;
	}

	public void setOrangutan1(Orangutan orangutan1) {
		this.orangutan1 = orangutan1;
	}

	public Orangutan getOrangutan2() {
		return orangutan2;
	}

	public void setOrangutan2(Orangutan orangutan2) {
		this.orangutan2 = orangutan2;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
