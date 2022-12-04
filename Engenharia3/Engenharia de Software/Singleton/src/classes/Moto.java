package classes;

public class Moto {
	private static Moto uniqueInstance;
	
	private Moto() {
		
	}
	
	public static synchronized Moto getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = 	new Moto();
		}
		return uniqueInstance;
	}
}