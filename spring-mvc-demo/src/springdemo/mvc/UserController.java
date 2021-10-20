package springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController 
{
	
		// method for show form
		@RequestMapping("/showForm")
		public String showForm(Model theModel)
		{
			// create a new user object to be added to the Model
			// so that the user form can make use of the user object for data mapping
			User user = new User();
			user.setName(" ");
			user.setPhoneNumber(" ");
			theModel.addAttribute("user", user);
			return "user-form";
		}
			
		
		@RequestMapping("/processForm")
		public String processForm(@Valid @ModelAttribute("user") User
				user, BindingResult bindingResult)
		{
				
			if(bindingResult.hasErrors())
				return "user-form";

			else
				return "user-confirmation";
		}

		@InitBinder
		public void initBinder(WebDataBinder dataBinder)
		{
			// the class below is defined in Spring API, removes leading/trailing whitespaces
			// true means set to null if all are white spaces StringTrimmerEditor 
			StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			//Paraphrases every String form data
			dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		}
		
		
		
		

}
