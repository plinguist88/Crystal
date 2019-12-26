package Controller.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.CarRequestCommand;
import Command.JoinCommand;
import Service.Car.CarRequestService;
import Validator.JoinCommandValidator;

@Controller
public class CarController {
	@Autowired
	CarRequestService carRequestService; 
	
	//CAR 예약신청서 작성 페이지
	@RequestMapping(value = "/carRequest", method = RequestMethod.GET)
	public String carRequest(CarRequestCommand carRequestCommand, Model model) {
		return "car/carRequest";
	}
	
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String joinAction (CarRequestCommand carRequestCommand, Model model) {
		
		carRequestService.cars(model);
		/*new JoinCommandValidator().validate(carRequestCommand, errors);
		if (errors.hasErrors() ) {
			
			return "join/joinForm";
		}*/
		carRequestService.join(carRequestCommand);
		
		/*Integer result = carRequestService.join(carRequestCommand);
		if (result == null) {
			
			errors.rejectValue("employeeNum", "duplicate");
			return "join/joinForm";
		}*/
		return "redirect:/main";
	}
}
