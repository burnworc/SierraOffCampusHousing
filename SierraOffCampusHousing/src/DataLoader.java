import java.util.*;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataLoader extends DataConstants {
	public static ArrayList<Property> getProperties() {
		ArrayList<Property> properties = new ArrayList<Property>();
		
		try {
			FileReader reader = new FileReader(PROPERTY_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray propertyJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < propertyJSON.size(); i++) {
				JSONObject propertyJSON1 = (JSONObject)propertiesJSON.get(i);
				String id = (String)propertyJSON1.get(PROPERTY_ID);
				String Name = (String)propertyJSON1.get(PROPERTY);
				String Price = (String)propertyJSON1.get(PROPERTY_PRICE);
				String Location = (String)propertyJSON1.get(PROPERTY_LOCATION);
				String Size = (String)propertyJSON1.get(PROPERTY_SIZE);
				String NumOfRooms = (String)propertyJSON1.get(PROPERTY_NUM_OF_ROOMS);
				String Rating = (String)propertyJSON1.get(PROPERTY_RATING);
				
				properties.add(new Property(id, Name, Price, Location, Size, NumOfRooms, Rating));
			}
			return properties;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
