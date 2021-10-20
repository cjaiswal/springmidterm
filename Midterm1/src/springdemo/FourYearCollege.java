package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class FourYearCollege implements Person, University 
{
	
	private University universityName;
	


	public FourYearCollege(Person president) 
	{
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getUniversityName() 
	{
		
		return null;
	}

	@Override
	public String getPersonName() 
	{
		
		return null;
	}

	
	@Autowired
	public void setUniversityName(University universityName) 
	{
		this.universityName = universityName;
	}

	
	
	
	

}
