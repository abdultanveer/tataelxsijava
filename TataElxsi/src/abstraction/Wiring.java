package abstraction;

public class Wiring {
	SwitchBoardListener sbl;
	
	
		public Wiring(SwitchBoardListener sbl) {
		
		this.sbl = sbl;
	

		 sbl = new GEAppliances();
				//HavellsAppliances();
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
	

}
}
