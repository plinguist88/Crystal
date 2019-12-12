package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.JoinCommand;

public class JoinCommandValidator implements Validator {
	private static final String emailRegExp= "^[_A-Za-z0-9-](.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private Pattern pattern ;
	
	private static final String birthRegExp = "^\\d{2}\\d{2}\\d{2}$";
	private Pattern birthPattern;
	
	public JoinCommandValidator() {
		pattern =  Pattern.compile(emailRegExp);
		birthPattern = Pattern.compile(birthRegExp);
	}
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return JoinCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		JoinCommand joinCommand = (JoinCommand)target;
		if(joinCommand.getEmployeeEmail() == null || joinCommand.getEmployeeEmail().trim().isEmpty() ) {
			errors.rejectValue("employeeEmail", "required");
			
		} else {
			// false/ true
			Matcher matcher = pattern.matcher(joinCommand.getEmployeeEmail() ); 
			if(!matcher.matches()) {
				errors.rejectValue("employeeEmail", "badEmail");
				
			}
		}
		if(joinCommand.getEmployeeBirth() == null || joinCommand.getEmployeeBirth().trim().isEmpty()) {
			errors.rejectValue("employeeBirth", "required");
		}else {
			Matcher matcher = birthPattern.matcher(joinCommand.getEmployeeBirth() ); 
			if(!matcher.matches()) {
				errors.rejectValue("employeeBirth", "badBir");
				
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeName", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeePw", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwCon", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeePh", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeHiredYrs", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeHiredate", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeGender", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeHeight", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeWeight", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeActive", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeKcal", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "deptNum", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jopTypeNum", "required");
		
		if(!joinCommand.getEmployeePw().isEmpty() ){
			if(!joinCommand.pwEqualsPwcon() ) {
				errors.rejectValue("pwCon", "pwMatch");
			}
		}
	}

}
