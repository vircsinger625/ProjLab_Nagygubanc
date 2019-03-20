package projlab_sceleton;

public class ChocolateAutomat extends Element implements Steppable {
	
	private int whistleCounter;
	
	public boolean collide(Orangutan o) {System.out.println("ChocolateAutomat.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("ChocolateAutomat.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("ChocolateAutomat.reaction(InputEffect i, Tile t) ");}
	
	public void step() {System.out.println("ChocolateAutomat.step() ");}
	
	public void incraseWhistleCounter() {System.out.println("ChocolateAutomat.incraseWhistleCounter() ");}

}
