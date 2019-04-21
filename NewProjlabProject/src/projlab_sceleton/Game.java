package projlab_sceleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
							hp.setId(Integer.parseInt(cmd1[3]));
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
							
							Panda panda = floor.getPandaById(Integer.parseInt(cmd3[1]));
							panda.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
						}
						br19.close();
						
						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1]) && outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						}else {
							writer.println("A teszt sikertelen: a panda elmozdult.");
						}
						writer.close();
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
						File file = new File(path + "\\input_14.txt");
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
						File file = new File(path + "\\input_15.txt");
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
						else
						{
							System.out.println("Nem a tesztesethez megfelelő paraméterek!");
							break;
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
						if(cmd1[0].equals("LazyPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("ArmChair"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("stepArmChair"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						br19.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("19");
					break;
					
				case 20:
					
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_20.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br20 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3;
						line1 = br20.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("HopperPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line2 = br20.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("ChocolateAutomat"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}

						line3 = br20.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("stepAutomat"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						br20.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("20");
					break;
					
				case 21:
					
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_21.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br21 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3, line4, line5;
						line1 = br21.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("ScaryPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line2 = br21.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("HopperPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}

						line3 = br21.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("LazyPanda"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line4 = br21.readLine();
						String[] cmd4 = line4.split(" ");
						if(cmd4[0].equals("SlotMachine"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line5 = br21.readLine();
						String[] cmd5 = line5.split(" ");
						if(cmd5[0].equals("stepSlotMachine"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						br21.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("21");
					break;
					
				case 22:
					
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_22.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br22 = new BufferedReader(new FileReader(file));
						
						String line1, line2;
						line1 = br22.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("Orangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line2 = br22.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("moveOrangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}

						br22.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("22");
					break;
					
				case 23:
					
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_23.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br23 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3;
						line1 = br23.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("Orangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line2 = br23.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("WeakTile"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}

						line3 = br23.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("moveOrangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						br23.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("23");
					break;
					
				case 24:
					
					try
					{
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_24.txt");
						if (!file.exists()) {
					          System.out.println("System couldnt file source file!");
					          System.out.println("Application will explode");
					    }
						BufferedReader br24 = new BufferedReader(new FileReader(file));
						
						String line1, line2, line3, line4;
						line1 = br24.readLine();
						String[] cmd1 = line1.split(" ");
						if(cmd1[0].equals("Orangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line2 = br24.readLine();
						String[] cmd2 = line2.split(" ");
						if(cmd2[0].equals("Exit"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}

						line3 = br24.readLine();
						String[] cmd3 = line3.split(" ");
						if(cmd3[0].equals("Entrance"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						line4 = br24.readLine();
						String[] cmd4 = line4.split(" ");
						if(cmd4[0].equals("moveOrangutan"))
						{
							
						}
						else
						{
							System.out.println("Nem a tesztesethez megfelel� param�terek!");
							break;
						}
						
						br24.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					
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
