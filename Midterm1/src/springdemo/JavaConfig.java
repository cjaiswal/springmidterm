package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean
	public Person president()
	{
		 return new President(null);
	}
	
	
	@Bean
	public Person fourYearCollege()
	{
		FourYearCollege president = new FourYearCollege(president());
		return president;		
	}

}
