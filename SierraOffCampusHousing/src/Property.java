/**
 * 
 * @author Cole
 *
 */
import java.util.*;
public class Property {
	private String id;
	private String name;
	private String price;
	private String location;
	private String size;
	private String numOfRooms;
	private String lease;
	private String rating;
	private ArrayList<String> Amenities = new ArrayList<>();
	private ArrayList<String> Reviews = new ArrayList<>();
	
	public Property(String id, String name, String price, String location, String size, String numOfRooms, String rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.location = location;
		this.size = size;
		this.numOfRooms = numOfRooms;
		this.rating = rating;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getNumOfRooms() {
		return numOfRooms;
	}


	public void setNumOfRooms(String numOfRooms) {
		this.numOfRooms = numOfRooms;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getLease() {
		return lease;
	}

	public void setLease(String lease) {
		this.lease = lease;
	}
	
	public void addAmenity(String amenity) {
		Amenities.add(amenity);
	}
	
	public void addReview(String review) {
		Reviews.add(review);
	}
}
