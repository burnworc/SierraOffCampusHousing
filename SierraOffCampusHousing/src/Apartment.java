/**
 * 
 * @author Cole
 *
 */
public class Apartment extends Property {
	private boolean hasGating, hasParking, allowsPets, hasShuttle, utilitiesIncluded, hasPropertySecurity;
	
	public Apartment() {
		super();
	}
	
	protected void hasGating() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has gating");
		}
		else {
			System.out.println("This apartment does not have gating");
		}
	}
	
	protected void hasParking() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has parking");
		}
		else {
			System.out.println("This apartment does not have parking");
		}
	}
	
	protected void hasShuttle() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has a shuttle");
		}
		else {
			System.out.println("This apartment does not have a shuttle");
		}
	}
	
	protected void hasPropertySecurity() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("This apartment has security");
		}
		else {
			System.out.println("This apartment does not have security");
		}
	}
	
	protected void utilitiesIncluded() {
		boolean Apartment = true;
		if(Apartment == true) {
			System.out.println("Utilities are included with this apartment");
		}
		else {
			System.out.println("Utilities are not included with this apartment");
		}
	}
}
