package projlab_sceleton;

public class HoppperPanda extends Panda{

	public boolean collide(Orangutan o) {System.out.println("HopperPanda.collide(Orangutan o) "); return true;}
	
	public boolean collide(Panda p) {System.out.println("HopperPanda.collide(Panda p) "); return true;}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("HopperPanda.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("HopperPanda.move(Direction d) ");}
	
	public void die() {System.out.println("HopperPanda.die() ");}
	
	public void move(Tile t) {System.out.println("HopperPanda.move(Tile t) ");}
	
	public void step() {System.out.println("HopperPanda.step() ");}
	
	public Tile getTile() {//System.out.println("HopperPanda.getTile() ");
	return this.tile;}
	
}
