package projlab_sceleton;

public class Orangutan extends Animal implements Steppable {
	
	private boolean hasCapturedPanda;
	private Panda capturedPandas;
	
	public boolean collide(Orangutan o) {System.out.println("Orangutan.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("Orangutan.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Orangutan.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("Orangutan.move(Direction d) ");}
	
	public void die() {System.out.println("Orangutan.die() ");}
	
	public void move(Tile t) {System.out.println("Orangutan.move(Tile t) ");}
	
	public void step() {System.out.println("Orangutan.step() ");}
	
	public void addCapturedPandas(Panda p) {System.out.println("Orangutan.addCapturedPandas(Panda p) ");}
	
	public void removeCapturedPandas(Panda p) {System.out.println("Orangutan.removeCapturedPandas(Panda p) ");}
	
}
