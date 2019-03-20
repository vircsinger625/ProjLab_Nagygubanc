package projlab_sceleton;

public class Element {

	private Tile tile;
	
	public boolean collide(Orangutan o) {System.out.println("Element.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("Element.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Element.reaction(InputEffect i, Tile t) ");}
}
