package projlab_sceleton;

import java.util.ArrayList;
import java.util.TimerTask; 
import java.util.List;

public class MyTimer extends TimerTask {

	private List<Steppable> steppable = new ArrayList<Steppable>();
	private int counter=0;

	public void tick() {
		counter++;
		if (counter >= 100) {
			for (int i = 0; i < steppable.size(); i++) {
				Steppable s = steppable.get(i);
				s.step();
			}
			counter = 0;
		}
		
		Tile t = Game.floor.getOrangutan1().getTile();
		Game.window.moveOrangutanButton(t.getX(), t.getY());
		
		Game.window.pandaButtons();
	}

	public void addSteppable(Steppable s) {
		steppable.add(s);
	}

	public void removeSteppable(Steppable s) {
		steppable.remove(s);
	}

	@Override
	public void run() {
		tick();
		
	}



}
