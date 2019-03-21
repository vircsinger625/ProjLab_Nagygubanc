package projlab_sceleton;

public class Floor {
	
	private int score;
	private Tile tiles;
	private Orangutan orangutan;
	private Panda panda;
	private Wardrobe wardrobes;
	
	public Tile getNextTile(Tile t, Direction d) {System.out.println("Floor.getNextTile(Tile t, Direction d) "); return tiles;} // tömb kéne ide!
	
	public void removeElement(Element e) {System.out.println("Floor.removeElement(Element e) ");}
	
	public void incraseScore() {System.out.println("Floor.incraseScore() ");}
	
	public Wardrobe getNextWardrobe(Wardrobe w) {System.out.println("Floor.getNextWardrobe(Wardrobe w) "); return wardrobes;} //tömb
	
	public Tile getEntranceTile() {System.out.println("Floor.getEntranceTile() "); return tiles;} //tömb
	

}
