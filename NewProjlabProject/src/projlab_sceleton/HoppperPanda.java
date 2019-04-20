package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoppperPanda extends Panda {


	public void reaction(InputEffect i, Tile t) {
		if (i == InputEffect.jingleMessage) {
			tile.incraseCounter();
		}
		
	}

	

	public Tile getTile() {
		return this.tile;
	}

}
