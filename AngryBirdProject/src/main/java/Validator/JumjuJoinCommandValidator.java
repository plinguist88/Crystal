package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.JumjuJoinCommand;

public class JumjuJoinCommandValidator implements Validator{

	private static final String storeNumRegExp= "^\\d{3}\\d{2}(\\d{5}[1])$";
	private Pattern storeNumPattern;
	
	private static final String accountRegExp = "^[0-9]*$";
	private Pattern accountPattern;
	
	private static final String phoneRegExp = "^01(?:0|1|[6-9])(\\d{3}|\\d{4})(\\d{4})$";
	private Pattern phonePattern;
	
	public JumjuJoinCommandValidator() {
		storeNumPattern =  Pattern.compile(storeNumRegExp);
		accountPattern = Pattern.compile(accountRegExp);
		phonePattern = Pattern.compile(phoneRegExp);
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		JumjuJoinCommand jumjuJoinCommand = (JumjuJoinCommand)target;
		
		// 사업자 번호 정규식
		if(jumjuJoinCommand.getStoreNo() == null || jumjuJoinCommand.getStoreNo().trim().isEmpty() ) {
			errors.rejectValue("jjStoreNo", "required");
			
		} else {
			// false/ true
			Matcher matcher = storeNumPattern.matcher(jumjuJoinCommand.getStoreNo() ); 
			if(!matcher.matches()) {
				errors.rejectValue("jjStoreNo", "badStoreNo");
				
			}
		}
		
		// 계좌번호 정규식
		if(jumjuJoinCommand.getStoreOwnerAccount() == null || jumjuJoinCommand.getStoreOwnerAccount().trim().isEmpty() ) {
			errors.rejectValue("jjBackAccount", "required");
		
		}else {
			Matcher matcher = accountPattern.matcher(jumjuJoinCommand.getStoreOwnerAccount() ); 
			if(!matcher.matches()) {
				errors.rejectValue("jjBackAccount", "badAccount");
				
			}
		}
		
		// 핸드폰 번호 정규식
		if(jumjuJoinCommand.getStoreOwnerPhone() == null || jumjuJoinCommand.getStoreOwnerPhone().trim().isEmpty() ) {
			errors.rejectValue("jjPhone", "required");

		}else {
			Matcher matcher = phonePattern.matcher(jumjuJoinCommand.getStoreOwnerPhone() ); 
			if(!matcher.matches()) {
				errors.rejectValue("jjPhone", "badPhone");

			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerName", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerPw", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jjPwCon", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeNo", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerBank", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerAccount", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerPhone", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerAddr", "required");
		
		if(!jumjuJoinCommand.getStoreOwnerPw().isEmpty() ){
			if(!jumjuJoinCommand.pwEqualsPwcon() ) {
				errors.rejectValue("jjPwCon", "pwMatch");
			}
		}
		
	}

	
}
