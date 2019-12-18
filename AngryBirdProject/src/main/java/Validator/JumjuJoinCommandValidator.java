package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.JumjuJoinCommand;

public class JumjuJoinCommandValidator implements Validator{
	// 정규식
	private static final String storeNumRegExp= "^\\d{3}\\d{2}({5}[0-9][0-9][0-9][0-9][1])$";
	private Pattern storeNumPattern;
	
	private static final String accountRegExp = "^[0-9]*$";
	private Pattern accountPattern;
	
	private static final String phoneRegExp = "^01(?:0|1|[6-9])(\\d{3}|\\d{4})(\\d{4})$";
	private Pattern phonePattern;
	
	private static final String birthRegExp = "^\\d{2}({2}0[0-9]|1[012])({2}0[0-9]|1[0-9]|2[0-9]|3[0-1])$";
	private Pattern contractDayPattern;
	
	public JumjuJoinCommandValidator() {
		storeNumPattern =  Pattern.compile(storeNumRegExp);
		accountPattern = Pattern.compile(accountRegExp);
		phonePattern = Pattern.compile(phoneRegExp);
		contractDayPattern = Pattern.compile(birthRegExp);
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
			errors.rejectValue("storeNo", "required");
			
		} else {
			// false/ true
			Matcher matcher = storeNumPattern.matcher(jumjuJoinCommand.getStoreNo() ); 
			if(!matcher.matches()) {
				errors.rejectValue("storeNo", "badStoreNo");
				
			}
		}
		
		// 계좌번호 정규식
		if(jumjuJoinCommand.getStoreOwnerAccount() == null || jumjuJoinCommand.getStoreOwnerAccount().trim().isEmpty() ) {
			errors.rejectValue("storeOwnerAccount", "required");
		
		}else {
			Matcher matcher = accountPattern.matcher(jumjuJoinCommand.getStoreOwnerAccount() ); 
			if(!matcher.matches()) {
				errors.rejectValue("storeOwnerAccount", "badAccount");
				
			}
		}
		
		// 핸드폰 번호 정규식
		if(jumjuJoinCommand.getStoreOwnerPhone() == null || jumjuJoinCommand.getStoreOwnerPhone().trim().isEmpty() ) {
			errors.rejectValue("storeOwnerPhone", "required");

		}else {
			Matcher matcher = phonePattern.matcher(jumjuJoinCommand.getStoreOwnerPhone() ); 
			if(!matcher.matches()) {
				errors.rejectValue("storeOwnerPhone", "badPhone");

			}
		}
		
		// 계약 일자 정규식
		if(jumjuJoinCommand.getStoreContractDay() == null || jumjuJoinCommand.getStoreContractDay().trim().isEmpty()) {
			errors.rejectValue("storeContractDay", "required");
			
		}else {
			Matcher matcher = contractDayPattern.matcher(jumjuJoinCommand.getStoreContractDay() ); 
			if(!matcher.matches()) {
				errors.rejectValue("storeContractDay", "badContract");
				
			}
		}
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerName", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerPw", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jjPwCon", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeNo", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerBank", "required");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerAccount", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerPhone", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "storeOwnerAddr", "required");
		
		if(!jumjuJoinCommand.getStoreOwnerPw().isEmpty() ){
			if(!jumjuJoinCommand.pwEqualsPwcon() ) {
				errors.rejectValue("jjPwCon", "pwMatch");
			}
		}
		
	}

	
}
