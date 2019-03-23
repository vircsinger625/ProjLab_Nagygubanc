package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static int usecase;
	public static Floor floor = new Floor();

	public static void main(String[] args) {

		while (true) {
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("");
			System.out.println("Melyik Use - case-t akarod kiprobalni?");
			System.out.println("1  - OrangutanStepsOnTile");
			System.out.println("2  - OrangutanStepsOnWeakTile");
			System.out.println("3  - OrangutanStepsOnBrokenTile");
			System.out.println("4  - OrangutanStepsIntoWardrobe");
			System.out.println("5  - PandaStepsIntoWardrobe");
			System.out.println("6  - PandaStepsOnBrokenTile");
			System.out.println("7  - CapturedPandaStepsOnBrokenTile");
			System.out.println("8  - OrangutanCachesPanda");
			System.out.println("9  - OrangutanCollideWithThing");
			System.out.println("10 - OrangutanExit");
			System.out.println("11 - ScaryPandaGetsFrightened");
			System.out.println("12 - LazyPandaSleep");
			System.out.println("13 - HopperPandaJumps");
			System.out.println("------------------------------------------------------");

			InputStreamReader isr = new InputStreamReader(System.in);
			try {
				BufferedReader br = new BufferedReader(isr);
				String number = br.readLine();

				if (number.equals("exit")) {
					System.out.println("Tesztelés vége.");
					System.exit(0);
					
				}

				usecase = Integer.parseInt(number);

				switch (usecase) {
				case 1:
					System.out.println("1  - OrangutanStepsOnTile");
					Orangutan o1 = new Orangutan();
					Tile nextTile1 = new Tile();
					Tile tile1 = new Tile();
					o1.setTile(tile1);
					o1.move(nextTile1);

					break;
				case 2:
					System.out.println("2  - OrangutanStepsOnWeakTile");
					Orangutan o2 = new Orangutan();
					WeakTile nextTile2 = new WeakTile();
					Tile tile2 = new Tile();
					o2.setTile(tile2);
					o2.move(nextTile2);

					break;
				case 3:
					System.out.println("3  - OrangutanStepsOnBrokenTile");
					Orangutan o3 = new Orangutan();
					WeakTile nextTile3 = new WeakTile();
					Tile tile3 = new Tile();
					o3.setTile(tile3);
					o3.move(nextTile3);

					break;
				case 4:
					System.out.println("4  - OrangutanStepsIntoWardrobe");
					Wardrobe w4 = new Wardrobe();
					Orangutan o4 = new Orangutan();

					Tile tile4 = new Tile();
					o4.setTile(tile4);
					w4.collide(o4);

					break;
				case 5:
					System.out.println("5  - PandaStepsIntoWardrobe");
					Wardrobe w5 = new Wardrobe();
					Panda p5 = new Panda();

					Tile tile5 = new Tile();
					p5.setTile(tile5);
					w5.collide(p5);

					break;
				case 6:
					System.out.println("6  - PandaStepsOnBrokenTile");
					Panda p6 = new Panda();
					Tile nextTile6 = new Tile();
					Tile tile6 = new Tile();
					p6.setTile(tile6);
					p6.move(nextTile6);
					break;
				case 7:
					System.out.println("7  - CapturedPandaStepsOnBrokenTile");
					Panda p7 = new Panda();
					Tile nextTile7 = new Tile();
					Tile tile7 = new Tile();
					p7.setTile(tile7);
					p7.move(nextTile7);
					break;
				case 8:
					System.out.println("8  - OrangutanCachesPanda");
					Orangutan o8 = new Orangutan();
					Tile t8o = new Tile();
					o8.setTile(t8o);
					Panda p8 = new Panda();
					Tile t8p = new Tile();
					p8.setTile(t8p);
					p8.collide(o8);
					break;
				case 9:
					System.out.println("9  - OrangutanCollideWithThing");
					Orangutan o9 = new Orangutan();
					Tile t9 = new Tile();
					ArmChair ac9 = new ArmChair();
					t9.setElement(ac9); // a sz�k a t9-es csemp�n van.
					o9.move(t9); // megpr�b�l r�l�pni az or�ngut�n, de sikertelen�l
					break;
				case 10:
					System.out.println("10 - OrangutanExit");
					// System.out.println("*******Use-Case fel�p�t�se*******");
					/*
					 * Orangutan o10 = new Orangutan(); Tile t10 = new Tile(); o10.setTile(t10);
					 * 
					 * Panda p10 = new Panda(); // Pand ut�na... Tile t10p1 = new Tile();
					 * p10.setTile(t10p1); p10.collide(o10);
					 * 
					 * Panda p11 = new Panda(); Tile t10p2 = new Tile(); p11.setTile(t10p2);
					 * p11.collide(o10);
					 * 
					 * Panda p12 = new Panda(); Tile t10p3 = new Tile(); p12.setTile(t10p3);
					 * p12.collide(o10);
					 * 
					 * Tile exitTile = new Tile(); Exit exit = new Exit();
					 * exitTile.setElement(exit); Tile enterTile = new Tile();
					 * floor.setEntranceTile(enterTile);
					 * 
					 * System.out.println("*******Use-Case fel�p�t�s�nek v�ge*******");
					 * o10.move(exitTile); // Or�ngut�n a kij�ratra l�p
					 */

					Orangutan o = new Orangutan();
					Panda p1 = new Panda();
					Panda p2 = new Panda();
					Panda p3 = new Panda();

					Tile ot = new Tile();
					Tile pt1 = new Tile();
					Tile pt2 = new Tile();
					Tile pt3 = new Tile();

					Tile exitTile = new Tile();

					o.setTile(ot);
					p1.setTile(pt1);
					p2.setTile(pt2);
					p3.setTile(pt3);

					o.addCapturedPandas(p1);
					o.addCapturedPandas(p2);
					o.addCapturedPandas(p3);

					o.move(exitTile);

					break;
				case 11:
					System.out.println("11 - ScaryPandaGetsFrightened");
					ScaryPanda sp11 = new ScaryPanda();
					Orangutan o11 = new Orangutan();
					Tile smTile11 = new Tile();
					InputEffect ie11 = InputEffect.jingleMessage;										
					sp11.reaction(ie11, smTile11);
					break;
				case 12:
					System.out.println("12 - LazyPandaSleep");
					LazyPanda lp12 = new LazyPanda();
					Tile tile12 = new Tile();
					Tile acTile12 = new Tile();
					InputEffect ie12 = InputEffect.sleepMessage;					
					lp12.reaction(ie12, acTile12);
					break;
				case 13:
					System.out.println("13 - HopperPandaJumps");
					HoppperPanda hp13 = new HoppperPanda();
					Tile hpTile13 = new Tile();
					Tile caTile13 = new Tile();
					InputEffect ie13 = InputEffect.whistleMessage;					
					hp13.reaction(ie13,caTile13);
					break;

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
