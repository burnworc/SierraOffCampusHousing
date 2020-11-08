import java.util.ArrayList;
public class Properties {
	private static Properties properties = null;
	private ArrayList<Property> propertiesList = new ArrayList<Property>();
	
	private Properties() {
		propertiesList = DataLoader.getProperties();
	}
	
	public static Properties getInstance() {
		if(properties == null) {
			properties = new Properties();
		}
		return properties;
	}
	
	public ArrayList<Property> getProperties() {
		return propertiesList;
	}
	
	public void addProperty(String id, String name, String price, String location, String size, String numOfRooms, String rating ) {
		propertiesList.add(new Property(id, name, price, location, size, numOfRooms, rating));
		DataWriter.saveProperties();
	}
}
