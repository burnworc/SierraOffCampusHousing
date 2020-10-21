/**
 * 
 * @author Cole
 *
 */
public class Apartment extends Property {
	private boolean hasGating, hasParking, allowsPets, hasShuttle, utilitiesIncluded, hasPropertySecurity;
	
	public Apartment(String name, double price, int size, int numOfRooms, String lease) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
		this.numOfRooms = numOfRooms;
		this.lease = lease;
	}
	
	protected boolean hasGating() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has gating");
		}
		else {
			System.out.println("This apartment does not have gating");
		}
	}
	
	protected boolean hasParking() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has parking");
		}
		else {
			System.out.println("This apartment does not have parking");
		}
	}
	
	protected boolean hasShuttle() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has a shuttle");
		}
		else {
			System.out.println("This apartment does not have a shuttle");
		}
	}
	
	protected boolean hasPropertySecurity() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has security");
		}
		else {
			System.out.println("This apartment does not have security");
		}
	}
	
	protected boolean utilitiesIncluded() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("Utilities are included with this apartment");
		}
		else {
			System.out.println("Utilities are not included with this apartment");
		}
	}
	
	
}
