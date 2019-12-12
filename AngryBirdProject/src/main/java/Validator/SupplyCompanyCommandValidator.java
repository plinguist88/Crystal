package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.SupplyCompanyRegistCommand;



public class SupplyCompanyCommandValidator implements Validator{
	private static final String LicenseRegExp=
			"^\\d{3}-\\d{2}-\\d{6}$";
	private Pattern licensePattern;
	
	public SupplyCompanyCommandValidator() {
		licensePattern = Pattern.compile(LicenseRegExp);
	}
	public boolean supports(Class<?> clazz) {
		return false;
	}

	public void validate(Object target, Errors errors) {
		SupplyCompanyRegistCommand supplyCompanyRegistCommand = (SupplyCompanyRegistCommand)target;
		if(supplyCompanyRegistCommand.getScLicense() == null ||
				supplyCompanyRegistCommand.getScLicense().toString().trim().isEmpty()) {
			errors.rejectValue("scLicense", "required");
		} else {
			Matcher matcher = licensePattern.matcher(supplyCompanyRegistCommand.getScLicense().toString());
			if(!matcher.matches()) {
				errors.rejectValue("scLicense", "bad" );
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scName1", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scName2", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scSort", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scAddr", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scPh", "required");
	}
}
