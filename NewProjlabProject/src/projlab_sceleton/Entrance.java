package projlab_sceleton;

public class Entrance extends Element {
	
	public boolean collide(Orangutan o) {System.out.println("Entrance.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("Entrance.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Entrance.reaction(InputEffect i, Tile t) ");}

}
