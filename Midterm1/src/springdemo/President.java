package springdemo;

import org.springframework.stereotype.Component;

@Component
public class President implements Person
{

	private President president;
	
	@Override
	public String getPersonName() 
	{
		return "Name of President: Jonn Alexander";
	}

	public President(President president)
	{
		this.president = president;
	}



}
