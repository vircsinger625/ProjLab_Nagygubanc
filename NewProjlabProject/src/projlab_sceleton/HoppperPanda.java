package projlab_sceleton;

public class HoppperPanda extends Panda{

	public boolean collide(Orangutan o) {System.out.println("HopperPanda.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("HopperPanda.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("HopperPanda.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("HopperPanda.move(Direction d) ");}
	
	public void die() {System.out.println("HopperPanda.die() ");}
	
	public void move(Tile t) {System.out.println("HopperPanda.move(Tile t) ");}
	
	public void step() {System.out.println("HopperPanda.step() ");}
	
	public void getTile() {System.out.println("HopperPanda.getTile() ");}
	
}