package projlab_sceleton;

public class Floor {

	private int score;
	private Tile tiles;
	private Orangutan orangutan = new Orangutan();
	private Panda panda;
	private Wardrobe wardrobes;
	private Tile enteranceTile; // nincs még konkrét értéke

	public Tile getNextTile(Tile t, Direction d) {
		System.out.println("Floor.getNextTile(Tile t, Direction d) ");
		return tiles;
	} // tï¿½mb kï¿½ne ide!

	public void removeElement(Element e) {
		System.out.println("Floor.removeElement(Element e) ");
	}

	public void incraseScore() {
		System.out.println("Floor.incraseScore() ");
	}

	public Wardrobe getNextWardrobe(Wardrobe w) {
		System.out.println("Floor.getNextWardrobe(Wardrobe w) ");
		return wardrobes;
	} // tï¿½mb

	public Tile getEntranceTile() {
		System.out.println("Floor.getEntranceTile() ");
		return enteranceTile;
	}

	public void setEntranceTile(Tile et) {
		System.out.println("Floor.setEntranceTile() ");
		enteranceTile = et;
	}

	public Orangutan getOrangutan() {
		return orangutan;
	}

	public void setOrangutan(Orangutan orangutan) {
		this.orangutan = orangutan;
	}

}
