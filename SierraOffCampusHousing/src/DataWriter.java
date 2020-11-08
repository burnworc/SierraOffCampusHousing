/**
 * Cole B
 */
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.IOException;
import java.util.ArrayList;
public class DataWriter extends DataConstants {
	public static void saveProperties() {
		Properties properties = Properties.getInstance();
		ArrayList<Property> neighbors = properties.getProperties();
		JSONArray jsonNeighbors = new JSONArray();
		
		for(int i = 0; i < neighbors.size(); i++) {
			jsonNeighbors.add(getPropertyJSON(neighbors.get(i)));
		}
		
		try(FileWriter file = new FileWriter(PROPERTY_FILE_NAME)) {
			file.write(jsonNeighbors.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static JSONObject getPropertyJSON(Property property) {
		JSONObject propertyDetails = new JSONObject();
		propertyDetails.put(PROPERTY_ID, property.getId());
		propertyDetails.put(PROPERTY, property.getName());
		propertyDetails.put(PROPERTY_PRICE, property.getPrice());
		propertyDetails.put(PROPERTY_LOCATION, property.getLocation());
		propertyDetails.put(PROPERTY_SIZE, property.getSize());
		propertyDetails.put(PROPERTY_NUM_OF_ROOMS, property.getNumOfRooms());
		propertyDetails.put(PROPERTY_RATING, property.getRating());
		
		return propertyDetails;
	}
	
}
