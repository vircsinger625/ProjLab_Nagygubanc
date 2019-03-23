package projlab_sceleton;

import java.util.Iterator;
import java.util.List;

public class Exit extends Element {

	private boolean isCounting;

	public boolean collide(Orangutan o) {
		switch (Game.usecase) {
		case 10:
			System.out.println("Exit.collide(Orangutan o) ");
			/* 5.3.10 OrangutanExit */
			o.getTile().remove(o); // Orángután kilép
			Iterator<Panda> itr = o.capturedPandas.iterator();
			while (itr.hasNext()) {
				Panda p = itr.next();
				itr.remove();
				this.collide(p);
			}
			o.move(Game.floor.getEntranceTile()); // Orángután a bejárathoz kerül, miután kimentek a pandák
			return true;

		default:
			System.out.println("Exit.collide(Orangutan o) ");
			return false;

		}
	}

	public boolean collide(Panda p) {
		switch (Game.usecase) {
		case 10:
			System.out.println("Exit.collide(Panda p) ");
			/* 5.3.10 OrangutanExit */
			// p.move(this.getTile());
			p.getTile().remove(p);

			return true;

		default:
			System.out.println("Exit.collide(Panda p) ");
			return false;
		}
	}

	public void reaction(InputEffect i, Tile t) {
		System.out.println("Exit.reaction(InputEffect i, Tile t) ");
	}

}
