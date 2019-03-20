package projlab_sceleton;

public class Exit extends Element {
	
	private boolean isCounting;
	
	public boolean collide(Orangutan o) {System.out.println("Exit.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("Exit.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Exit.reaction(InputEffect i, Tile t) ");}

}
