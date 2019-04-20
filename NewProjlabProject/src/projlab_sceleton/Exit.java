package projlab_sceleton;

import java.util.Iterator;
import java.util.List;

public class Exit extends Element {

	private boolean isCounting = false;

	public boolean collide(Orangutan o) {
		Tile et = Game.floor.getEntranceTile();
		Tile tile1 = o.getTile();
		Tile tile2 = null;
		Tile tile3 = null;
		Tile tmp;
		Panda p;
		o.getTile().remove(o);
		o.setTile(et);
		et.setElement(o);
		if (o.isHasCapturedPanda()) {
			int counter = 0;
			while(o.capturedPandas.size() != 0) {
				counter += 1;
				for (int i = 0; i < o.capturedPandas.size(); i++) {
					if (counter == 1) {
						if(i==0) {
							p = o.capturedPandas.get(i);
							tile2 = p.getTile();
							p.move(tile);
						}else {
							if (i == 1) {
								p = o.capturedPandas.get(i);
								tile3 = p.getTile();
								p.move(tile1);
							}else {

								if (i%2 == 0) {
									tmp = tile2;
									p = o.capturedPandas.get(i);
									tile2 = p.getTile();
									p.move(tmp);
								}else {
									tmp = tile3;
									p = o.capturedPandas.get(i);
									tile3 = p.getTile();
									p.move(tmp);
									
								}
							}
						}
					}else {
						tile1 = null;
						tile2 = null;
						if(i==0) {
							p = o.capturedPandas.get(i);
							tile2 = p.getTile();
							p.move(tile);
						}else {
							if (i%2 == 0) {
								tmp = tile2;
								p = o.capturedPandas.get(i);
								tile2 = p.getTile();
								p.move(tmp);
							}else {
								tmp = tile1;
								p = o.capturedPandas.get(i);
								tile1 = p.getTile();
								p.move(tmp);
									
							}
						}
					}
				}		
			}
		}
		return true;
	}

	public boolean collide(Panda p) {
			if (p.isCaptured == false) {
				return false;
			}else {
				p.getTile().remove(p);
				tile.setElement(p);
				tile.remove(p);
				Game.floor.incraseScore();
				p.die();
				return true;
			}
	}
	
	public void reaction(InputEffect i, Tile t) {
	}

	public boolean isCounting() {
		return isCounting;
	}

	public void setCounting(boolean isCounting) {
		this.isCounting = isCounting;
	}

}
