package Controller.Cafeteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.SupplyCompanyRegistCommand;
import Service.SupplyCompanyRegist.SupplyCompanyRegistService;
import Validator.SupplyCompanyCommandValidator;



@Controller
public class SupplyCompanyRegistController {
	@Autowired
	SupplyCompanyRegistService supplyCompanyRegistService;
	
	@RequestMapping("/cafeteria/supplyCompanyRegist")
	public String supplyCompanyRegist(SupplyCompanyRegistCommand supplyCompanyRegistCommand, Errors errors) {
		
		new SupplyCompanyCommandValidator().validate(supplyCompanyRegistCommand, errors);
		if(errors.hasErrors()) {
			return "cafeteria/supplyCompanyRegist";
		}
		Integer result = supplyCompanyRegistService.join(supplyCompanyRegistCommand);
		if(result == null) {
			errors.rejectValue("userId", "duplicate");
			return "cafeteria/supplyCompanyRegist";
		}
		return "cafeteriaMain";
	}
}
