package projlab_sceleton;

import java.io.BufferedReader;
import java.util.Timer; 
import java.util.TimerTask;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Game {

	//statikus elemek definiálása a program elején
	public static int usecase;
	public static Floor floor = new Floor();
	public static Window window = new Window();
	public static Timer timer = new Timer();
	public static MyTimer task = new MyTimer();

	public static void main(String[] args) {

			floor = new Floor();
			List<Tile> tiles = new ArrayList<Tile>();		//a csempéket tartalmazó lista
			
			for (int i = 1; i <= 42; i++) {			//csempék létrehozása és paramétereik beállítása
				Tile tile = new Tile();
				if (i == 13 || i == 35) {
					tile = new WeakTile();
				}
				tile.setId(i);					//id beállítása
				tile.setX(DrawRect.xcoord[i-1]);	//X koordináta beállítása
				tile.setY(DrawRect.ycoord[i-1]);	//Y koordináta beállítása
				tiles.add(tile);
			}
			tiles.get(0).AddNeighbour(2);		//Az egyes csempék szomszédainak beállítása
			tiles.get(0).AddNeighbour(3);
			
			tiles.get(1).AddNeighbour(1);
			tiles.get(1).AddNeighbour(3);
			tiles.get(1).AddNeighbour(8);
			
			tiles.get(2).AddNeighbour(1);
			tiles.get(2).AddNeighbour(2);
			tiles.get(2).AddNeighbour(4);
			tiles.get(2).AddNeighbour(5);
			tiles.get(2).AddNeighbour(6);
			tiles.get(2).AddNeighbour(7);
			tiles.get(2).AddNeighbour(8);
			
			tiles.get(3).AddNeighbour(3);
			tiles.get(3).AddNeighbour(5);
			
			tiles.get(4).AddNeighbour(3);
			tiles.get(4).AddNeighbour(4);
			tiles.get(4).AddNeighbour(6);
			tiles.get(4).AddNeighbour(14);

			tiles.get(5).AddNeighbour(3);
			tiles.get(5).AddNeighbour(5);
			tiles.get(5).AddNeighbour(7);
			tiles.get(5).AddNeighbour(13);

			tiles.get(6).AddNeighbour(3);
			tiles.get(6).AddNeighbour(6);
			tiles.get(6).AddNeighbour(8);
			tiles.get(6).AddNeighbour(11);
			tiles.get(6).AddNeighbour(12);
			
			tiles.get(7).AddNeighbour(2);
			tiles.get(7).AddNeighbour(3);
			tiles.get(7).AddNeighbour(7);
			tiles.get(7).AddNeighbour(9);
			tiles.get(7).AddNeighbour(11);

			tiles.get(8).AddNeighbour(8);
			tiles.get(8).AddNeighbour(10);
			tiles.get(8).AddNeighbour(11);

			tiles.get(9).AddNeighbour(9);
			tiles.get(9).AddNeighbour(11);
			tiles.get(9).AddNeighbour(25);
			
			tiles.get(10).AddNeighbour(7);
			tiles.get(10).AddNeighbour(8);
			tiles.get(10).AddNeighbour(9);
			tiles.get(10).AddNeighbour(10);
			tiles.get(10).AddNeighbour(12);
			tiles.get(10).AddNeighbour(18);
			tiles.get(10).AddNeighbour(19);
			tiles.get(10).AddNeighbour(24);
			

			tiles.get(11).AddNeighbour(7);
			tiles.get(11).AddNeighbour(11);
			tiles.get(11).AddNeighbour(13);
			tiles.get(11).AddNeighbour(18);
			

			tiles.get(12).AddNeighbour(6);
			tiles.get(12).AddNeighbour(12);
			tiles.get(12).AddNeighbour(14);
			tiles.get(12).AddNeighbour(15);
			tiles.get(12).AddNeighbour(17);

			tiles.get(13).AddNeighbour(5);
			tiles.get(13).AddNeighbour(13);

			tiles.get(14).AddNeighbour(13);
			tiles.get(14).AddNeighbour(16);

			tiles.get(15).AddNeighbour(15);
			tiles.get(15).AddNeighbour(17);
			tiles.get(15).AddNeighbour(20);

			tiles.get(16).AddNeighbour(13);
			tiles.get(16).AddNeighbour(16);
			tiles.get(16).AddNeighbour(18);
			tiles.get(16).AddNeighbour(20);

			tiles.get(17).AddNeighbour(11);
			tiles.get(17).AddNeighbour(12);
			tiles.get(17).AddNeighbour(17);
			tiles.get(17).AddNeighbour(19);
			tiles.get(17).AddNeighbour(20);

			tiles.get(18).AddNeighbour(11);
			tiles.get(18).AddNeighbour(18);
			tiles.get(18).AddNeighbour(20);
			tiles.get(18).AddNeighbour(23);
			tiles.get(18).AddNeighbour(24);

			tiles.get(19).AddNeighbour(16);
			tiles.get(19).AddNeighbour(17);
			tiles.get(19).AddNeighbour(18);
			tiles.get(19).AddNeighbour(19);
			tiles.get(19).AddNeighbour(21);
			tiles.get(19).AddNeighbour(22);
			tiles.get(19).AddNeighbour(23);
			
			tiles.get(20).AddNeighbour(20);
			tiles.get(20).AddNeighbour(22);
			tiles.get(20).AddNeighbour(36);

			tiles.get(21).AddNeighbour(20);
			tiles.get(21).AddNeighbour(21);
			tiles.get(21).AddNeighbour(23);
			tiles.get(21).AddNeighbour(35);

			tiles.get(22).AddNeighbour(19);
			tiles.get(22).AddNeighbour(20);
			tiles.get(22).AddNeighbour(22);
			tiles.get(22).AddNeighbour(24);
			tiles.get(22).AddNeighbour(34);

			tiles.get(23).AddNeighbour(11);
			tiles.get(23).AddNeighbour(19);
			tiles.get(23).AddNeighbour(23);
			tiles.get(23).AddNeighbour(25);
			tiles.get(23).AddNeighbour(26);
			tiles.get(23).AddNeighbour(27);
			tiles.get(23).AddNeighbour(32);
			tiles.get(23).AddNeighbour(33);
			tiles.get(23).AddNeighbour(34);

			tiles.get(24).AddNeighbour(10);
			tiles.get(24).AddNeighbour(24);
			tiles.get(24).AddNeighbour(26);

			tiles.get(25).AddNeighbour(25);
			tiles.get(25).AddNeighbour(24);
			tiles.get(25).AddNeighbour(27);

			tiles.get(26).AddNeighbour(26);
			tiles.get(26).AddNeighbour(24);
			tiles.get(26).AddNeighbour(28);
			tiles.get(26).AddNeighbour(32);

			tiles.get(27).AddNeighbour(27);
			tiles.get(27).AddNeighbour(29);
			tiles.get(27).AddNeighbour(31);
			
			tiles.get(28).AddNeighbour(28);
			tiles.get(28).AddNeighbour(30);
			
			tiles.get(29).AddNeighbour(29);
			tiles.get(29).AddNeighbour(31);
			tiles.get(29).AddNeighbour(41);
			
			tiles.get(30).AddNeighbour(28);
			tiles.get(30).AddNeighbour(32);
			tiles.get(30).AddNeighbour(30);
			tiles.get(30).AddNeighbour(41);

			tiles.get(31).AddNeighbour(24);
			tiles.get(31).AddNeighbour(27);
			tiles.get(31).AddNeighbour(31);
			tiles.get(31).AddNeighbour(33);
			tiles.get(31).AddNeighbour(41);

			tiles.get(32).AddNeighbour(24);
			tiles.get(32).AddNeighbour(32);
			tiles.get(32).AddNeighbour(34);
			tiles.get(32).AddNeighbour(39);
			tiles.get(32).AddNeighbour(41);

			tiles.get(33).AddNeighbour(24);
			tiles.get(33).AddNeighbour(23);
			tiles.get(33).AddNeighbour(33);
			tiles.get(33).AddNeighbour(35);

			tiles.get(34).AddNeighbour(22);
			tiles.get(34).AddNeighbour(34);
			tiles.get(34).AddNeighbour(36);
			tiles.get(34).AddNeighbour(38);
			tiles.get(34).AddNeighbour(39);
			
			tiles.get(35).AddNeighbour(21);
			tiles.get(35).AddNeighbour(35);
			tiles.get(35).AddNeighbour(37);
			
			tiles.get(36).AddNeighbour(36);
			tiles.get(36).AddNeighbour(38);

			tiles.get(37).AddNeighbour(35);
			tiles.get(37).AddNeighbour(37);
			tiles.get(37).AddNeighbour(39);
			tiles.get(37).AddNeighbour(40);
			
			tiles.get(38).AddNeighbour(33);
			tiles.get(38).AddNeighbour(35);
			tiles.get(38).AddNeighbour(38);
			tiles.get(38).AddNeighbour(40);
			tiles.get(38).AddNeighbour(41);
			
			tiles.get(39).AddNeighbour(38);
			tiles.get(39).AddNeighbour(39);
			tiles.get(39).AddNeighbour(41);
			tiles.get(39).AddNeighbour(42);

			tiles.get(40).AddNeighbour(30);
			tiles.get(40).AddNeighbour(31);
			tiles.get(40).AddNeighbour(32);
			tiles.get(40).AddNeighbour(33);
			tiles.get(40).AddNeighbour(39);
			tiles.get(40).AddNeighbour(40);
			tiles.get(40).AddNeighbour(42);

			tiles.get(41).AddNeighbour(40);
			tiles.get(41).AddNeighbour(41);
			
			Orangutan o1 = new Orangutan();		//orángután létrehozása és a pályára helyezése
			floor.setOrangutan1(o1);
			tiles.get(2).setElement(o1);
			
			Orangutan o2 = new Orangutan();		// mégegy orángután létrehozása és a pályára helyezése
			floor.setOrangutan2(o2);
			tiles.get(34).setElement(o2);
			
			Entrance ent = new Entrance(tiles.get(2));		//bejárat létrehozása és a pályára helyezése
			tiles.get(2).setElement(ent);
			floor.setEntranceTile(tiles.get(2));
			
			Exit ex = new Exit();			//kijárat létrehozása és a pályára helyezése
			tiles.get(40).setElement(ex);
			
			
			ChocolateAutomat ca1 = new ChocolateAutomat();		//csokiautomata létrehozása és a pályára helyezése
			tiles.get(19).setElement(ca1);
			
			ArmChair ac1 = new ArmChair();		//fotel létrehozása és a pályára helyezése
			tiles.get(36).setElement(ac1);
			
			SlotMachine sm1 = new SlotMachine();	//játékgép létrehozása és a pályára helyezése
			tiles.get(23).setElement(sm1);
			
			Wardrobe wa1 = new Wardrobe();	//szekrény létrehozása és a pályára helyezése
			wa1.setPersonalNumber(1);
			tiles.get(14).setElement(wa1);
			tiles.get(14).setHasWardrobe(true);
			floor.addWardrobe(wa1);
			
			Wardrobe wa2 = new Wardrobe();	//szekrény létrehozása és a pályára helyezése
			wa2.setPersonalNumber(2);
			tiles.get(41).setElement(wa2);
			tiles.get(41).setHasWardrobe(true);
			floor.addWardrobe(wa2);
			
			ScaryPanda sp = new ScaryPanda();	//scaryPanda létrehozása és a pályára helyezése
			sp.setTile(tiles.get(8));
			tiles.get(8).setElement(sp);
			floor.addPanda(sp);
			
			LazyPanda lp = new LazyPanda();	//lazyPanda létrehozása és a pályára helyezése
			lp.setTile(tiles.get(17));
			tiles.get(17).setElement(lp);
			floor.addPanda(lp);
			
			HoppperPanda hp = new HoppperPanda();	//hopperPanda létrehozása és a pályára helyezése
			hp.setTile(tiles.get(24));
			tiles.get(24).setElement(hp);
			floor.addPanda(hp);
			
			ScaryPanda sp2 = new ScaryPanda();	//oscaryPanda létrehozása és a pályára helyezése
			sp2.setTile(tiles.get(29));
			tiles.get(29).setElement(sp2);
			floor.addPanda(sp2);
			
			LazyPanda lp2 = new LazyPanda();	//lazyPanda létrehozása és a pályára helyezése
			lp2.setTile(tiles.get(30));
			tiles.get(30).setElement(lp2);
			floor.addPanda(lp2);
			
			HoppperPanda hp2 = new HoppperPanda();	//hopperPanda létrehozása és a pályára helyezése
			hp2.setTile(tiles.get(35));
			tiles.get(35).setElement(hp2);
			floor.addPanda(hp2);
			
			//Az elemek léptethetőségének beállítása
			
			floor.setTiles(tiles);
			task.addSteppable(sp);
			task.addSteppable(hp);
			task.addSteppable(lp);
			task.addSteppable(sp2);
			task.addSteppable(lp2);
			task.addSteppable(hp2);
			task.addSteppable(ca1);
			task.addSteppable(sm1);
			task.addSteppable(ac1);
			task.addSteppable(o2);
			timer.schedule(task, 20, 10);
			

		}
	
	
	//A program végén kiírja a játék eredményét
	public static void infoBox(String infoMessage, String titleBar, int number)
    {
        JOptionPane.showMessageDialog(null,"Ennyi pandat fogtal el: " + number, "Jatek vege", JOptionPane.INFORMATION_MESSAGE);
    }

	}
