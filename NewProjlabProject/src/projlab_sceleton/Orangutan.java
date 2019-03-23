package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Orangutan extends Animal implements Steppable {
	
	private boolean hasCapturedPanda;
	public List<Panda> capturedPandas = new ArrayList<Panda>();  /*TÖMB */
	
	public boolean collide(Orangutan o) {System.out.println("Orangutan.collide(Orangutan o) "); return true;}
	
	public boolean collide(Panda p) {System.out.println("Orangutan.collide(Panda p) "); return true;}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Orangutan.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("Orangutan.move(Direction d) ");}
	
	public void die() {System.out.println("Orangutan.die() ");}
	
	public void move(Tile t) 
	{ 
		switch (Game.usecase) {
		case 1:
			System.out.println("o1.move(nextTile1)");
			this.tile.remove(this);
			t.setElement(this);
			this.die();
			break;
		case 2:
			System.out.println("o2.move(nextTile2)");
			this.tile.remove(this);
			t.setElement(this);
			this.die();
			break;
		case 3:
			System.out.println("o3.move(nextTile3)");
			this.tile.remove(this);
			t.setElement(this);
			this.die();
			
		case 8:
			System.out.println("Orangutan.move(Tile t) ");
			t.stepIn(this); //a Tile-ban vizsgáljuk, hogy oda tud e lépni az orángután.
			break;
		
		case 9:/* 5.3.9 OrangutanCollideWithThing */
			System.out.println("Orangutan.move(Tile t) ");
			t.stepIn(this); //a Tile-ban vizsgáljuk, hogy oda tud e lépni az orángután.
			break;
			
		case 10:/*5.3.10	OrangutanExit*/
			System.out.println("Orangutan.move(Tile t) ");
			t.stepIn(this); //a Tile-ban vizsgáljuk, hogy oda tud e lépni az orángután.
			break;
			
		default:
			break;
		}
	}
	
	public void step() {System.out.println("Orangutan.step() ");}
	
	public void addCapturedPandas(Panda p) 
	{
		
		switch (Game.usecase) {
			case 10:
				System.out.println("Orangutan.addCapturedPandas(Panda p) ");
				capturedPandas.add(p); //panda az orángután került a sorba
				break;
			default:
				break;
		}
	}
	
	public void removeCapturedPandas(Panda p) {/*System.out.println("Orangutan.removeCapturedPandas(Panda p) ");*/
		switch (Game.usecase) {
		case 7:
			System.out.println("o.removeCapturedPandas(p)");
			break;

		case 10:
			System.out.println("o.removeCapturedPandas(p)");
			capturedPandas.remove(p); 
			break;	
			
		default:
			break;
		}
		return;
	}
	
}
