package projlab_sceleton;

public class Wardrobe extends Element {
	
	private int personalNumber;
	
	public boolean collide(Orangutan o) {System.out.println("Wardrobe.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("Wardrobe.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Wardrobe.reaction(InputEffect i, Tile t) ");}
	
	public void getTile() {System.out.println("Wardrobe.getTile() ");}

}
