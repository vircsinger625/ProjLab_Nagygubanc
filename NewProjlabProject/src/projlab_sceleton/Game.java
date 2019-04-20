package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static int usecase;
	public static Floor floor = new Floor();
	
public static void main(String[] args) {
		
	//TESZTEK
		while (true) {
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("");
			System.out.println("Melyik tesztesetet akarod kiprobalni?");
			System.out.println(" 1 - Orangutan steps on normal tile");
			System.out.println(" 2 - Orangutan steps on weak Tile ");
			System.out.println(" 3 - Orangutan steps on broken Tile");
			System.out.println(" 4 - Orangutan collide with Panda");
			System.out.println(" 5 - Orangutan collide with Orangutan");
			System.out.println(" 6 - Panda steps on broken tile");
			
			System.out.println(" 7 - Panda collide with Panda");
			System.out.println(" 8 - Panda collide with Orangutan");
			System.out.println(" 9 - Panda steps into Wardrobe");
			System.out.println("10 - Panda steps on Exit");
			System.out.println("11 - Panda steps on Enterance");
			System.out.println("12 - Panda collide with ArmChair");
			
			System.out.println("13 - Panda collide with SlothMachine");
			System.out.println("14 - Panda collide with ChocolateAutomat");
			System.out.println("15 - Orangutan pulls Panda");
			System.out.println("16 - Orangutan Pulls Pandas");
			System.out.println("17 - Orangutan steals from Orangutan");
			System.out.println("18 - Orangutan unleash Panda");
			
			System.out.println("19 - LazyPanda steps to ArmChair");
			System.out.println("20 - HopperPanda jumps");
			System.out.println("21 - ScaryPanda release hands");
			System.out.println("22 - Orangutan steps on empty Tile");
			System.out.println("23 - Orangutan steps on empty broken Tile");
			System.out.println("24 - Orangutan steps on Enterance");
			
			System.out.println("25 - Orangutan steps on Exit alone");
			System.out.println("26 - Orangutan steps on Exit with pandas");
			System.out.println("27 - Orangutan steps on Armchair");
			System.out.println("28 - Orangutan steps on Cocholate Automat");
			System.out.println("29 - Orangutan steps on SlotMachine");
			System.out.println("30 - Orangutan steps on Wardrobe");

			System.out.println("------------------------------------------------------");

			InputStreamReader isr = new InputStreamReader(System.in);
			try {
				BufferedReader br = new BufferedReader(isr);
				String number = br.readLine();

				if (number.equals("exit")) {
					System.out.println("Teszteszteles vege!");
					System.exit(0);
					
				}

				usecase = Integer.parseInt(number);

				switch (usecase) {
				
				case 1:
					System.out.println("1");
					break;
					
				case 2:
					System.out.println("2");
					break;
					
				case 3:
					System.out.println("3");
					break;
					
				case 4:
					System.out.println("4");
					break;
					
				case 5:
					System.out.println("5");
					break;
					
				case 6:
					System.out.println("6");
					break;
					
				case 7:
					System.out.println("7");
					break;
					
				case 8:
					System.out.println("8");
					break;
					
				case 9:
					System.out.println("9");
					break;
					
				case 10:
					System.out.println("10");
					break;
					
				case 11:
					System.out.println("11");
					break;
					
				case 12:
					System.out.println("12");
					break;
					
				case 13:
					System.out.println("13");
					break;
					
				case 14:
					System.out.println("14");
					break;
					
				case 15:
					System.out.println("15");
					break;
					
				case 16:
					System.out.println("16");
					break;
					
				case 17:
					System.out.println("17");
					break;
					
				case 18:
					System.out.println("18");
					break;
					
				case 19:
					System.out.println("19");
					break;
					
				case 20:
					System.out.println("20");
					break;
					
				case 21:
					System.out.println("21");
					break;
					
				case 22:
					System.out.println("22");
					break;
					
				case 23:
					System.out.println("23");
					break;
					
				case 24:
					System.out.println("24");
					break;
					
				case 25:
					System.out.println("26");
					break;
					
				case 26:
					System.out.println("26");
					break;
					
				case 27:
					System.out.println("27");
					break;
					
				case 28:
					System.out.println("28");
					break;
					
				case 29:
					System.out.println("29");
					break;
					
				case 30:
					System.out.println("30");
					break;

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
