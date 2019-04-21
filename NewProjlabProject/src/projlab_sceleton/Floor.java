package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	private int score;
	private List<Tile> tiles = new ArrayList<Tile>();
	

	private Orangutan orangutan1;
	private Orangutan orangutan2;
	
	

	private List<Panda> pandas = new ArrayList<Panda>();
	private List<Wardrobe> wardrobes = new ArrayList<Wardrobe>();
	private Tile enteranceTile; // nincs meg konkret ert�ke

/*	public Tile getNextTile(Tile t, Direction d) { //diretction --> x, y koordinatak
		return tiles;
	}
*/
	public void removeElement(Orangutan o) {
		if(o == orangutan1) {
			orangutan1 = null;
		}
		if(o == orangutan2) {
			orangutan2 = null;
		}
	}
	public void removeElement(Panda p) {
		pandas.remove(p);
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
	
	public Tile getTile(int x, int y) {
		Tile tile = null;
		for (int i = 0; i < tiles.size(); i++) {
			if (tiles.get(i).getX() == x && tiles.get(i).getY() == y) {
				
				tile = tiles.get(i);
				return tile;
			}
			
		}
		
		return tile;
		
	}
	public List<Tile> getTiles() {
		return tiles;
	}
	public void setTiles(List<Tile> tiles) {
		this.tiles = tiles;
	}
}
