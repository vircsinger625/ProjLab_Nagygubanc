package projlab_sceleton;

public class WeakTile extends Tile {

	private int stepInCounter = 0; //Minden csempe errol az ertekrol indul, itt a legmagasabb a hatralevo eleteinek szama

	public boolean stepIn(Animal a) { 
		return true;
	}
	
	public boolean stepIn(Orangutan o) {
		if (element == null) { //Ha orangutan ures csempre lep
			return true; //akkor igazzal ter vissza, tehat lephet
		}else {
			return element.collide(o); //amugy pedig meghivja az adott elem collide fgv-et
		}
	}
	
	public boolean stepIn(Panda p) {
		if (element == null) {//Ha panda ures csempre lep
			return true;//akkor igazzal ter vissza, tehat lephet
		}else {
			return element.collide(p);//amugy pedig meghivja az adott elem collide fgv-et
		}
	}

	public void incraseCounter() { //Noveli az adott csempere lepesek szamat 1-el.
		stepInCounter++;
	}

	public int getStepInCounter() {
		return stepInCounter;
	}

	public void setStepInCounter(int count) {
		stepInCounter = count;
	}
	
	public void setElement(Element e) { //Az adott csempen levo elemnek a beallitsa es a csempe elettartamanak csokkentese
		element = e;
		e.setTile(this);
		incraseCounter();
		if(stepInCounter >20) { //Ha a csempe elettartama elerte a 20at, akkor minden ralepett animal lezuha, es meghal
			element.die();
		}
	}

}
