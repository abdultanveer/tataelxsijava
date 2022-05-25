package abstraction;

public class Manager {
	
	public static void main(String[] args) {
		Person abdul = new Person();
		
		abdul.setOnSwitchListener(new GEAppliances());
		
	}

}
