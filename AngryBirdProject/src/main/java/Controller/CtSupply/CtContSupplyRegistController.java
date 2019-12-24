package Controller.CtSupply;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.CtContSupplyRegistCommand;
import Service.CtSupply.CtContSupplyRegistService;
import Validator.CtContSupplyRegistCommandValidator;

@Controller
public class CtContSupplyRegistController {
	@Autowired
	CtContSupplyRegistService ctContSupplyRegistService;
	@RequestMapping(value = "/ctContSupplyRegist", method=RequestMethod.GET)
	public String ctContSupplyRegist(CtContSupplyRegistCommand ctContSupplyRegistCommand) {	
		return "ctSupply/ctContSupplyRegist";
	}
	@RequestMapping(value="/ctContSupplyRegistPro", method=RequestMethod.POST)
	public String ctContSupplyRegistPro(CtContSupplyRegistCommand ctContSupplyRegistCommand, HttpSession session, Errors errors) {
		new CtContSupplyRegistCommandValidator().validate(ctContSupplyRegistCommand, errors);
		System.out.println("ctContSupplyRegistCommandValidator...");
		if(errors.hasErrors()) {
			System.out.println("ctContSupplyRegistCommandValidator hasErrors...");
			return "ctSupply/ctContSupplyRegist";
		}
		Integer result = ctContSupplyRegistService.ctContSupplyRegist(ctContSupplyRegistCommand, session);
		System.out.println("ctContSupplyRegistService...");
		if(result == null) {
			return "ctSupply/ctContSupplyRegist";
		}
		return "redirect:ctContSupplyList";
	}
}
