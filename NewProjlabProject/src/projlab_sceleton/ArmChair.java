package projlab_sceleton;

public class ArmChair extends Element {
	
	public boolean collide(Orangutan o) {System.out.println("ArmChair.collide(Orangutan o) "); return true;}
	
	public boolean collide(Panda p) {System.out.println("ArmChair.collide(Panda p) "); return true;}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("ArmChair.reaction(InputEffect i, Tile t) ");}
	
	public void step() {System.out.println("ArmChair.step() ");}
	
}
