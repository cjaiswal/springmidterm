package springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> 
{
	
	private String phoneNumber;
	
	
	public void initialize(Phone phone)
	{
		phoneNumber = phone.value();
		
	}
	
	
	public boolean isValid(String phone,
			ConstraintValidatorContext theConstraintValidatorContext)
	{
		boolean result;
		if (phone != null)
		{
			result = phone.startsWith(phoneNumber);
		   
		}
		else
		{
			result = true;
		}
		return result;
	}



}
