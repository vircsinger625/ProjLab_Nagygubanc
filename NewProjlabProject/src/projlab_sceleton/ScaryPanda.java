package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScaryPanda extends Panda {



	public void reaction(InputEffect i, Tile t) {
		if(i == InputEffect.jingleMessage) { // A scary panda a jatekgep sipolajanak hatasara megijed es elengedi a mancsokat, ha eppen egy sorban volt
			getOrangutan().removeCapturedPandas(this); // Kiszedjuk az orangutan sorabol vagyis a listajabol
		}
	}


	public Tile getTile() { //vissza adja, hogy melyik csempen all a scary panda 
		return this.tile;
	}

}
