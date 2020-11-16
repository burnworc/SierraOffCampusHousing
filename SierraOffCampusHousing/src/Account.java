import java.util.ArrayList;
public class Account {
	
	private static Account account = null;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int DOB;
	private String email;
	private int phone;
	private static ArrayList<Property> favorites = new ArrayList<Property>();
	
	private Account() {
		favorites = DataLoader.loadAccount():
	}

	public Account( ) {
	
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		
		}
	public void setUsername( String username)
	{
		this.username = username;
		
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPasword( String passwordusername)
	{
		this.password = password;
		
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getfirstName()
	{
		return firstName;
	}

	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getlastName()
	{
		return lastName;
	}

	public void setDOB(int DOB)
	{
		this.DOB = DOB;
	}
	
	public int getDOB()
	{
		return DOB;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	
	public int getPhone()
	{
		return phone; 
	}
	
	public int addFavorites(Property property)
	{

		int username = favorites.size();
		Property favorites = new Property();
		favorites.add(property);
		return username;
		
	}
	
	public void addAccountData(Account account)
	{
		account.addAccountData(account);
	}
	
	public String login(String username, String password)
	{
		String login = "Username: " + username + "Password: " + password;
		return login;
	}
	








}
