import java.util.*;
public class PropertyManager extends Account{
	private String officeAddress;
	private ArrayList<Property> properties = new ArrayList<>();
	
	public PropertyManager(String username, String email, int phone, String password, String officeAddress) {
		super();
	}
	
	protected String getOfficeAddress() {
		return officeAddress;
	}
	
	protected ArrayList<Property> getProperties() {
		return properties;
	}
}
