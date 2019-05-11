package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Tile {

	private int numberOfSides;
	protected Element element = null;
	private int x;
	private int y;
	private  List<Integer> neighbours = new ArrayList<Integer>();
	private int id;
	private boolean hasWardrobe = false;
	

	public boolean isHasWardrobe() {
		return hasWardrobe;
	}

	public void setHasWardrobe(boolean hasWardrobe) {
		this.hasWardrobe = hasWardrobe;
	}

	public boolean isNeighbour(int id) {
		for (int i = 0; i < neighbours.size(); i++) {
			if (neighbours.get(i) == id ) {
				return true;
			}
		}
		return false;
	}
	
	public int getNeighbours() {
		return neighbours.size();
	}
	public int getNeighbourById(int id) {
		return  neighbours.get(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setElement(Element e) {
		this.element = e;
		element.setTile(this);

	}

	public boolean stepIn(Orangutan o) {
		if (element == null && hasWardrobe == false) {
			return true;
		}else {
			if (hasWardrobe) {
				return Game.floor.getWardrobeByTile(this.getId()).collide(o);
				
			}else {
			return element.collide(o);
			}
		}
	}
	
	public boolean stepIn(Panda p) {
		if (element == null) {
			return true;
		}else {
			if (hasWardrobe) {
				return Game.floor.getWardrobeByTile(this.getId()).collide(p);
				
			}else {
			return element.collide(p);
			}
		}
	}

	public void remove(Element e) {
		element = null;
	}

	public void incraseCounter() {
	}
	
	public int getStepInCounter() {
		return -1;
	}

	public Element getElement() {
		return element;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void AddNeighbour(int id) {
		neighbours.add(id);
	}
}
