package projlab_sceleton;

public class Tile {
	
	private int numberOfSides;
	private Element element;
	
	public void setElement(Element e) {System.out.println("Tile.setElement(Element e) ");}
	
	public boolean stepIn(Animal a) {System.out.println("Tile.stepIn(Animal a) "); return true;}
	
	public void remove(Element e) {System.out.println("Tile.remove(Element e) ");}
	
	public Element getElement() {System.out.println("Tile.getElement() "); return element;} //ide is kell majd még valami!!

}
