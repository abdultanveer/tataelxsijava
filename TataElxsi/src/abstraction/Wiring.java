package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl = new GEAppliances();
				//HavellsAppliances();
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
	}

}
