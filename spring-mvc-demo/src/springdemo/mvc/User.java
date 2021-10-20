package springdemo.mvc;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User 
{
	@NotNull(message="cannot be nothing, enter valid last name")
	@Size(min = 5, message="Must be at least 5 characters")
	private String name;
	
	@Phone(value = "660", message = "must begin with 660")
	@Size(min =10, max=10, message= "number must be 10 digits")
	@NotNull(message = "This can be a null if you do not have a number")
	private String phoneNumber;

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
		

}
