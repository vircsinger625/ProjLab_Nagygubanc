package projlab_sceleton;

import java.util.Iterator;
import java.util.List;

public class Exit extends Element {

	private boolean isCounting = false;

	public boolean collide(Orangutan o) {
		return false;
	}

	public boolean collide(Panda p) {
		return false;
			
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
