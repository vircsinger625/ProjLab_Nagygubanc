package projlab_sceleton;

import java.awt.image.TileObserver;

public class Panda extends Animal implements Steppable {
	
	private boolean isCaptured;
	
	public boolean collide(Orangutan o) {
		switch(Game.usecase) {
			case 8:
				System.out.println("Panda.collide(Orangutan o) "); 
				this.setIsCaptured(true);
				o.addCapturedPandas(this);
				Tile t1 =  o.getTile(); /*KI KELL CSER…LNI ’KET szekvenci·n is (?)*/
				o.move(this.getTile());
				this.move(t1);
				return true; //break;
			case 10:
				System.out.println("Panda.collide(Orangutan o) "); 
				this.setIsCaptured(true);
				o.addCapturedPandas(this);
				Tile t2 =  o.getTile(); /*KI KELL CSER…LNI ’KET szekvenci·n is (?)*/
				o.move(this.getTile());
				this.move(t2);
				return true; //break;
		default:
			return false; /**???**/
		}
	}
	
	public boolean collide(Panda p) {System.out.println("Panda.collide(Panda p) "); return true;}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Panda.reaction(InputEffect i, Tile t) ");}
	
	public void move(Direction d) {System.out.println("Panda.move(Direction d) ");}
	
	public void die() {switch (Game.usecase) {
	case 6:
		System.out.println("p.die())");
		break;
	case 7:
		System.out.println("p.die())");
		break;

	default:
		break;
	}
	}
	
	public void move(Tile t) {
		//System.out.println("Panda.move(Tile t) ");
		//Mindig √≠rjuk ki a konkr√©t f√ºggv√©nyt + param√©tert a szekvenciadiagram alapj√°n
		switch (Game.usecase) {
		case 6:
			System.out.println("p.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			this.die();
			break;
		case 7:
			System.out.println("p.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			Game.floor.getOrangutan().removeCapturedPandas(this);
			this.die();
			break;
		case 8:
			System.out.println("p.move(nextTile)");
			this.tile.remove(this);
			t.setElement(this);
			break;
		default:
			System.out.println("p.move(nextTile)");		// hogy tuti kiÌrja, hogy belelÈpett a fgv-be	
			break;
		}
	}
	
	public void step() {System.out.println("Panda.step() ");}
	

	
	public void setIsCaptured(boolean b) {System.out.println("Panda.setIsCaptured(boolean b) ");}

}
