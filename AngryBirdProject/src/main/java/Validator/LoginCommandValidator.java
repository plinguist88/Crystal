package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;/*LoginCommand.class.isAssignableFrom(clazz);*/
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeNum", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeePw", "required");
		
	}

}
