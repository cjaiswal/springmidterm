package springdemo;

import org.springframework.stereotype.Component;

@Component
public class TrumanState implements University
{

	@Override
	public String getUniversityName() 
	{
		
		return "Name is Truman State University";
	}

}
