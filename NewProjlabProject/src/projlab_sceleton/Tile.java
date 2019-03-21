package projlab_sceleton;

public class Tile {
	
	private int numberOfSides;
	private Element element;
	
	public void setElement(Element e) {
		switch (Game.usecase) {
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
	
	public boolean stepIn(Animal a) {System.out.println("Tile.stepIn(Animal a) "); return true;}
	
	public void remove(Element e) {
		switch (Game.usecase) {
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
	
	public Element getElement() {System.out.println("Tile.getElement() "); return element;} //ide is kell majd m�g valami!!

}
