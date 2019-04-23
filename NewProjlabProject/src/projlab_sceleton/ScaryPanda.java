package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScaryPanda extends Panda {



	public void reaction(InputEffect i, Tile t) {
		if(i == InputEffect.jingleMessage) {
			getOrangutan().removeCapturedPandas(this);
		}
	}


	public Tile getTile() {
		return this.tile;
	}

}
