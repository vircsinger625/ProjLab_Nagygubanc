package projlab_sceleton;

import java.util.ArrayList;
import java.util.List;

public class Timer {

	private List<Steppable> steppable = new ArrayList<Steppable>();

	public void tick() {
		for (int i = 0; i < steppable.size(); i++) {
			Steppable s = steppable.get(i);
			s.step();
		}
	}

	public void addSteppable(Steppable s) {
		steppable.add(s);
	}

	public void removeSteppable(Steppable s) {
		steppable.remove(s);
	}



}
