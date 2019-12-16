package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.CtSupplyRegistCommand;



public class CtSupplyRegistCommandValidator implements Validator{
	private static final String LicenseRegExp=
			"^\\d{3}\\d{2}\\d{6}$";
	private Pattern licensePattern;
	
	public CtSupplyRegistCommandValidator() {
		licensePattern = Pattern.compile(LicenseRegExp);
	}
	public boolean supports(Class<?> clazz) {
		return false;
	}

	public void validate(Object target, Errors errors) {
		CtSupplyRegistCommand ctSupplyRegistCommand = (CtSupplyRegistCommand)target;
		if(ctSupplyRegistCommand.getScLicense() == null ||
				ctSupplyRegistCommand.getScLicense().toString().trim().isEmpty()) {
			errors.rejectValue("scLicense", "required");
		} else {
			Matcher matcher = licensePattern.matcher(ctSupplyRegistCommand.getScLicense().toString());
			if(!matcher.matches()) {
				errors.rejectValue("scLicense", "badLicense" );
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scName1", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scName2", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scSort", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scAddr", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scPh", "required");
	}
}
