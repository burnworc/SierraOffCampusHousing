import java.util.ArrayList;

public class LeasingAgent extends Account {

	String listing;
	private ArrayList<Property> clients = new ArrayList<Property>();


	public LeasingAgent(String username, String email, int phone, String password, String officeAddress)
	{
		super();
	}
	
	public String getListing()
	{
		return listing;
	}
	
	protected ArrayList<Property> getClients()
	{
		return clients;
	}
}

