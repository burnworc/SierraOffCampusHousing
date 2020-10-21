
public class Student extends Account {

	
	double price;
	String username;
	String email;
	String password;
	int phone; 
	
	public Student(String username, String email, int phone, String password, double price)
	{
		super();
		this.price = price;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone; 
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void hasPets()
	{
		boolean user = true;
		if (user == true)
		{
			System.out.println("This person has pets");
		}
		else
		{
			System.out.println(" This person does not have pets");
		}
	}
	
	public void hasRoomatePreference()
	{
		boolean user = true;
		if(user == true)
		{
			System.out.println("This user has a preference");
		}
		else
		{
			System.out.println("This user does not have a preference");
		}
	}
	
	
	
}
