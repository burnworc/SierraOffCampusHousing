import java.util.ArrayList; 
public class Filter {

	String filterType;
	String location;
	double price;
	String amenity;
	int size;
	int rooms;
	private ArrayList<Filter> Filter = new ArrayList<Filter>();
	
	
	public Filter(String filterType)
	{
		this.filterType = filterType;
		
	}
	
	public String Filter()
	{
		return filterType;
	}
	
	public void setfilterPrice(double price)
	{
		this.price = price;
	}
	
	public double getfilterPrice()
	{
		return price;
	}
	
	public void setfilterLocation(String location)
	{
		this.location = location;
	}
	
	public String getlocation()
	{
		return location;
	}
	
	public void setfliterSize(int size)
	{
		this.size = size;
	}
	
	public int getfilterSize()
	{
		return size;
	}
	
	public void setfilterRoomNum(int rooms)
	{
		this.rooms = rooms;
	}
public int getfilterRoomNum()
{
	return rooms;
}
	

	public void setfilterAmenity(String amenity)
	{
		this.amenity = amenity;
	}
	
	public String getfilterAmenities()
	{
		return amenity; 
	}
	
	public void addFilter(Filter filter)
	{
		filter.Filter.add(filter);
	}
}

