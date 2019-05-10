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
	public static Window window = new Window();

	public static void main(String[] args) {

			floor = new Floor();
			List<Tile> tiles = new ArrayList<Tile>();
			
			for (int i = 1; i <= 42; i++) {
				Tile tile = new Tile();
				tile.setId(i);
				tile.setX(DrawRect.xcoord[i-1]);
				tile.setY(DrawRect.ycoord[i-1]);
				tiles.add(tile);
			}
			tiles.get(0).AddNeighbour(2);
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
			tiles.get(20).AddNeighbour(36);

			tiles.get(21).AddNeighbour(20);
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
			
			tiles.get(29).AddNeighbour(31);
			tiles.get(29).AddNeighbour(41);
			
			tiles.get(30).AddNeighbour(28);
			tiles.get(30).AddNeighbour(30);
			tiles.get(30).AddNeighbour(32);
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
					try {
						String path = System.getProperty("user.dir");		//Input
						File file = new File(path + "\\input_1.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br1 = new BufferedReader(new FileReader(file));

						String line1, line2;			//Input fajl sorai, ebbe olvasunk be
						line1 = br1.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) {		//1.sor, 1.szo: Orangutan

							Orangutan o = new Orangutan();		//Orangutan letrehozasa
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);	//a fájl 1.soranak 2. es 3.strinjere hivatkozva adjuk meg a csempet.
							floor.setOrangutan1(o);		
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br1.readLine();		//2.sor, 1.szo: moveOrangutan
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("moveOrangutan")) {
							floor.getOrangutanById(Integer.parseInt(cmd2[1])).move(Integer.parseInt(cmd2[2]), //orangutan mozgatasa
									Integer.parseInt(cmd2[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						} 

						br1.close();

						PrintWriter writer = new PrintWriter("output_1.txt", "utf-8");		//fajl kiirasa
						Orangutan outp = floor.getOrangutanById(Integer.parseInt(cmd2[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd2[2])
								&& outp.getTile().getY() == Integer.parseInt(cmd2[3])) {
							writer.println("A teszt sikeres: az orangutan elmozdult.");		
						} else {
							writer.println("A teszt sikertelen: az orangutan helyben maradt.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;
				case 2:
					try {
						String path = System.getProperty("user.dir");		//Input
						File file = new File(path + "\\input_2.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br2 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;		//Input fajl sorai
						line1 = br2.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) {

							Orangutan o = new Orangutan();		//Orangutan letrehozasa
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);		//orangutan hozaadasa a palyahoz
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br2.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("WeakTile")) {

							WeakTile wa = new WeakTile();		//gyenge csempe letrehozasa
							wa.setX(Integer.parseInt(cmd2[1]));
							wa.setY(Integer.parseInt(cmd2[2]));

							wa.setStepInCounter(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							for (int i = 0; i < 5; i++) {					//a palya megfelelo csmepejet gyenge csempere csereljuk
								for (int j = 0; j < 5; j++) {
									Tile tmp = floor.getTile(i, j);
									if (tmp.getX() == Integer.parseInt(cmd2[1])
											&& tmp.getY() == Integer.parseInt(cmd2[2])) {
										int tid = tmp.getId();
										List<Tile> tiles2 = new ArrayList<Tile>();
										tiles2 = floor.getTiles();
										tiles2.remove(tid);
										tiles2.set(tid, wa);
										floor.setTiles(tiles2);
										break;
									}
								}

							}

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br2.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {
							floor.getOrangutanById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),  //orangutan mozgatasa gyenge csempere
									Integer.parseInt(cmd3[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br2.close();

						PrintWriter writer = new PrintWriter("output_2.txt", "utf-8");		//teszt eredmenyenek kiirasa fajlba
						Orangutan outp = floor.getOrangutanById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd3[2])
								&& outp.getTile().getY() == Integer.parseInt(cmd3[3])) {
							writer.println("A teszt sikeres: az orangutan elmozdult.");
						} else {
							writer.println("A teszt sikertelen: az orangutan helyben maradt.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 3:
					try {
						String path = System.getProperty("user.dir");		//Input
						File file = new File(path + "\\input_3.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br3 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br3.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) {

							Orangutan o = new Orangutan();			//Orangutan letrehozasa
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);	//orangutan-t rarakjuk egy csempere
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br3.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("WeakTile")) {

							WeakTile wa = new WeakTile();		//weak tile letrehozasa es koordinatainak megadasa
							wa.setX(Integer.parseInt(cmd2[1]));
							wa.setY(Integer.parseInt(cmd2[2]));

							wa.setStepInCounter(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							for (int i = 0; i < 5; i++) {					//a palya megfelelo csmepejet gyenge csempere csereljuk (mivel erteke nagyobb mint 20 ezert torott a csempe)
								for (int j = 0; j < 5; j++) {
									Tile tmp = floor.getTile(i, j);
									if (tmp.getX() == Integer.parseInt(cmd2[1])
											&& tmp.getY() == Integer.parseInt(cmd2[2])) {
										int tid = tmp.getId();
										List<Tile> tiles2 = new ArrayList<Tile>();
										tiles2 = floor.getTiles();
										tiles2.remove(tid);
										tiles2.set(tid, wa);
										floor.setTiles(tiles2);
										break;
									}
								}
							}

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br3.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {
							floor.getOrangutanById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]), //orangutan mozgatasa torott csempere
									Integer.parseInt(cmd3[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br3.close();

						PrintWriter writer = new PrintWriter("output_3.txt", "utf-8"); //fajlba kiiras
						if (floor.getOrangutanById(Integer.parseInt(cmd1[3])) == null) {
							writer.println("A teszt sikeres: az orangutan meghalt.");
						} else {
							writer.println("A teszt sikertelen: az orangutan nem halt meg.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 4:

					try {
						String path = System.getProperty("user.dir");			//Input 
						File file = new File(path + "\\input_4.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br4 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br4.readLine();
						String[] cmd1 = line1.split(" ");

						if (cmd1[0].equals("Orangutan")) {

							Orangutan o = new Orangutan();			//orangutan letrehozasa majd a megfelelo csempere helyezese
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);

							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br4.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("HopperPanda")) {

							HoppperPanda hp = new HoppperPanda();		//Hopperpanda letrehozasa majd a megfelelo csempere helyezese
							hp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(hp);
							floor.addPanda(hp);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br4.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {				//Orangutan mozgatasa a panda csempejere

							floor.getOrangutanById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br4.close();

						// Output
						PrintWriter writer = new PrintWriter("output_4.txt", "utf-8"); 		//fajlba kiiras
						Orangutan outp1 = floor.getOrangutanById(Integer.parseInt(cmd3[1]));
						Panda outp2 = floor.getPandaById(Integer.parseInt(cmd2[3]));
						if (outp1.getTile().getX() == Integer.parseInt(cmd3[2])
								&& outp1.getTile().getY() == Integer.parseInt(cmd3[3])
								&& outp2.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp2.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: az orangutan es a panda helyet csereltek.");
						} else {
							writer.println("A teszt sikertelen: az orangutan helyben maradt.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 5:
					try {
						String path = System.getProperty("user.dir");		//Input
						File file = new File(path + "\\input_5.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br5 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br5.readLine();
						String[] cmd1 = line1.split(" ");

						if (cmd1[0].equals("Orangutan")) {

							Orangutan o1 = new Orangutan();				//orangutan letrehozasa majd megfelelo csempere helyezese
							o1.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o1);
							floor.setOrangutan1(o1);				//hozzaadjuk a palyahoz az orangutant
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br5.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {

							Orangutan o2 = new Orangutan();			//orangutan letrehozasa majd megfelelo csempere helyezese
							o2.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(o2);

							floor.setOrangutan2(o2);				//hozzaadjuk a palyahoz az orangutant

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br5.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {				//orangutanok utkoztetese

							floor.getOrangutanById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br5.close();

						// Output
						PrintWriter writer = new PrintWriter("output_5.txt", "utf-8");
						Orangutan outp1 = floor.getOrangutanById(Integer.parseInt(cmd3[1]));

						if ((outp1.getTile().getX() == Integer.parseInt(cmd3[2])
								&& outp1.getTile().getY() == Integer.parseInt(cmd3[3]))) {
							writer.println("A teszt sikertelen: az orángutánok helyet cseréltek.");
						} else {
							writer.println("A teszt sikeres: az orangutanok helyben maradtak.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				case 6:
					try {
						String path = System.getProperty("user.dir");		//Input
						File file = new File(path + "\\input_6.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br6 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br6.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {

							HoppperPanda hp = new HoppperPanda();			//Hopperpanda létrehozasa majd a megfelelo csempere helyezese es a palyahoz adasa
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br6.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("WeakTile")) {

							WeakTile wa = new WeakTile();			//gyenge csempe letrehozasa es koordinatainak beallitasa
							wa.setX(Integer.parseInt(cmd2[1]));
							wa.setY(Integer.parseInt(cmd2[2]));

							wa.setStepInCounter(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							for (int i = 0; i < 5; i++) {				//a palya megfelelo csmepejet gyenge csempere csereljuk (mivel erteke nagyobb mint 20 ezert torott a csempe)
								for (int j = 0; j < 5; j++) {
									Tile tmp = floor.getTile(i, j);
									if (tmp.getX() == Integer.parseInt(cmd2[1])
											&& tmp.getY() == Integer.parseInt(cmd2[2])) {
										int tid = tmp.getId();
										List<Tile> tiles2 = new ArrayList<Tile>();
										tiles2 = floor.getTiles();
										tiles2.remove(tid);
										tiles2.set(tid, wa);
										floor.setTiles(tiles2);
										break;
									}
								}
							}

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br6.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {		//panda mozgatasa torott csempere
							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br6.close();

						PrintWriter writer = new PrintWriter("output_6.txt", "utf-8");		//fajlba kiiras
						if (floor.getPandaById(Integer.parseInt(cmd3[1])) == null) {
							writer.println("A teszt sikeres: a panda meghalt.");
						} else {
							writer.println("A teszt sikeres: a panda nem halt meg.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

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

						if (cmd1[0].equals("HopperPanda")) { //HopperPanda beolvasása esetén HopperPanda letrehozasa
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
							floor.addPanda(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("HopperPanda")) {  //HopperPanda beolvasasa esetén HopperPanda letrehozasa
							Tile panda2tile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							HoppperPanda hp2 = new HoppperPanda();
							hp2.setId(Integer.parseInt(cmd2[3]));
							panda2tile.setElement(hp2);
							floor.addPanda(hp2);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							Panda panda = floor.getPandaById(Integer.parseInt(cmd3[1])); //A beolvasott index szerinti panda mozgatas
							panda.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_7.txt", "utf-8");
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

						if (cmd1[0].equals("HopperPanda")) { //uggros panda letrehozasa
							Tile pandatile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							pandatile.setElement(hp);
							floor.addPanda(hp); //Hozzaadasa a palyahoz
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Orangutan
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {  //Orangutan letrehozasa 
							Tile orangutantile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd2[3]));
							orangutantile.setElement(o);
							floor.setOrangutan1(o);//Hozzaadasa a palyahoz

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2movePanda
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							Panda panda = floor.getPandaById(Integer.parseInt(cmd3[1])); 
							panda.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3])); //Panda leptetése a beolvasott koordinatakra
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_8.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd1[3]));
						if (       outp.getTile().getX() == Integer.parseInt(cmd2[1]) //Panda vegso helye megegyezik e az orángután eredeti helyevel
								&& outp.getTile().getY() == Integer.parseInt(cmd2[2])
								&& floor.getOrangutan1().getTile().getX() == Integer.parseInt(cmd1[1]) //Orangutan vegso helye megegyezik e a panda eredeti helyevel
								&& floor.getOrangutan1().getTile().getY() == Integer.parseInt(cmd1[2]))

						{
							writer.println("A teszt sikeres: helyetcserereltek.");
						} else {
							writer.println("A teszt sikertelen: nem csereltek helyet.");
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

						String line1, line2, line3, line4, line5; //5sorra szamitunk a beolvasott txt fajlbol.
						line1 = br19.readLine();
						String[] cmd1 = line1.split(" ");

						// 1HopperPanda
						if (cmd1[0].equals("HopperPanda")) {  //HopperPanda beolvasása esetén HopperPanda létrehozása
							Tile panda1tile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							HoppperPanda hp1 = new HoppperPanda();
							hp1.setId(Integer.parseInt(cmd1[3]));
							panda1tile.setElement(hp1);
							floor.addPanda(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Wardrobe
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Wardrobe")) {//Szekreny letrehozasa, elhelyezése a palyan
							Tile wardrobe1_tile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Wardrobe w1 = new Wardrobe();
							w1.setId(Integer.parseInt(cmd2[3])); //Egyedi azonosítójának beállítása
							wardrobe1_tile.setElement(w1); //csempen levo elem beallitasa 
							floor.addWardrobe(w1);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3Wardrobe
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Wardrobe")) {

							Tile wardrobe2_tile = floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2]));
							Wardrobe w2 = new Wardrobe();
							w2.setId(Integer.parseInt(cmd3[3]));
							wardrobe2_tile.setElement(w2);
							floor.addWardrobe(w2);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 4movePanda
						line4 = br19.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("movePanda")) { //movePanda utasitas beolvasasa eseten a panda mozgatása a megadott koordinatakra 
							Panda panda = floor.getPandaById(Integer.parseInt(cmd4[1]));
							panda.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!"); //nem moovePanda talalhato az input fajlban
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
						PrintWriter writer = new PrintWriter("output_9.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd1[3]));
						if (outp.getTile().getX() == Integer.parseInt(cmd5[2])
								&& outp.getTile().getY() == Integer.parseInt(cmd5[3])) {
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
							floor.addPanda(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Exit
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Exit")) { //Kijarat letrehozása a megadott koordinatakra
							Exit ex = new Exit();
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ex); // ?????
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3Entrance
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Entrance")) {//Bejarat letrehozása a megadott koordinatakra
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
						if (cmd4[0].equals("movePanda")) { //Panda mozgatasa a megadott koordinatakra
							Panda panda = floor.getPandaById(Integer.parseInt(cmd4[1]));
							panda.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						br19.close();

						// Output
						PrintWriter writer = new PrintWriter("output_10.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd1[3]));
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
							floor.addPanda(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 2Exit
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Exit")) {
							Exit ex = new Exit(); //Kijarat letrehozása a megadott koordinatakra
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ex); // ?????
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// 3Entrance
						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Entrance")) { //Bejarat letrehozása a megadott koordinatakra
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
						PrintWriter writer = new PrintWriter("output_11.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd1[3]));
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
							floor.addPanda(hp1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						// ArmChair
						line2 = br19.readLine();
						String[] cmd2 = line2.split(" "); 
						if (cmd2[0].equals("ArmChair")) {
							ArmChair ac = new ArmChair(); //Fotel létrehozása
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
						PrintWriter writer = new PrintWriter("output_12.txt", "utf-8");
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
							HoppperPanda hp = new HoppperPanda(); //Hopper panda letrehozas
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp); //hozzaadas a palyahpz meg a játékhoz
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br13.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("SlotMachine")) {

							SlotMachine sm = new SlotMachine(); //jatekgep letrehozas
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(sm);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br13.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {

							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3])); //panda mozgatas

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br13.close();

						PrintWriter writer = new PrintWriter("output_13.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) { //ellenorzes
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

							HoppperPanda hp = new HoppperPanda(); //Hopper panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br14.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ChocolateAutomat")) {

							ChocolateAutomat ca = new ChocolateAutomat(); //csokiautomata leterehozas es hozzaadas
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ca);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br14.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("movePanda")) {
							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));//panda mozgatas

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br14.close();

						PrintWriter writer = new PrintWriter("output_14.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: a panda helyben maradt."); //ell
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

							HoppperPanda hp = new HoppperPanda(); //Hopper panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br15.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {//Orangutan letrehozas, hozzaadas a palyahpz meg a játékhoz
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br15.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {
							floor.getOrangutan1().move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else { //mozgatas
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br15.close();

						PrintWriter writer = new PrintWriter("output_15.txt", "utf-8");
						Panda outp = floor.getPandaById(Integer.parseInt(cmd1[3]));
						Orangutan outo = floor.getOrangutan1();
						if (outp.getTile().getX() == Integer.parseInt(cmd2[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd2[2])
								&& outo.getTile().getX() == Integer.parseInt(cmd3[2])
								&& outo.getTile().getY() == Integer.parseInt(cmd3[3])) {
							writer.println("A teszt sikeres: az orangutan huzta a pandat."); //ellenorzes
						} else {
							writer.println("A teszt sikertelen: az orangutan nem huzta a pandat.");
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
						if (cmd1[0].equals("HopperPanda")) { //Hopper panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br16.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("LazyPanda")) {//Lazy panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							LazyPanda lp = new LazyPanda();
							lp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(lp);
							floor.addPanda(lp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br16.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();//Orangutan letrehozas, hozzaadas a palyahpz meg a játékhoz
							o.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd2[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						line4 = br16.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("moveOrangutan")) {
							floor.getOrangutan1().move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3])); //orangutan mozgatas
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br16.close();

						PrintWriter writer = new PrintWriter("output_16.txt", "utf-8");
						Panda outp1 = floor.getPandaById(Integer.parseInt(cmd1[3]));
						Panda outp2 = floor.getPandaById(Integer.parseInt(cmd2[3]));
						Orangutan outo = floor.getOrangutan1();
						if (outp1.getTile().getX() == Integer.parseInt(cmd3[1])
								&& outp1.getTile().getY() == Integer.parseInt(cmd3[2])
								&& outp2.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outp2.getTile().getY() == Integer.parseInt(cmd1[2])
								&& outo.getTile().getX() == Integer.parseInt(cmd4[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd4[2])) {
							writer.println("A teszt sikeres: az orangutan huzta a pandakat."); //ellenorzes
						} else {
							writer.println("A teszt sikertelen: az orangutan nem huzta a pandakat.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 17:
					try {
						String path = System.getProperty("user.dir");
						File file = new File(path + "\\input_17.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br17 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4;
						line1 = br17.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("HopperPanda")) {//Hopper panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br17.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();//Orangutan letrehozas, hozzaadas a palyahpz meg a játékhoz
							o.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br17.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Orangutan")) {
							Orangutan o = new Orangutan();//Orangutan letrehozas, hozzaadas a palyahpz meg a játékhoz
							o.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(o);
							floor.setOrangutan2(o);
						}
						line4 = br17.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("moveOrangutan")) {
							floor.getOrangutan2().move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br17.close();

						PrintWriter writer = new PrintWriter("output_17.txt", "utf-8");
						Orangutan outo1 = floor.getOrangutan1();
						Orangutan outo2 = floor.getOrangutan2();
						if (outo1.getTile().getX() == Integer.parseInt(cmd2[1])
								&& outo1.getTile().getY() == Integer.parseInt(cmd2[2])) {
							if (outo2.getTile().getX() == Integer.parseInt(cmd3[1])
									&& outo2.getTile().getY() == Integer.parseInt(cmd3[2])) {
								writer.println("A teszt sikeres: az orangutan ellopta a pandakat."); //ellenorzes
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
						if (cmd1[0].equals("HopperPanda")) {//Hopper panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							HoppperPanda hp = new HoppperPanda();
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br18.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ScaryPanda")) {//Scary panda letrehozas, hozzaadas a palyahpz meg a játékhoz
							ScaryPanda sp = new ScaryPanda();
							sp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(sp);
							floor.addPanda(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br18.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Orangutan")) {
							Orangutan o = new Orangutan(); //Orangutan letrehozas, hozzaadas a palyahpz meg a játékhoz
							o.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd2[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line4 = br18.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("removeCapturedPandas")) { //pandak eltavolitasa
							floor.getOrangutan1().removeCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br18.close();

						PrintWriter writer = new PrintWriter("output_18.txt", "utf-8");
						Orangutan outo = floor.getOrangutan1();
						if (outo.isHasCapturedPanda() == false) {
							writer.println("A teszt sikeres: az orangutan elengedte a pandakat."); //elleorzes
						} else {
							writer.println("A teszt sikertelen: az otangutan nem engedte el a pandakat.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				// LazyPanda into ArmChair
				case 19:

					try {
						String path = System.getProperty("user.dir"); //fajl megnyitasa es betoltese, space menten split es tokenek vizsgalata
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
							LazyPanda lp = new LazyPanda();  //lazypanda peldanyositasa es palyara illesztese
							lp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(lp);
							floor.addPanda(lp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br19.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ArmChair")) {
							ArmChair ac = new ArmChair(); //armchair peldanyositasa
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ac);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br19.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("stepArmChair")) {

							floor.getPandaById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd2[1]), //armchair step fuggvenyevel a reakcio kivaltasa
									Integer.parseInt(cmd2[2]));
							Tile t = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							floor.getPandaById(Integer.parseInt(cmd3[1])).reaction(InputEffect.sleepMessage, t);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br19.close();

						PrintWriter writer = new PrintWriter("output_19.txt", "utf-8"); //fajlba kiiras, sikeres ha a teszt megfeleloen mukodik
						LazyPanda outp = (LazyPanda) floor.getPandaById(Integer.parseInt(cmd3[1]));
						if (outp.getTile().getX() == Integer.parseInt(cmd2[1])
								&& outp.getTile().getY() == Integer.parseInt(cmd2[2])) {
							writer.println("A teszt sikeres: a lazypanda beleült a fotelba.");
						} else {
							writer.println("A teszt sikertelen: a lazypanda nem ült bele a fotelba."); //teszteles ellenorzese
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				// HopperPanda jumps
				case 20:

					try {
						String path = System.getProperty("user.dir"); //fajl megnyitasa es betoltese, space menten split es tokenek vizsgalata
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
							
						WeakTile wa = new WeakTile(); //weaktile letrehozasa amin a hopperpanda ugrani kepes
						wa.setX(Integer.parseInt(cmd1[1]));
						wa.setY(Integer.parseInt(cmd1[2]));

						wa.setStepInCounter(5);
						floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
						for (int i = 0; i < 5; i++) {
							for (int j = 0; j < 5; j++) {
								Tile tmp = floor.getTile(i, j);
								if (tmp.getX() == Integer.parseInt(cmd1[1])
										&& tmp.getY() == Integer.parseInt(cmd1[2])) {
									int tid = tmp.getId();
									List<Tile> tiles2 = new ArrayList<Tile>();
									tiles2 = floor.getTiles();
									tiles2.remove(tid);
									tiles2.set(tid, wa);
									floor.setTiles(tiles2);
									break;
								}
							}
						}
							
							HoppperPanda hp = new HoppperPanda(); //hopperpanda peldanyositasa
							hp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(hp);
							floor.addPanda(hp);
							tileLifeBeforeHop = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]))
									.getStepInCounter();
							
							
							
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br20.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ChocolateAutomat")) {
							ChocolateAutomat ca = new ChocolateAutomat(); //csokiautomata peldanyositasa
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(ca);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br20.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("stepAutomat")) { //csokiautomata srep fuggvenye a reakcio kivaltasahoz
							
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).getElement().reaction(InputEffect.whistleMessage, floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])));
							tileLifeAfterHop = floor.getPandaById(Integer.parseInt(cmd3[1])).getTile()
									.getStepInCounter();
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br20.close();

						PrintWriter writer = new PrintWriter("output_20.txt", "utf-8"); //fajlba kiiras, sikeres ha a teszt megfeleloen mukodik
						if (tileLifeBeforeHop + 1 == tileLifeAfterHop) {
							writer.println("A teszt sikeres: a hopperpanda ugrott egyet.");
						} else {
							writer.println("A teszt sikertelen: a hopperpanda nem ugrott.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				// ScaryPanda release hands
				case 21:

					try {
						String path = System.getProperty("user.dir"); //fajl megnyitasa es betoltese, space menten split es tokenek vizsgalata
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
							ScaryPanda sp = new ScaryPanda();  //scarypanda peldanyositasa
							sp.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(sp);
							floor.addPanda(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br21.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("HopperPanda")) {
							HoppperPanda sp = new HoppperPanda(); //hopperpanda peldanyositasa
							sp.setId(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2])).setElement(sp);
							floor.addPanda(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br21.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("LazyPanda")) {
							LazyPanda sp = new LazyPanda(); //lazypanda peldanyositasa
							sp.setId(Integer.parseInt(cmd3[3]));
							floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2])).setElement(sp);
							floor.addPanda(sp);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line0 = br21.readLine();
						String[] cmd0 = line0.split(" ");
						if (cmd0[0].equals("Orangutan")) {
							Orangutan o = new Orangutan(); //kell egy orangutan aminek vannak pandai a teszteleshez
							o.setId(Integer.parseInt(cmd0[3]));
							floor.getTile(Integer.parseInt(cmd0[1]), Integer.parseInt(cmd0[2])).setElement(o);
							floor.setOrangutan1(o);
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd3[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd2[3])));
							floor.getOrangutan1().addCapturedPandas(floor.getPandaById(Integer.parseInt(cmd1[3])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line4 = br21.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("SlotMachine")) {
							SlotMachine sm = new SlotMachine(); //slotmachine peldanyositasa
							floor.getTile(Integer.parseInt(cmd4[1]), Integer.parseInt(cmd4[2])).setElement(sm);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line5 = br21.readLine();
						String[] cmd5 = line5.split(" ");
						if (cmd5[0].equals("stepSlotMachine")) { //slotmachine step fuggvenyeben reakcio kivaltasa
							floor.getPandaById(Integer.parseInt(cmd1[3])).setOrangutan(floor.getOrangutan1());
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd1[2])).getElement().reaction(InputEffect.jingleMessage, floor.getTile(Integer.parseInt(cmd4[1]), Integer.parseInt(cmd4[2])));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br21.close();

						PrintWriter writer = new PrintWriter("output_21.txt", "utf-8"); //fajlba kiiras, sikeres ha a teszt megfeleloen mukodik
						if (!floor.getPandaById(Integer.parseInt(cmd2[3])).isCaptured()) {
							writer.println("A teszt sikeres: a scaryPanda elengedte a kezeket.");
						} else {
							writer.println("A teszt sikertelen: a scaryPanda nem engedte el a kezeket.");
						}
						writer.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				case 22:

					try {
						String path = System.getProperty("user.dir"); //fajl megnyitasa es betoltese, space menten split es tokenek vizsgalata
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
							Orangutan o = new Orangutan(); //orangutan peldanyositasa es beallitasa
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br22.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("moveOrangutan")) { //orangutan leptetese ures mezore
							floor.getOrangutan1().move(Integer.parseInt(cmd2[2]), Integer.parseInt(cmd2[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						PrintWriter writer = new PrintWriter("output_22.txt", "utf-8"); //fajlba kiiras, sikeres ha a teszt megfeleloen mukodik
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

					break;

				case 23:

					try {
						String path = System.getProperty("user.dir"); //fajl megnyitasa es betoltese, space menten split es tokenek vizsgalata
						File file = new File(path + "\\input_23.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br3 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br3.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) {

							Orangutan o = new Orangutan(); //orangutan peldanyositasa
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br3.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("WeakTile")) {

							WeakTile wa = new WeakTile(); //weaktile letrehozasa a teszhez
							wa.setX(Integer.parseInt(cmd2[1]));
							wa.setY(Integer.parseInt(cmd2[2]));

							wa.setStepInCounter(Integer.parseInt(cmd2[3]));
							floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							for (int i = 0; i < 5; i++) {
								for (int j = 0; j < 5; j++) {
									Tile tmp = floor.getTile(i, j);
									if (tmp.getX() == Integer.parseInt(cmd2[1])
											&& tmp.getY() == Integer.parseInt(cmd2[2])) {
										int tid = tmp.getId();
										List<Tile> tiles2 = new ArrayList<Tile>();
										tiles2 = floor.getTiles();
										tiles2.remove(tid);
										tiles2.set(tid, wa);
										floor.setTiles(tiles2);
										break;
									}
								}
							}

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br3.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) { //orangutan raleptetese move fuggvennyel eltort csempere
							floor.getOrangutanById(Integer.parseInt(cmd3[1])).move(Integer.parseInt(cmd3[2]),
									Integer.parseInt(cmd3[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br3.close();

						PrintWriter writer = new PrintWriter("output_23.txt", "utf-8"); //fajlba kiiras, sikeres ha a teszt megfeleloen mukodik
						if (floor.getOrangutanById(Integer.parseInt(cmd1[3])) == null) {
							writer.println("A teszt sikeres: az orangutan meghalt.");
						} else {
							writer.println("A teszt sikertelen: az orangutan nem halt meg.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 24:

					try {
						String path = System.getProperty("user.dir"); //fajl megnyitasa es betoltese, space menten split es tokenek vizsgalata
						File file = new File(path + "\\input_24.txt");
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br24 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br24.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) { //orangutan peldanyositasa
							Orangutan o = new Orangutan();
							o.setId(Integer.parseInt(cmd1[3]));
							floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2])).setElement(o);
							floor.setOrangutan1(o);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br24.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Entrance")) {
							// ide kéne valami?
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br24.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) { //orangutan raleptetese az entrance tilera teszhez
							floor.getOrangutan1().move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						PrintWriter writer = new PrintWriter("output_24.txt", "utf-8"); //fajlba kiiras, sikeres ha a teszt megfeleloen mukodik.
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

					break;
				case 25:

					try {

						String path = System.getProperty("user.dir"); //megnyitjuk a bemeneti tesztesethez a user mappáját
						File file = new File(path + "\\input_25.txt"); //megadjuk a tesztesetet txt ben
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br25 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4; //beolvassuk a bementetet és space-ek mentén splitelünk
						line1 = br25.readLine();
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) { //megnézzük az összes bemenetre, hogy jot adtak e meg, ha nem, akkor hibát dobunk
							Tile orangutanTile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o1 = new Orangutan();
							// o1.setId(Integer.parseInt(cmd1[3]));
							orangutanTile.setElement(o1);
							floor.setOrangutan1(o1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br25.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Exit")) {
							Tile exitTile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Exit exit = new Exit();
							exitTile.setElement(exit);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br25.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Entrance")) {
							Tile entranceTile = floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2]));
							Entrance entrance = new Entrance(entranceTile);
							floor.setEntranceTile(entranceTile);
							floor.getEntranceTile().setElement(entrance);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line4 = br25.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br25.close();

						PrintWriter writer = new PrintWriter("output_25.txt", "utf-8"); //kimenetként egy utf-8 kódolásu txt-t írunk ki
						Orangutan outo = floor.getOrangutan1(); //megnézzük, hogyha lefutott a tesztünk, akkor sikerült-e, avagy sem
						if (outo.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikertelen: az orangutan helyben maradt.");
						} else {
							writer.println("A teszt sikeres: az orangutan elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 26:

					try {

						String path = System.getProperty("user.dir"); //megnyitjuk a bemeneti tesztesethez a user mappáját
						File file = new File(path + "\\input_26.txt"); //megadjuk a tesztesetet txt ben
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br26 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4, line5, line6;
						line1 = br26.readLine(); //beolvassuk a bementetet és space-ek mentén splitelünk
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) { //megnézzük az összes bemenetre, hogy jot adtak e meg, ha nem, akkor hibát dobunk
							Tile orangutanTile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o1 = new Orangutan();
							o1.setId(Integer.parseInt(cmd1[3]));
							orangutanTile.setElement(o1);
							floor.setOrangutan1(o1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br26.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Exit")) {
							Tile exitTile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Exit exit = new Exit();
							exitTile.setElement(exit);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br26.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("LazyPanda")) {
							Tile lazyPandaTile = floor.getTile(Integer.parseInt(cmd3[1]), Integer.parseInt(cmd3[2]));
							LazyPanda lazyPanda = new LazyPanda();
							lazyPandaTile.setElement(lazyPanda);
							floor.addPanda(lazyPanda);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line4 = br26.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("LazyPanda")) {

							Tile lazyPandaTile = floor.getTile(Integer.parseInt(cmd4[1]), Integer.parseInt(cmd4[2]));
							LazyPanda lazyPanda = new LazyPanda();
							lazyPandaTile.setElement(lazyPanda);
							floor.addPanda(lazyPanda);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line5 = br26.readLine();
						String[] cmd5 = line5.split(" ");
						if (cmd5[0].equals("Entrance")) {
							Tile entranceTile = floor.getTile(Integer.parseInt(cmd5[1]), Integer.parseInt(cmd5[2]));
							Entrance entrance = new Entrance(entranceTile);
							entranceTile.setElement(entrance);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line6 = br26.readLine();
						String[] cmd6 = line6.split(" ");
						if (cmd6[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd6[2]), Integer.parseInt(cmd6[3]));

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						br26.close();

						PrintWriter writer = new PrintWriter("output_26.txt", "utf-8"); //kimenetként egy utf-8 kódolásu txt-t írunk ki
						Orangutan outo = floor.getOrangutan1(); //megnézzük, hogyha lefutott a tesztünk, akkor sikerült-e, avagy sem
						if (outo.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikertelen: az orangutan helyben maradt.");
						} else {
							writer.println("A teszt sikeres: az orangutan elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 27:

					try {

						String path = System.getProperty("user.dir"); //megnyitjuk a bemeneti tesztesethez a user mappáját
						File file = new File(path + "\\input_27.txt"); //megadjuk a tesztesetet txt ben
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br27 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br27.readLine();
						String[] cmd1 = line1.split(" "); //beolvassuk a bementetet és space-ek mentén splitelünk
						if (cmd1[0].equals("Orangutan")) { //megnézzük az összes bemenetre, hogy jot adtak e meg, ha nem, akkor hibát dobunk
							Tile orangutanTile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o1 = new Orangutan();
							// o1.setId(Integer.parseInt(cmd1[3]));
							orangutanTile.setElement(o1);

							floor.setOrangutan1(o1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br27.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ArmChair")) {
							Tile acTile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							ArmChair ac = new ArmChair();
							acTile.setElement(ac);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br27.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br27.close();

						PrintWriter writer = new PrintWriter("output_27.txt", "utf-8"); //kimenetként egy utf-8 kódolásu txt-t írunk ki
						Orangutan outo = floor.getOrangutan1(); //megnézzük, hogyha lefutott a tesztünk, akkor sikerült-e, avagy sem
						if (outo.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: az orangutan helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: az orangutan elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 28:

					try {

						String path = System.getProperty("user.dir"); //megnyitjuk a bemeneti tesztesethez a user mappáját
						File file = new File(path + "\\input_28.txt"); //megadjuk a tesztesetet txt ben
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br28 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br28.readLine(); //beolvassuk a bementetet és space-ek mentén splitelünk
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) { //megnézzük az összes bemenetre, hogy jot adtak e meg, ha nem, akkor hibát dobunk
							Tile orangutanTile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o1 = new Orangutan();
							// o1.setId(Integer.parseInt(cmd1[3]));
							orangutanTile.setElement(o1);

							floor.setOrangutan1(o1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br28.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("ChocolateAutomat")) {
							Tile caTile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							ChocolateAutomat ca = new ChocolateAutomat();
							caTile.setElement(ca);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br28.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br28.close();
 
						PrintWriter writer = new PrintWriter("output_28.txt", "utf-8"); //kimenetként egy utf-8 kódolásu txt-t írunk ki
						Orangutan outo = floor.getOrangutan1(); //megnézzük, hogyha lefutott a tesztünk, akkor sikerült-e, avagy sem
						if (outo.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: az orangutan helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: az orangutan elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 29:

					try {

						String path = System.getProperty("user.dir"); //megnyitjuk a bemeneti tesztesethez a user mappáját
						File file = new File(path + "\\input_29.txt"); //megadjuk a tesztesetet txt ben
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br29 = new BufferedReader(new FileReader(file));

						String line1, line2, line3;
						line1 = br29.readLine(); //beolvassuk a bementetet és space-ek mentén splitelünk
						String[] cmd1 = line1.split(" ");
						if (cmd1[0].equals("Orangutan")) { //megnézzük az összes bemenetre, hogy jot adtak e meg, ha nem, akkor hibát dobunk
							Tile orangutanTile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o1 = new Orangutan();
							// o1.setId(Integer.parseInt(cmd1[3]));
							orangutanTile.setElement(o1);
							floor.setOrangutan1(o1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br29.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("SlotMachine")) {
							Tile smtile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							SlotMachine sm = new SlotMachine();
							smtile.setElement(sm);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br29.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd3[2]), Integer.parseInt(cmd3[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}
						br29.close();

						PrintWriter writer = new PrintWriter("output_29.txt", "utf-8"); //kimenetként egy utf-8 kódolásu txt-t írunk ki
						Orangutan outo = floor.getOrangutan1(); //megnézzük, hogyha lefutott a tesztünk, akkor sikerült-e, avagy sem
						if (outo.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikeres: az orangutan helyben maradt.");
						} else {
							writer.println("A teszt sikertelen: az orangutan elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				case 30:

					try {

						String path = System.getProperty("user.dir"); //megnyitjuk a bemeneti tesztesethez a user mappáját
						File file = new File(path + "\\input_30.txt"); //megadjuk a tesztesetet txt ben
						if (!file.exists()) {
							System.out.println("System couldnt file source file!");
							System.out.println("Application will explode");
						}
						BufferedReader br30 = new BufferedReader(new FileReader(file));

						String line1, line2, line3, line4, line5;
						line1 = br30.readLine();
						String[] cmd1 = line1.split(" "); //beolvas suk a bementetet és space-ek mentén splitelünk
						if (cmd1[0].equals("Orangutan")) { //megnézzük az összes bemenetre, hogy jot adtak e meg, ha nem, akkor hibát dobunk
							Tile orangutanTile = floor.getTile(Integer.parseInt(cmd1[1]), Integer.parseInt(cmd1[2]));
							Orangutan o1 = new Orangutan();
							o1.setId(Integer.parseInt(cmd1[3]));
							orangutanTile.setElement(o1);
							floor.setOrangutan1(o1);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line2 = br30.readLine();
						String[] cmd2 = line2.split(" ");
						if (cmd2[0].equals("Wardrobe")) {
							Tile wardrobeTile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Wardrobe wardrobe = new Wardrobe();
							wardrobeTile.setElement(wardrobe);
							floor.addWardrobe(wardrobe);

						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line3 = br30.readLine();
						String[] cmd3 = line3.split(" ");
						if (cmd3[0].equals("Wardrobe")) {

							Tile wardrobeTile = floor.getTile(Integer.parseInt(cmd2[1]), Integer.parseInt(cmd2[2]));
							Wardrobe wardrobe = new Wardrobe();
							wardrobeTile.setElement(wardrobe);
							floor.addWardrobe(wardrobe);
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line4 = br30.readLine();
						String[] cmd4 = line4.split(" ");
						if (cmd4[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd4[2]), Integer.parseInt(cmd4[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						line5 = br30.readLine();
						String[] cmd5 = line5.split(" ");
						if (cmd5[0].equals("moveOrangutan")) {

							Orangutan orangutan = floor.getOrangutan1();
							orangutan.move(Integer.parseInt(cmd5[2]), Integer.parseInt(cmd5[3]));
						} else {
							System.out.println("Nem a tesztesethez megfelelo parameterek!");
							break;
						}

						br30.close();

						PrintWriter writer = new PrintWriter("output_30.txt", "utf-8"); //kimenetként egy utf-8 kódolásu txt-t írunk ki
						Orangutan outo = floor.getOrangutan1(); //megnézzük, hogyha lefutott a tesztünk, akkor sikerült-e, avagy sem
						if (outo.getTile().getX() == Integer.parseInt(cmd1[1])
								&& outo.getTile().getY() == Integer.parseInt(cmd1[2])) {
							writer.println("A teszt sikertelen: az orangutan helyben maradt.");
						} else {
							writer.println("A teszt sikeres: az orangutan elmozdult.");
						}
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					break;

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
