package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game {

	public static int usecase;
	public static Floor floor = new Floor();
	
	public static void main(String[] args) {
		
		
		
		while(true) {
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("");
			System.out.println("Melyik Use - case-t akarod kiprobalni?");
			
			
			InputStreamReader isr = new InputStreamReader(System.in);
			try {
				BufferedReader br = new BufferedReader(isr);
				String number = br.readLine();
				
				if(number == "exit")
					System.exit(0);
				
				usecase = Integer.parseInt(number);
				
				switch(usecase) {
				case 1:
					//System.out.println("1-est irtal be");
					Orangutan o1 = new Orangutan();
					Tile nextTile1 = new Tile();
					Tile tile1 = new Tile();
					o1.move(nextTile1);
					tile1.remove(o1);
					nextTile1.setElement(o1);
					break;
				case 2:
					Orangutan o2 = new Orangutan();
					WeakTile nextTile2 = new WeakTile();
					Tile tile2 = new Tile();
					int lifeOfWeakTile;
					BufferedReader br1 = new BufferedReader(isr);
					String input1 = br1.readLine();
					System.out.println("Mennyi élete van a csempének?");
					lifeOfWeakTile = Integer.parseInt(input1);
					if (lifeOfWeakTile > 20) {
						o2.die();
						break;
					}
					o2.move(nextTile2);
					tile2.remove(o2);
					nextTile2.setElement(o2);
					nextTile2.incraseCounter();
					
					break;
				case 3:
					Orangutan o3 = new Orangutan();
					WeakTile nextTile3 = new WeakTile();
					Tile tile3 = new Tile();
					o3.move(nextTile3);
					tile3.remove(o3);
					nextTile3.setElement(o3);
					o3.die();
					break;
				case 4:
					Wardrobe w4 = new Wardrobe();
					Orangutan o4 = new Orangutan();
					Wardrobe nextWardrobe4 = new Wardrobe();
					Tile tile4 = new Tile();
					w4.collide(o4);
					tile4 = nextWardrobe4.getTile();
					o4.move(tile4);
					
					break;
				case 5:
					Wardrobe w5 = new Wardrobe();
					Panda p5 = new Panda();
					Wardrobe nextWardrobe5 = new Wardrobe();
					p5.collide(p5);
					Tile tile5 = new Tile();
					tile5 = nextWardrobe5.getTile();
					p5.move(tile5);
					break;
				case 6:
					Panda p6 = new Panda();
				    Tile nextTile6 = new Tile();
					Tile tile6 = new Tile();
					p6.setTile(tile6);
					p6.move(nextTile6);
					break;
				case 7:
					Panda p7 = new Panda();
				    Tile nextTile7 = new Tile();
					Tile tile7 = new Tile();
					p7.setTile(tile7);
					p7.move(nextTile7);
					break;
				case 8:
					Orangutan o8 = new Orangutan();
					Panda p8 = new Panda();
					p8.collide(o8);
					break;
				case 9: /*a szekvenciába nem kell egy o: Orangutan is? */
					Orangutan o9 = new Orangutan();
					Tile t9 = new Tile();
					ArmChair ac9 = new ArmChair();
					t9.setElement(ac9); //a szék a t9-es csempén van.
					o9.move(t9); 		//megpróbál rálépni az orángután, de sikertelenül
					break;
				case 10:
					Orangutan o10 = new Orangutan();
					Tile exitTile = new Tile();
					Exit exit = new Exit();
					exitTile.setElement(exit);
					Panda p10 = new Panda();
					p10.collide(o10);
					Panda p11 = new Panda();
					p11.collide(o10);
					Panda p12 = new Panda();
					p12.collide(o10);
					
					break;
				case 11:
					;
					break;
				case 12:
					;
					break;
				case 13:
					;
					break;

				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
