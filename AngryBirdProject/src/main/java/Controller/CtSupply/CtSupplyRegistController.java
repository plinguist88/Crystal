package Controller.CtSupply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.CtSupplyRegistCommand;
import Service.CtSupply.CtSupplyRegistService;
import Validator.CtSupplyRegistCommandValidator;

@Controller
public class CtSupplyRegistController {
	@Autowired
	CtSupplyRegistService ctSupplyRegistService;
	@RequestMapping("/ctSupplyRegist")
	public String ctSupplyRegist(CtSupplyRegistCommand ctSupplyRegistCommand) {
		System.out.println("ctSupplyRegist...");
		return "ctSupply/ctSupplyRegist";
	}
	@RequestMapping("/ctSupplyRegistPro")
	public String supplyCompanyRegistPro(CtSupplyRegistCommand ctSupplyRegistCommand, Errors errors) {
		System.out.println("ctSupplyRegistPro...");
		new CtSupplyRegistCommandValidator().validate(ctSupplyRegistCommand, errors);
		System.out.println("ctSupplyRegistCommandValidator...");
		if(errors.hasErrors()) {
			System.out.println("ctSupplyRegistCommandValidator hasErrors...");
			return "ctSupply/ctSupplyRegist";
		}
		Integer result = ctSupplyRegistService.ctSupplyRegist(ctSupplyRegistCommand);
		System.out.println("ctSupplyRegistService...");
		if(result == null) {
			return "ctSupply/ctSupplyRegist";
		}
		return "redirect:ctSupplyList";
	}
}
