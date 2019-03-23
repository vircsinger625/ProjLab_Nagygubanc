package projlab_sceleton;

public class Timer {

	private Steppable steppable;

	public void tick() {
		System.out.println("Timer.tick() ");
	}

	public void addSteppable(Steppable s) {
		System.out.println("Timer.addSteppable(Steppable s) ");
	}

	public void removeSteppable(Steppable s) {
		System.out.println("Timer.removeSteppable(Steppable s) ");
	}

}
