package projlab_sceleton;

public class Exit extends Element {
	
	private boolean isCounting;
	
	public boolean collide(Orangutan o) 
	{
		System.out.println("Exit.collide(Orangutan o) "); 
		/*5.3.10	OrangutanExit*/
		this.getTile().remove(o); //Orángután kilép 
		for(int i = 0; i < o.capturedPandas.length; i++) { //pandák is kilépnek
			collide(o.capturedPandas[i]); /*Itt kimaradt az, hogy szépen sorban menjenek ki */			
		}
		/** setElement(o); //Orángután a bejárathoz kerül 
		 * Floor-ból kéne a getEntranceTile() valahogy**/
		
		return true;
	}
	
	public boolean collide(Panda p) 
	{
		System.out.println("Exit.collide(Panda p) "); 
		/*5.3.10	OrangutanExit*/
		p.move(this.getTile()); 
		this.getTile().remove(p);
		return true;
	}
	
	public void reaction(InputEffect i, Tile t) {System.out.println("Exit.reaction(InputEffect i, Tile t) ");}

}
