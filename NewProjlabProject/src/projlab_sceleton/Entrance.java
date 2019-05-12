package projlab_sceleton;

//bejaratot szimbolizalo osztaly, element leszarmazottja
public class Entrance extends Element {
	
	//konstruktor ami beallitja a csempet
	public Entrance(Tile t) {
		tile =  t;
	}

	
	//oroklodes fuggvenyei, nem itt implementaljuk
	public boolean collide(Orangutan o) {
		return true;
	}

	public boolean collide(Panda p) {
		return false;
	}

	public void reaction(InputEffect i, Tile t) {
	}

}
