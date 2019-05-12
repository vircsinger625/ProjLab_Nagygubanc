package projlab_sceleton;

import java.util.ArrayList;
import java.util.TimerTask; 
import java.util.List;

public class MyTimer extends TimerTask {

	private List<Steppable> steppable = new ArrayList<Steppable>();		//a léptethetõ dolgok tárolása egy listában
	private int counter=0;

	public void tick() {			//egy órajelet reprezentál
		counter++;
		if (counter >= 300) {
			for (int i = 0; i < steppable.size(); i++) {
				Steppable s = steppable.get(i);
				s.step();
			}
			counter = 0;
		}
		
		Tile t = Game.floor.getOrangutan1().getTile();		//a léptetés után megjeleníti az orángutánt az új helyén
		Game.window.moveOrangutanButton(t.getX(), t.getY());	//a léptetés után megjeleníti a pandákat az új helyén
		
		Game.window.pandaButtons();
	}

	public void addSteppable(Steppable s) {		//léptethetõ elemek hozzáadása a listához
		steppable.add(s);
	}

	public void removeSteppable(Steppable s) {		//léptethetõ elemek törlése a listából
		steppable.remove(s);
	}

	@Override
	public void run() {		//meghívja az órajelet
		tick();
		
	}



}
