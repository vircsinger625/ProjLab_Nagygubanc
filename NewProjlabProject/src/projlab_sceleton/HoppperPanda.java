package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoppperPanda extends Panda {


	public void reaction(InputEffect i, Tile t) {		//a hopperPanda reakcióját valósítja meg a csilingeléskor
		if (i == InputEffect.whistleMessage) {
			tile.incraseCounter();
		}
		
	}

	public Tile getTile() {
		return this.tile;
	}

}
