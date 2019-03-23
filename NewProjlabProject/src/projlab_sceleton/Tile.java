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
		case 9:
			System.out.println("nextTile.setElement(p)");
			element = e; //ez már a logikát valósítja meg, megcsinálja a fgvt.
			break;
		case 10:
			System.out.println("nextTile.setElement(p)");
			element = e; 
			break;
		default:
			break;
		}

	}
	
	public boolean stepIn(Animal a) 
	{		
		switch (Game.usecase) {
			case 9: /* 5.3.9 OrangutanCollideWithThing */
				System.out.println("Tile.stepIn(Animal a) "); 
				if(this.getElement() == null) { //Ha nincs rajta semmi, akkor simán bele tud lépni 
					this.setElement(a);
					return true;
				}
				else {			
					this.getElement().collide((Orangutan)a);
				}
				break;
					
			case 10: /*5.3.10	OrangutanExit*/
				System.out.println("Tile.stepIn(Animal a) "); 
				if(this.getElement() == null) { //Ha nincs rajta semmi, akkor simán bele tud lépni 
					this.setElement(a);
					return true;
				}
				else {	
					this.getElement().collide((Orangutan)a); //this.getElement() az Exit
				}
				break;
			default:
				break;
		}
		return false; /*???*/
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
	
	public Element getElement() 
	{
		System.out.println("Tile.getElement() "); 
		return element;
	} 

}
