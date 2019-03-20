package projlab_sceleton;

public class LazyPanda extends Panda {
	
	private boolean isResting;
	private int paralyzedCounter;
	
	public boolean collide(Orangutan o) {System.out.println("LazyPanda.collide(Orangutan o) ");}
	
	public boolean collide(Panda p) {System.out.println("LazyPanda.collide(Panda p) ");}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("LazyPanda.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("LazyPanda.move(Direction d) ");}
	
	public void die() {System.out.println("LazyPanda.die() ");}
	
	public void move(Tile t) {System.out.println("LazyPanda.move(Tile t) ");}
	
	public void step() {System.out.println("LazyPanda.step() ");}
	
	public void getTile() {System.out.println("LazyPanda.getTile() ");}
	
	public void setParalyzedCounter() {System.out.println("LazyPanda.setParalyzedCounter() ");}
	
	public void setIsResting(boolean b) {System.out.println("LazyPanda.setIsResting(boolean b) ");}
	
	public void decraseCounter() {System.out.println("LazyPanda.decraseCounter() ");}

}
