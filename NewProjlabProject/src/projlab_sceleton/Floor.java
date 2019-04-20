package projlab_sceleton;

public class Floor {

	private int score;
	private Tile tiles;
	private Orangutan orangutan = new Orangutan();
	private Panda panda;
	private Wardrobe wardrobes;
	private Tile enteranceTile; // nincs meg konkret ertéke

	public Tile getNextTile(Tile t, int x, int y) { //diretction --> x, y koordinatak
		return tiles;
	}

	public void removeElement(Element e) {
	}

	public void incraseScore() {
	}

	public Wardrobe getNextWardrobe(Wardrobe w) {
		return wardrobes;
	} 

	public Tile getEntranceTile() {
		return enteranceTile;
	}

	public void setEntranceTile(Tile et) {
		enteranceTile = et;
	}

	public Orangutan getOrangutan() {
		return orangutan;
	}

	public void setOrangutan(Orangutan orangutan) {
		this.orangutan = orangutan;
	}

}
