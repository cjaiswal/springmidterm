package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MidtermApp {

	public static void main(String[] args) 
	{
				// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				University university = new TrumanState();
				
				System.out.println(university.getUniversityName());
				
				
				//create the container or object factory
				AnnotationConfigApplicationContext context1 =
						new AnnotationConfigApplicationContext(JavaConfig.class);
				
				Person president = context1.getBean("president", Person.class);
				
				System.out.println(president.getPersonName());
				
				
				context.close();
				context1.close();
				
				

	}

}
