package projlab_sceleton;

import java.util.Iterator;
import java.util.List;

//kijaratot szimbolizalo osztaly, element leszarmazottja
public class Exit extends Element {

	//segedvaltozo
	private boolean isCounting = false;

	
	//getter, setter fuggvenyek
	//oroklodes miatti fuggvenyek amiket nem itt imolementalunk
	
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
