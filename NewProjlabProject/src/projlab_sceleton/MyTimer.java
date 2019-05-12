package projlab_sceleton;

import java.util.ArrayList;
import java.util.TimerTask; 
import java.util.List;

public class MyTimer extends TimerTask {

	private List<Steppable> steppable = new ArrayList<Steppable>();		//a l�ptethet� dolgok t�rol�sa egy list�ban
	private int counter=0;

	public void tick() {			//egy �rajelet reprezent�l
		counter++;
		if (counter >= 300) {
			for (int i = 0; i < steppable.size(); i++) {
				Steppable s = steppable.get(i);
				s.step();
			}
			counter = 0;
		}
		
		Tile t = Game.floor.getOrangutan1().getTile();		//a l�ptet�s ut�n megjelen�ti az or�ngut�nt az �j hely�n
		Game.window.moveOrangutanButton(t.getX(), t.getY());	//a l�ptet�s ut�n megjelen�ti a pand�kat az �j hely�n
		
		Game.window.pandaButtons();
	}

	public void addSteppable(Steppable s) {		//l�ptethet� elemek hozz�ad�sa a list�hoz
		steppable.add(s);
	}

	public void removeSteppable(Steppable s) {		//l�ptethet� elemek t�rl�se a list�b�l
		steppable.remove(s);
	}

	@Override
	public void run() {		//megh�vja az �rajelet
		tick();
		
	}



}
