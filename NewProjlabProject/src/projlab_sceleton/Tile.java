package projlab_sceleton;

public class Tile {
	
	private int numberOfSides;
	private Element element;
	
	public void setElement(Element e) {
		switch (Game.usecase) {
		case 1:
			System.out.println("nextTile.setElement(o1)");
			break;
		case 2:
			System.out.println("nextTile.setElement(o2)");
			break;
		case 3:
			System.out.println("nextTile.setElement(o3)");
			break;
		case 6:
			System.out.println("nextTile.setElement(p)");
			break;
		case 7:
			System.out.println("nextTile.setElement(p)");
			break;

		default:
			break;
		}

	}
	
	public boolean stepIn(Animal a) 
	{
		System.out.println("Tile.stepIn(Animal a) "); 
		Element e = this.getElement();		
		/* 5.3.9 OrangutanCollideWithThing */
		if(e == null) { 
			this.setElement(a);
			return true;
		}
		else {
			//e.collide(); /*Hogy adok át neki pandát vagy orángutánt? nem lehetne inkább animal-t átvenni?  */
			/* ez így még nem jó*/
			
			/*5.3.10	OrangutanExit*/

			return false; 
		}
	}
	
	
	public void remove(Element e) {
		switch (Game.usecase) {
		case 1:
			System.out.println("tile.remove(o1)");
			break;
		case 2:
			System.out.println("tile.remove(o2)");
			break;
		case 3:
			System.out.println("tile.remove(o3)");
			break;
		case 6:
			System.out.println("tile.remove(p)");
			break;
		case 7:
			System.out.println("tile.remove(p)");
			break;

		default:
			break;
		}
		
	}
	
	public Element getElement() {System.out.println("Tile.getElement() "); return element;} //ide is kell majd mï¿½g valami!!

}
