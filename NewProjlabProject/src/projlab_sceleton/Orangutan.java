package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Orangutan extends Animal implements Steppable {
	
	private boolean hasCapturedPanda;
	public Panda[] capturedPandas;  /*TÖMB */
	
	public boolean collide(Orangutan o) {System.out.println("Orangutan.collide(Orangutan o) "); return true;}
	
	public boolean collide(Panda p) {System.out.println("Orangutan.collide(Panda p) "); return true;}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Orangutan.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("Orangutan.move(Direction d) ");}
	
	public void die() {System.out.println("Orangutan.die() ");}
	
	public void move(Tile t) 
	{
		//System.out.println("Orangutan.move(Tile t) ");
		/* 5.3.9 OrangutanCollideWithThing */
		/*5.3.10	OrangutanExit*/
		//t.stepIn(this); //a Tile-ban vizsgáljuk, hogy oda tud e lépni az orángután.
		switch (Game.usecase) {
		case 1:
			System.out.println("o.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			break;
		case 2:
			System.out.println("o.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			t.incraseCounter();
			
			System.out.println("Eltörik a csempe?");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String answer;
			try {
				answer = br.readLine();
				if ( answer.equals("y") )
				{
					this.die();
					break;
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("o.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			this.die();
			break;
		case 4:
			System.out.println("o.move(nextWardrobe)");
			break;
		}
	}
	
	public void step() {System.out.println("Orangutan.step() ");}
	
	public void addCapturedPandas(Panda p) {System.out.println("Orangutan.addCapturedPandas(Panda p) ");}
	
	public void removeCapturedPandas(Panda p) {/*System.out.println("Orangutan.removeCapturedPandas(Panda p) ");*/
		switch (Game.usecase) {
		case 7:
			System.out.println("o.removeCapturedPandas(p)");
			break;

		default:
			break;
		}
		return;
	}
	
}
