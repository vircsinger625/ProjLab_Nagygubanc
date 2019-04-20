package projlab_sceleton;

import java.util.Iterator;
import java.util.List;

public class Exit extends Element {

	private boolean isCounting;

	public boolean collide(Orangutan o) {
		o.getTile().remove(o); // Orángután kilép
		Iterator<Panda> itr = o.capturedPandas.iterator();
		while (itr.hasNext()) {
			Panda p = itr.next();
			itr.remove();
			this.collide(p);
		}
		o.move(Game.floor.getEntranceTile()); // Orángután a bejárathoz kerül, miután kimentek a pandák
		return true;
	}

	public boolean collide(Panda p) {
			return true;
	}
	
	public void reaction(InputEffect i, Tile t) {
	}

	public boolean isCounting() {
		return isCounting;
	}

	public void setCounting(boolean isCounting) {
		this.isCounting = isCounting;
	}

}
