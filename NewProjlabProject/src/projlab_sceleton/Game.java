package projlab_sceleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

			floor = new Floor();
			List<Tile> tiles = new ArrayList<Tile>();
			Tile tile = new Tile();
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					tile.setX(i);
					tile.setY(j);
					tiles.add(tile);
				}
				
			}
			floor.setTiles(tiles);
			
			
			
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
					try
					{
						
						
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_13.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br19 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("HopperPanda"))
						{
							Tile pandatile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp = new HoppperPanda();
							pandatile.setElement(hp);
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("SlotMachine"))
						{
							Tile smtile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							SlotMachine sm = new SlotMachine();
							smtile.setElement(sm);
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("movePanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						br19.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					break;
					
					
				case 14:
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_19.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br19 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("HopperPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("ChocolateAutomat"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("movePanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						br19.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					break;
					
				case 15:
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_19.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br19 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("HopperPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("Orangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("moveOrangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						br19.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}

					break;
					
				case 16:
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_19.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br19 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3, line4;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("HopperPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("LazyPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("Orangutan"))
						{
							
						}
						line4 = br19.readLine();
						String[] cmd4 = line4.split(" ");
						if(cmd3[0].equals("moveOrangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						br19.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}

					break;
					
				case 17:
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_19.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br19 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3, line4;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("HopperPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("Orangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("Orangutan"))
						{
							
						}
						line4 = br19.readLine();
						String[] cmd4 = line4.split(" ");
						if(cmd3[0].equals("moveOrangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						br19.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}

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
