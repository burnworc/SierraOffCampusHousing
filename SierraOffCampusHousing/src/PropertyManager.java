import java.util.ArrayList;

public class PropertyManager extends Account {

	String officeAddress;
	private ArrayList<Property> properties = new ArrayList<Property>();

	
	
	public PropertyManager(String username, String email, int phone, String password, String officeAddress)
	{
		super();

	}

	public String getOfficeAddress()
	{
		return officeAddress; 
	}

	protected ArrayList<Property> getProperties()
	{
		return properties;
	}
}
