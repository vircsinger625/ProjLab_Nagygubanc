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

		// TESZTEK
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
			System.out.println("28 - Orangutan steps on ChocolateAutomat");
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

				// 7 - Panda collide with Panda
				case 7:
					try {
						// Input
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_7.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br19 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						if (cmd1[0].equals("HopperPanda")) {
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("HopperPanda")) {
							Tile panda2tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp2 = new HoppperPanda();
							hp2.setId(Integer.parseInt(cmd1[3]));
							panda2tile.setElement(hp2);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							Panda panda = floor.getPandaById(Integer.parseInt(cmd3[1]));
							panda.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_7.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println(
									"A teszt sikertelen: a panda elmozdult, olyan csempere lepett, amin masik panda all.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// 8 - Panda collide with Orangutan
				case 8:
					try {
						// Input
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_8.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br19 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;

						// 1HopperPanda
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						if (cmd1[0].equals("HopperPanda")) {
							Tile pandatile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							pandatile.setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Orangutan
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {
							Tile orangutantile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd1[3]));
							orangutantile.setElement(o);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2movePanda
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							Panda panda = floor.getPandaById(Integer.parseInt(cmd3[1]));
							panda.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_8.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println(
									"A teszt sikertelen: a panda elmozdult, olyan csempere lepett, amin orangutan all.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// 9 - Panda steps into Wardrobe
				case 9:
					try {
						// Input
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_9.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br19 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4, line5;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						// 1HopperPanda
						if (cmd1[0].equals("HopperPanda")) {
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Wardrobe
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Wardrobe")) {
							Tile wardrobe1_tile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Wardrobe w1 = new Wardrobe();
							w1.setId(Integer.parseInt(cmd2[3]));
							wardrobe1_tile.setElement(w1);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3Wardrobe
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Wardrobe")) {

							Tile wardrobe2_tile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Wardrobe w2 = new Wardrobe();
							w2.setId(Integer.parseInt(cmd2[3]));
							wardrobe2_tile.setElement(w2);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 4movePanda
						line4 = br19.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("movePanda")) {
							Panda panda = floor.getPandaById(Integer.parseInt(cmd4[1]));
							panda.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 5movePanda
						line5 = br19.readLine();
						String[] cmd5 = line5.split(" ");
						if (cmd5[0].equals("movePanda")) {
							Panda panda = floor.getPandaById(Integer.parseInt(cmd5[1]));
							panda.move(Integer.parseInt(cmd5[2]), Integer.parseInt(cmd5[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_9.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda belépett a szekrénybe, majd teleportált.");
						} else {
							writer.println("A teszt sikertelen: a panda helyben maradt.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// 10 - Panda steps on Exit
				case 10:
					try {
						// Input
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_10.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br19 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4;

						// 1HopperPanda
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						if (cmd1[0].equals("HopperPanda")) {
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Exit
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Exit")) {
							Exit ex = new Exit();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ex); // ?????
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3Entrance
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Entrance")) {
							Tile entrance_tile = floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2]));
							Entrance en = new Entrance(entrance_tile);
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(en); // ?????

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 4movePanda
						line4 = br19.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("movePanda")) {
							Panda panda = floor.getPandaById(Integer.parseInt(cmd4[1]));
							panda.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_10.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: a panda elmozdult, rálépett a kijáratra.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// 11 - Panda steps on Entrance
				case 11:
					try {
						// Input
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_11.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br19 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4;

						// 1HopperPanda
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						if (cmd1[0].equals("HopperPanda")) {
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Exit
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Exit")) {
							Exit ex = new Exit();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ex); // ?????
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3Entrance
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Entrance")) {
							Tile entrance_tile = floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2]));
							Entrance en = new Entrance(entrance_tile);
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(en); // ?????

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 4movePanda
						line4 = br19.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("movePanda")) {
							Panda panda = floor.getPandaById(Integer.parseInt(cmd4[1]));
							panda.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_11.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: a panda elmozdult, rálépett a bejáratra.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// 12 - Panda collide with ArmChair
				case 12:
					try {
						// Input
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_12.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br19 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						// 1HopperPanda
						if (cmd1[0].equals("HopperPanda")) {
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// ArmChair
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ArmChair")) {
							ArmChair ac = new ArmChair();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ac);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3movePanda
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							Panda panda = floor.getPandaById(Integer.parseInt(cmd3[1]));
							panda.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_12.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println(
									"A teszt sikertelen: az uggros panda elmozdult, olyan csempere lepett, amin fotel all.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				case 13:
					try {

						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_13.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br13 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br13.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line2 = br13.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("SlotMachine")) {

							SlotMachine sm = new SlotMachine();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(sm);

						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line3 = br13.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}
						br13.close();

						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: a panda elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 14:
					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_14.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br14 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br14.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {

							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line2 = br14.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ChocolateAutomat")) {

							ChocolateAutomat ca = new ChocolateAutomat();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ca);

						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line3 = br14.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {
							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}
						br14.close();

						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: a panda elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 15:
					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_15.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br15 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br15.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {

							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);

						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line2 = br15.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line3 = br15.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {
							floor.getOrangutan1().move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}
						br15.close();
						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd1[3]));
						Orangutan outo = floor.getOrangutan1();
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							if (outo.getTile().getX() == Integer.parseInt(cmd2[1])
									&& outo.getTile().getY() == Integer.parseInt(cmd2[2])) {
								writer.println("A teszt sikeres: a panda Ă©s az orangutan helyet cserelt.");
							}
						} else {
							writer.println("A teszt sikertelen: a panda  Ă©s az orangutan nem cserelt helyet.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 16:
					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_16.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br16 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4;
						line1 = br16.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line2 = br16.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("LazyPanda")) {
							LazyPanda lp = new LazyPanda();
							lp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(lp);
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line3 = br16.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd2[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}
						line4 = br16.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("moveOrangutan")) {
							floor.getOrangutan1().move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}
						br16.close();

						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Panda outp1 = floor.getPandaById(Integer.parseInt(cmd1[3]));
						Panda outp2 = floor.getPandaById(Integer.parseInt(cmd2[3]));
						Orangutan outo = floor.getOrangutan1();
						if (outp1.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp1.getTile().getY() == Integer.parseInt(cmd1[2])) {
							if (outp2.getTile().getX() == Integer.parseInt(cmd2[1])
									&& outp2.getTile().getY() == Integer.parseInt(cmd2[2])) {
								if (outo.getTile().getX() == Integer.parseInt(cmd3[1])
										&& outo.getTile().getY() == Integer.parseInt(cmd3[2])) {
									writer.println("A teszt sikeres: az orangutan hĂşzta a pandakat.");
								}

							}
						} else {
							writer.println("A teszt sikertelen: az orangutan nem hĂşzta a pandakat.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 17:
					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_17.txtâ�©");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br17 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4;
						line1 = br17.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line2 = br17.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}

						line3 = br17.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(o);
							floor.setOrangutan2(o);
						}
						line4 = br17.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("moveOrangutan")) {
							floor.getOrangutan2().move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelĹ‘ paramĂ©terek!");
							break;
						}
						br17.close();

						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Orangutan outo1 = floor.getOrangutan1();
						Orangutan outo2 = floor.getOrangutan2();
						if (outo1.getTile().getX() == Integer.parseInt(cmd2[1])
								&& outo1.getTile().getY() == Integer.parseInt(cmd2[2])) {
							if (outo2.getTile().getX() == Integer.parseInt(cmd3[1])
									&& outo2.getTile().getY() == Integer.parseInt(cmd3[2])) {
								writer.println("A teszt sikeres: az orangutan ellopta a pandakat.");
							}

						} else {
							writer.println("A teszt sikertelen: az orangutan nem lopta el a pandakat.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 18:
					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_18.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br18 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4;
						line1 = br18.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br18.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ScaryPanda")) {
							ScaryPanda hp = new ScaryPanda();
							hp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line3 = br18.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("stepArmChair")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd2[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line4 = br18.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("stepArmChair")) {
							floor.getOrangutan1().removeCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}
						br18.close();

						PrintWriter writer = new PrintWriter("output_13.txt", "ANSI");
						Orangutan outo = floor.getOrangutan1();
						if (outo.isHasCapturedPanda() == false) {
							writer.println("A teszt sikeres: az orĂˇngutĂˇn elengedte a pandakat.");
						} else {
							writer.println("A teszt sikertelen: az orĂˇngutĂˇn nem engedte el a pandakat.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// LazyPanda into ArmChair
				// kell mast csinalni a move-on kivul amikor meghivjuk a stepArmChair fuggvenyt?
				// mit kell olyankor az armchairrel csinalni?
				case 19:

					try {
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
						if (cmd1[0].equals("LazyPanda")) {
							LazyPanda lp = new LazyPanda();
							lp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(lp);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ArmChair")) {
							ArmChair ac = new ArmChair();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ac);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("stepArmChair")) {

							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd2[1]),
									Integer.parseInt(cmd2[2]));
							Tile t = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							floor.getPandaById(Integer.parseInt(cmd3[1])).reaction(InputEffect.sleepMessage, t);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}
						br19.close();

						PrintWriter writer = new PrintWriter("output_19.txt", "ANSI");
						LazyPanda outp = (LazyPanda) floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd2[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd2[2])) {
							writer.println("A teszt sikeres: a lazypanda beleült a fotelba.");
						} else {
							writer.println("A teszt sikertelen: a lazypanda nem ült bele a fotelba.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("19");
					break;

				// HopperPanda jumps
				// kiiratas ellenorzesnel hiba hogy az nem weakTile?
				case 20:

					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_20.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br20 = new BufferedReader(new FileReader(file));

						int tileLifeBeforeHop, tileLifeAfterHop;
						String line1, line2, line3;
						line1 = br20.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							tileLifeBeforeHop = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]))
									.getStepInCounter();
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br20.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ChocolateAutomat")) {
							ChocolateAutomat ca = new ChocolateAutomat();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ca);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line3 = br20.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("stepAutomat")) {
							WeakTile t = (WeakTile) floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							floor.getPandaById(Integer.parseInt(cmd3[1])).reaction(InputEffect.whistleMessage, t);
							tileLifeAfterHop = floor.getPandaById(Integer.parseInt(cmd3[1])).getTile()
									.getStepInCounter();
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}
						br20.close();

						PrintWriter writer = new PrintWriter("output_20.txt", "ANSI");
						if (tileLifeBeforeHop + 1 == tileLifeAfterHop) {
							writer.println("A teszt sikeres: a lazypanda beleült a fotelba.");
						} else {
							writer.println("A teszt sikertelen: a lazypanda nem ült bele a fotelba.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("20");
					break;

				// ScaryPanda release hands
				case 21:

					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_21.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br21 = new BufferedReader(new FileReader(file));

						String line0, line1, line2, line3, line4, line5;

						line1 = br21.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("ScaryPanda")) {
							ScaryPanda sp = new ScaryPanda();
							sp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br21.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("HopperPanda")) {
							ScaryPanda sp = new ScaryPanda();
							sp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line3 = br21.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("LazyPanda")) {
							ScaryPanda sp = new ScaryPanda();
							sp.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line0 = br21.readLine();
						String[] cmd0 = line0.split(" ");
						if (cmd0[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd0[3]));
							floor.getTile(Integer.parseInt(cmd0[1]), Integer.parseInt(cmd0[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd2[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd3[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line4 = br21.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("SlotMachine")) {
							SlotMachine sm = new SlotMachine();
							floor.getTile(Integer.parseInt(cmd4[1]), Integer.parseInt(cmd4[2])).setElement(sm);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line5 = br21.readLine();
						String[] cmd5 = line5.split(" ");
						if (cmd5[0].equals("stepSlotMachine")) {
							Tile t = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd1[2]));
							floor.getPandaById(Integer.parseInt(cmd1[3])).reaction(InputEffect.jingleMessage, t);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}
						br21.close();

						PrintWriter writer = new PrintWriter("output_21.txt", "ANSI");
						ScaryPanda outp = (ScaryPanda) floor.getPandaById(Integer.parseInt(cmd2[3]));
						if (!outp.isCaptured()) {
							writer.println("A teszt sikeres: a scaryPanda elengedte a kezeket.");
						} else {
							writer.println("A teszt sikertelen: a scaryPanda nem engedte el a kezeket.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("21");
					break;

				case 22:

					try {
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
						if (cmd1[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br22.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("moveOrangutan")) {
							floor.getOrangutan1().move(Integer.parseInt(cmd2[2]), Integer.parseInt(cmd2[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						PrintWriter writer = new PrintWriter("output_22.txt", "ANSI");
						Orangutan outo = floor.getOrangutan1();
						if (outo.getTile().getX() == Integer.parseInt(cmd2[2])
								&& outo.getTile().getY() == Integer.parseInt(cmd2[3])) {
							writer.println("A teszt sikeres: az orangutan ralepett a csempere.");
						} else {
							writer.println("A teszt sikertelen: az orangutan nem lepett ra a csempere.");
						}
						writer.close();

						br22.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("22");
					break;

				case 23:

					try {
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
						if (cmd1[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br23.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("WeakTile")) {
							
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line3 = br23.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {

						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}
						br23.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("23");
					break;

				case 24:

					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_24.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br24 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br24.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line2 = br24.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Entrance")) {
							//ide kéne valami?
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						line3 = br24.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {
							floor.getOrangutan1().move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelďż˝ paramďż˝terek!");
							break;
						}

						PrintWriter writer = new PrintWriter("output_24.txt", "ANSI");
						Orangutan outo = floor.getOrangutan1();
						if (outo.getTile().getX() == Integer.parseInt(cmd3[2])
								&& outo.getTile().getY() == Integer.parseInt(cmd3[3])) {
							writer.println("A teszt sikeres: az orangutan ralepett a bejarat csempere.");
						} else {
							writer.println("A teszt sikertelen: az orangutan nem lepett ra a bejarat csempere.");
						}
						writer.close();

						br24.close();
					} catch (IOException e) {
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
