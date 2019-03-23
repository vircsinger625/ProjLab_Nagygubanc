package projlab_sceleton;

public class SlotMachine extends Element implements Steppable {

	private int jingleCounter;

	public boolean collide(Orangutan o) {
		System.out.println("SlotMachine.collide(Orangutan o) ");
		return true;
	}

	public boolean collide(Panda p) {
		System.out.println("SlotMachine.collide(Panda p) ");
		return true;
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("SlotMachine.reaction(InputEffect i, Tile t) ");
	}

	public void step() {
		System.out.println("SlotMachine.step() ");
	}

	public void incraseJingleCounter() {
		System.out.println("SlotMachine.incraseJingleCounter() ");
	}

}
