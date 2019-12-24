package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import Command.CtContSupplyRegistCommand;

public class CtContSupplyRegistCommandValidator {
	private static final String ccDayRegExp=
			"^\\d{2}\\d{2}\\d{2}$";
	private Pattern ccDayPattern;
	
	public CtContSupplyRegistCommandValidator() {
		ccDayPattern = Pattern.compile(ccDayRegExp);
	}
	public boolean supports(Class<?> clazz) {
		return false;
	}

	public void validate(Object target, Errors errors) {
		CtContSupplyRegistCommand ctContSupplyRegistCommand = (CtContSupplyRegistCommand)target;
		if(ctContSupplyRegistCommand.getCcDay() == null ||
				ctContSupplyRegistCommand.getCcDay().toString().trim().isEmpty()) {
			errors.rejectValue("ccDay", "required");
		} else {
			Matcher matcher = ccDayPattern.matcher(ctContSupplyRegistCommand.getCcDay().toString());
			if(!matcher.matches()) {
				errors.rejectValue("ccDay", "badCcDay" );
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ccPeriod", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ccExtention", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scNo", "required");
	}
}
