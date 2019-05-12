package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	private int score;
	private List<Tile> tiles = new ArrayList<Tile>(); // a csempéket tároló lista létrehozása
	
	private Orangutan orangutan1;			//a pályán lévõ két orángután
	private Orangutan orangutan2;
	
	

	private List<Panda> pandas = new ArrayList<Panda>(); //A pályán lévõ pandákat tárolja egy listában
	public List<Panda> getPandas() {	
		return pandas;
	}
	public void setPandas(List<Panda> pandas) {
		this.pandas = pandas;
	}
	private List<Wardrobe> wardrobes = new ArrayList<Wardrobe>();	//a szekrényeket tárolja egy listában
	private Tile enteranceTile; // nincs meg konkret ertï¿½ke		//a bejárat

/*	public Tile getNextTile(Tile t, Direction d) { //diretction --> x, y koordinatak
		return tiles;
	}
*/
	public Wardrobe getWardrobeByTile(int id) {			//egy csempén lévõ szekrény id-ját adja meg
		for (int i = 0; i < wardrobes.size(); i++) {
			if (wardrobes.get(i).getTile().getId() == id) {
				return wardrobes.get(i);
			}
			
		}
		return null;
	}
	public void removeElement(Orangutan o) {	//leveszi az orángutánt a pályáról
		if(o == orangutan1) {
			orangutan1 = null;
		}
		if(o == orangutan2) {
			orangutan2 = null;
		}
	}
	public void removeElement(Panda p) {		//leveszi a pandát az osztályról
		for (int i = 0; i < pandas.size(); i++) {
			if (pandas.get(i).getId() == p.getId()) {
				pandas.remove(i);
			}
		}
		
		
	}

	public void incraseScore() {		
		score++;
	}

	public Wardrobe getNextWardrobe(Wardrobe w) {		//a szekrény listában a sorban következõ szekény id-ját adja meg
		
		if(wardrobes.size() > w.getPersonalNumber())
		{
			return wardrobes.get(w.getPersonalNumber());
		}
		else
		{
			return wardrobes.get(0);
		} 
	}
	
	//getter és setter függvények:
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
	
	public Tile getTile(int x, int y) {			//egy csempét ad meg x,y koordináta alapján
		Tile tile = null;
		for (int i = 0; i < tiles.size(); i++) {
			if (tiles.get(i).getX() >= x-40 && tiles.get(i).getX() <= x+40 && tiles.get(i).getY() >= y-40 && tiles.get(i).getY() <= y+40) {
				
				return tiles.get(i);
				
			}
			
		}
		
		return tile;
		
	}
	public Tile getTileById(int id) {			//egy csempét ad meg id alapján
		Tile tile = null;
		for (int i = 0; i < tiles.size(); i++) {
				if(tiles.get(i).getId() == id) {
				return tiles.get(i);
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
	public Panda getPandaById(int id) {		//egy pandát ad meg id alapján
		for (int i = 0; i < pandas.size(); i++) {
			if (pandas.get(i).getId() == id) {
				return pandas.get(i);
			}
		}
		return null;
	}
	
	public Orangutan getOrangutanById(int id) {		////egy orángutánt ad meg id alapján
		
			if (id == 1) {
				return orangutan1;
			}
			if (id == 2) {
				return orangutan2;
			}
			else
				return null;
		}
	public void addPanda(Panda p) {		//panda hozzáadása a listához
		pandas.add(p);
	}
	
	public void addWardrobe(Wardrobe w) {	//szekrény hozzáadása a listához
		wardrobes.add(w);
	}
	
	
	
	
}
