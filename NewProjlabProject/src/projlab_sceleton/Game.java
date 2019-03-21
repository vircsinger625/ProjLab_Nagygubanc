package projlab_sceleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game {

	public static int usecase; //komment
	
	public static void main(String[] args) {
		
		
		
		while(true) {
			System.out.println("Melyik Use - case-t akarod kipróbálni?");
			System.out.println("");
			
			InputStreamReader isr = new InputStreamReader(System.in);
			try {
				BufferedReader br = new BufferedReader(isr);
				String number = br.readLine();
				
				if(number == "exit")
					System.exit(0);
				
				usecase = Integer.parseInt(number);
				
				switch(usecase) {
				case 1:
					System.out.println("1-est irtal be");
					break;
				case 2:
					;
					break;
				case 3:
					;
					break;
				case 4:
					;
					break;
				case 5:
					;
					break;
				case 6:
					;
					break;
				case 7:
					;
					break;
				case 8:
					;
					break;
				case 9:
					;
					break;
				case 10:
					;
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
