package projlab_sceleton;

import java.awt.image.TileObserver;

public class Panda extends Animal implements Steppable {
	
	private boolean isCaptured;
	
	public boolean collide(Orangutan o) {System.out.println("Panda.collide(Orangutan o) "); return true;}
	
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
		//Mindig írjuk ki a konkrét függvényt + paramétert a szekvenciadiagram alapján
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

		default:
			
			break;
		}
	}
	
	public void step() {System.out.println("Panda.step() ");}
	

	
	public void setIsCaptured(boolean b) {System.out.println("Panda.setIsCaptured(boolean b) ");}

}
