/**
 * 
 * @author Cole
 *
 */
import java.util.*;
public class Property {
	private String name;
	private double price;
	private String location;
	private int size;
	private int numOfRooms;
	private String lease;
	private ArrayList<String> Amenities = new ArrayList<>();
	private ArrayList<String> Reviews = new ArrayList<>();
	
	public Property() {
		this.name = name;
		this.price = price;
		this.location = location;
		this.size = size;
		this.numOfRooms = numOfRooms;
		this.lease = lease;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
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
