package projlab_sceleton;

public class Panda extends Animal implements Steppable {
	
	private boolean isCaptured;
	
	public boolean collide(Orangutan o) {System.out.println("Panda.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("Panda.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Panda.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("Panda.move(Direction d) ");}
	
	public void die() {System.out.println("Panda.die() ");}
	
	public void move(Tile t) {System.out.println("Panda.move(Tile t) ");}
	
	public void step() {System.out.println("Panda.step() ");}
	
	public void getTile() {System.out.println("Panda.getTile() ");}
	
	public void setIsCaptured(boolean b) {System.out.println("Panda.setIsCaptured(boolean b) ");}

}
